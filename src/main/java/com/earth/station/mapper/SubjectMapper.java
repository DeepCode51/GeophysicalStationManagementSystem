package com.earth.station.mapper;

import com.earth.station.model.Subject;
import com.earth.station.model.SubjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    long countByExample(SubjectCriteria example);

    int deleteByExample(SubjectCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExampleWithBLOBs(SubjectCriteria example);

    List<Subject> selectByExample(SubjectCriteria example);

    Subject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectCriteria example);

    int updateByExampleWithBLOBs(@Param("record") Subject record, @Param("example") SubjectCriteria example);

    int updateByExample(@Param("record") Subject record, @Param("example") SubjectCriteria example);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKeyWithBLOBs(Subject record);

    int updateByPrimaryKey(Subject record);

    void batchInsert(@Param("items") List<Subject> items);
}