package com.example.blogserver.service;

import com.example.blogserver.model.entity.Tag;

import java.util.List;

/**
 * @author 张鑫
 * @date 2020/1/2 3:03
 * @description
 */
public interface TagService {
    List<Tag> getAllTags();
    int addTag(Tag tag);
}
