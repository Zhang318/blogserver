package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(BlTableUser record);

    int insertSelective(BlTableUser record);

    BlTableUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(BlTableUser record);

    int updateByPrimaryKey(BlTableUser record);
}