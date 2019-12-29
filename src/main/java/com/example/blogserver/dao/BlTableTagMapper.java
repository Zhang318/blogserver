package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableTag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableTagMapper {
    int deleteByPrimaryKey(String tagId);

    int insert(BlTableTag record);

    int insertSelective(BlTableTag record);

    BlTableTag selectByPrimaryKey(String tagId);

    int updateByPrimaryKeySelective(BlTableTag record);

    int updateByPrimaryKey(BlTableTag record);
}