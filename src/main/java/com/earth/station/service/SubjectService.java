package com.earth.station.service;

import static com.earth.station.common.constant.SubjectConstant.AID;
import static com.earth.station.common.constant.SubjectConstant.DEFORMATION;
import static com.earth.station.common.constant.SubjectConstant.GNSS;
import static com.earth.station.common.constant.SubjectConstant.GRAVITY;
import static com.earth.station.common.constant.SubjectConstant.LIQUID;
import static com.earth.station.common.constant.SubjectConstant.STRONG_EQ;
import static com.earth.station.common.constant.SubjectConstant.TEST_EQ;
import static com.earth.station.common.constant.SubjectConstant.TM;

import com.earth.station.mapper.SubjectMapper;
import com.earth.station.model.Station;
import com.earth.station.model.Subject;
import com.earth.station.model.SubjectCriteria;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description SubectService
 * @Author yeyu
 * @Date 2020/5/23
 */
@Service
public class SubjectService {

    @Resource
    private SubjectMapper subjectMapper;
    @Resource
    private StationService stationService;

    @Transactional(rollbackFor = Exception.class)
    public void save(Subject subject) {
        Station station = stationService.getById(subject.getStationId());
        if (station == null) {
            return;
        }
        subjectMapper.insertSelective(subject);
        setStationSubject(station, subject.getType(), subject.getId());
        stationService.update(station);
    }
    
    private void setStationSubject(Station station, Integer type, Integer subjectId) {

        if (TEST_EQ.equals(type)) {
            station.setTestEq(subjectId);
        }else if (STRONG_EQ.equals(type)) {
            station.setStrongEq(subjectId);
        } else if (GNSS.equals(type)) {
            station.setGnss(subjectId);
        } else if (GRAVITY.equals(type)) {
            station.setGravity(subjectId);
        } else if (AID.equals(type)) {
            station.setAid(subjectId);
        } else if (DEFORMATION.equals(type)) {
            station.setDeformation(subjectId);
        } else if (LIQUID.equals(type)) {
            station.setLiquid(subjectId);
        } else if (TM.equals(type)) {
            station.setTm(subjectId);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteByStationId(Integer stationId) {
        SubjectCriteria example = new SubjectCriteria();
        example.createCriteria().andStationIdEqualTo(stationId);
        subjectMapper.deleteByExample(example);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Integer id) {
        Subject subject = getById(id);
        Station station = stationService.getById(subject.getStationId());
        setStationSubject(station, subject.getType(), 0);
        stationService.update(station);
        subjectMapper.deleteByPrimaryKey(id);
    }

    public Subject getById(Integer id) {
        return subjectMapper.selectByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void update(Subject subject) {
        subjectMapper.updateByPrimaryKeySelective(subject);
    }
}