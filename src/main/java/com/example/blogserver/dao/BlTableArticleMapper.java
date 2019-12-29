package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableArticle;
import com.example.blogserver.model.entity.BlTableArticleWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableArticleMapper {
    int deleteByPrimaryKey(String articleId);

    int insert(BlTableArticleWithBLOBs record);

    int insertSelective(BlTableArticleWithBLOBs record);

    BlTableArticleWithBLOBs selectByPrimaryKey(String articleId);

    int updateByPrimaryKeySelective(BlTableArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlTableArticleWithBLOBs record);

    int updateByPrimaryKey(BlTableArticle record);
}