package com.example.blogserver.service;

import com.example.blogserver.model.entity.Classify;

import java.util.List;

/**
 * @author 张鑫
 * @date 2020/1/2 2:56
 * @description
 */
public interface ClassifyService {
    int deleteByPrimaryKey(String categoryId);


    int insertSelective(Classify record);

    Classify selectByPrimaryKey(String categoryId);

    int updateByPrimaryKeySelective(Classify record);

    List<Classify> getAllList();
}
