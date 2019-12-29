package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableAdminMapper {
    int deleteByPrimaryKey(String aid);

    int insert(BlTableAdmin record);

    int insertSelective(BlTableAdmin record);

    BlTableAdmin selectByPrimaryKey(String aid);

    int updateByPrimaryKeySelective(BlTableAdmin record);

    int updateByPrimaryKey(BlTableAdmin record);
}