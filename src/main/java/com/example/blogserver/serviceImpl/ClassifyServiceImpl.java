package com.example.blogserver.serviceImpl;

import com.example.blogserver.dao.ClassifyMapper;
import com.example.blogserver.model.entity.Classify;
import com.example.blogserver.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张鑫
 * @date 2020/1/2 2:56
 * @description
 */

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    ClassifyMapper mapper;

    @Override
    public int deleteByPrimaryKey(String categoryId) {
        return 0;
    }

    @Override
    public int insertSelective(Classify record) {
        return 0;
    }

    @Override
    public Classify selectByPrimaryKey(String categoryId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Classify record) {
        return 0;
    }

    @Override
    public List<Classify> getAllList() {
        return mapper.getAllList();
    }
}
