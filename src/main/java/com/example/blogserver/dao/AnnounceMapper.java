package com.example.blogserver.dao;


import com.example.blogserver.model.entity.Announce;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AnnounceMapper {
    int deleteByPrimaryKey(String id);

    int insert(Announce record);

    int insertSelective(Announce record);

    Announce selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Announce record);

    int updateByPrimaryKeyWithBLOBs(Announce record);

    int updateByPrimaryKey(Announce record);
}