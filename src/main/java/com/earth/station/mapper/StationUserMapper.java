package com.earth.station.mapper;

import com.earth.station.model.StationUser;
import com.earth.station.model.StationUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationUserMapper {
    long countByExample(StationUserCriteria example);

    int deleteByExample(StationUserCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(StationUser record);

    int insertSelective(StationUser record);

    List<StationUser> selectByExample(StationUserCriteria example);

    StationUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StationUser record, @Param("example") StationUserCriteria example);

    int updateByExample(@Param("record") StationUser record, @Param("example") StationUserCriteria example);

    int updateByPrimaryKeySelective(StationUser record);

    int updateByPrimaryKey(StationUser record);

    void batchInsert(@Param("items") List<StationUser> items);
}