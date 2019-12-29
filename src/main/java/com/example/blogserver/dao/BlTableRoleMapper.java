package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableRoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(BlTableRole record);

    int insertSelective(BlTableRole record);

    BlTableRole selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BlTableRole record);

    int updateByPrimaryKey(BlTableRole record);
}