package com.song.dao;

import com.song.model.TblUserTest;
import com.song.model.TblUserTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblUserTestMapper {
    int countByExample(TblUserTestExample example);

    int deleteByExample(TblUserTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblUserTest record);

    int insertSelective(TblUserTest record);

    List<TblUserTest> selectByExample(TblUserTestExample example);

    TblUserTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblUserTest record, @Param("example") TblUserTestExample example);

    int updateByExample(@Param("record") TblUserTest record, @Param("example") TblUserTestExample example);

    int updateByPrimaryKeySelective(TblUserTest record);

    int updateByPrimaryKey(TblUserTest record);
}