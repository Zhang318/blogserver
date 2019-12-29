package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableClassifyArticle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableClassifyArticleMapper {
    int deleteByPrimaryKey(String id);

    int insert(BlTableClassifyArticle record);

    int insertSelective(BlTableClassifyArticle record);

    BlTableClassifyArticle selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BlTableClassifyArticle record);

    int updateByPrimaryKey(BlTableClassifyArticle record);
}