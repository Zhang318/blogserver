package com.example.blogserver.dao;


import com.example.blogserver.model.dto.AccountAndPasswordDto;
import com.example.blogserver.model.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper {
    int deleteByPrimaryKey(String aid);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(String account);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    AccountAndPasswordDto selectByAccount(String account);
}