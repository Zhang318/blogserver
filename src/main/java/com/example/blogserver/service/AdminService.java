package com.example.blogserver.service;

import com.example.blogserver.model.entity.Admin;

/**
 * @author 张鑫
 * @date 2020/1/1 20:52
 * @description
 */
public interface AdminService {
    int deleteByPrimaryKey(String aid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String account);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}
