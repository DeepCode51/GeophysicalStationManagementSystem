package com.earth.station.service;

import com.earth.station.common.constant.SubjectConstant;
import com.earth.station.mapper.StationMapper;
import com.earth.station.model.Station;
import com.earth.station.model.StationCriteria;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description StationService
 * @Author yeyu
 * @Date 2020/5/23
 */
@Service
public class StationService {

    @Resource
    private StationMapper stationMapper;
    @Resource
    private SubjectService subjectService;

    public List<Station> search(String name, Integer subject) {
        StationCriteria example = new StationCriteria();
        StationCriteria.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (SubjectConstant.AID.equals(subject)) {
            criteria.andAidNotEqualTo(0);
        } else if (SubjectConstant.DEFORMATION.equals(subject)) {
            criteria.andDeformationNotEqualTo(0);
        } else if (SubjectConstant.GNSS.equals(subject)) {
            criteria.andGnssNotEqualTo(0);
        } else if (SubjectConstant.GRAVITY.equals(subject)) {
            criteria.andGravityNotEqualTo(0);
        } else if (SubjectConstant.LIQUID.equals(subject)) {
            criteria.andLiquidNotEqualTo(0);
        } else if (SubjectConstant.STRONG_EQ.equals(subject)) {
            criteria.andStrongEqNotEqualTo(0);
        } else if (SubjectConstant.TEST_EQ.equals(subject)) {
            criteria.andTestEqNotEqualTo(0);
        } else if (SubjectConstant.TM.equals(subject)) {
            criteria.andTmNotEqualTo(0);
        }
        return stationMapper.selectByExample(example);
    }

    public void save(Station station) {
        stationMapper.insertSelective(station);
    }

    public Station getById(Integer id) {
        return stationMapper.selectByPrimaryKey(id);
    }

    public void update(Station station) {
        if (station == null || station.getId() == null || station.getId() ==0) {
            return;
        }
        stationMapper.updateByPrimaryKeySelective(station);
    }

    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        stationMapper.deleteByPrimaryKey(id);
        subjectService.deleteByStationId(id);
    }
}