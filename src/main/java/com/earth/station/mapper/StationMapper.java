package com.earth.station.mapper;

import com.earth.station.model.Station;
import com.earth.station.model.StationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StationMapper {
    long countByExample(StationCriteria example);

    int deleteByExample(StationCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Station record);

    int insertSelective(Station record);

    List<Station> selectByExample(StationCriteria example);

    Station selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationCriteria example);

    int updateByExample(@Param("record") Station record, @Param("example") StationCriteria example);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);

    void batchInsert(@Param("items") List<Station> items);
}