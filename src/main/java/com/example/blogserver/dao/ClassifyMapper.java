package com.example.blogserver.dao;


import com.example.blogserver.model.entity.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClassifyMapper {
    int deleteByPrimaryKey(String categoryId);

    int insert(Classify record);

    int insertSelective(Classify record);

    Classify selectByPrimaryKey(String categoryId);

    int updateByPrimaryKeySelective(Classify record);

    int updateByPrimaryKey(Classify record);
}