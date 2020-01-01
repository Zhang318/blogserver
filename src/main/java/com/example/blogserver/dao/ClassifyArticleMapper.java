package com.example.blogserver.dao;


import com.example.blogserver.model.entity.ClassifyArticle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClassifyArticleMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClassifyArticle record);

    int insertSelective(ClassifyArticle record);

    ClassifyArticle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClassifyArticle record);

    int updateByPrimaryKey(ClassifyArticle record);
}