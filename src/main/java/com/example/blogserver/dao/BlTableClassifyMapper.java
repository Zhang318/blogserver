package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableClassify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableClassifyMapper {
    int deleteByPrimaryKey(String categoryId);

    int insert(BlTableClassify record);

    int insertSelective(BlTableClassify record);

    BlTableClassify selectByPrimaryKey(String categoryId);

    int updateByPrimaryKeySelective(BlTableClassify record);

    int updateByPrimaryKey(BlTableClassify record);
}