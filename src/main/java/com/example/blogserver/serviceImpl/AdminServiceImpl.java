package com.example.blogserver.serviceImpl;

import com.example.blogserver.dao.AdminMapper;
import com.example.blogserver.model.dto.AccountAndPasswordDto;
import com.example.blogserver.model.entity.Admin;
import com.example.blogserver.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张鑫
 * @date 2020/1/1 20:52
 * @description
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public int deleteByPrimaryKey(String aid) {
        return 0;
    }

    @Override
    public int insert(Admin record) {
        return 0;
    }

    @Override
    public int insertSelective(Admin record) {
        return 0;
    }

    @Override
    public Admin selectByPrimaryKey(String account) {

        return adminMapper.selectByPrimaryKey(account);
    }

    @Override
    public int updateByPrimaryKeySelective(Admin record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Admin record) {
        return 0;
    }

}
