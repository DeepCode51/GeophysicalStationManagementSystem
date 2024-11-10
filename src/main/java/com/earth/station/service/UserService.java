package com.earth.station.service;

import com.earth.station.mapper.StationUserMapper;
import com.earth.station.model.StationUser;
import com.earth.station.model.StationUserCriteria;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

/**
 * @Description UserService
 * @Author yeyu
 * @Date 2020/5/23
 */
@Service
public class UserService {
    @Resource
    private StationUserMapper stationUserMapper;

    public StationUser getByUserName(String userName) {
        if (StringUtils.isBlank(userName)) {
            return null;
        }

        StationUserCriteria example = new StationUserCriteria();
        example.createCriteria().andUserNameEqualTo(userName);
        List<StationUser> list = stationUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

    public StationUser getById(int id) {
        return stationUserMapper.selectByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void update(StationUser user) {
        if (user == null) {
            return;
        }
        stationUserMapper.updateByPrimaryKeySelective(user);
    }
}