package com.example.blogserver.serviceImpl;

import com.example.blogserver.dao.TagMapper;
import com.example.blogserver.model.entity.Tag;
import com.example.blogserver.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张鑫
 * @date 2020/1/2 3:03
 * @description
 */
@Service
public class TagServiceImpl implements TagService {

    @Autowired
    TagMapper mapper;
    @Override
    public List<Tag> getAllTags() {
        return mapper.getAll();
    }

    @Override
    public int addTag(Tag tag) {
        return mapper.insert(tag);
    }
}
