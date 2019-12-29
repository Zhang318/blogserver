package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableAnnounce;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableAnnounceMapper {
    int deleteByPrimaryKey(String id);

    int insert(BlTableAnnounce record);

    int insertSelective(BlTableAnnounce record);

    BlTableAnnounce selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BlTableAnnounce record);

    int updateByPrimaryKeyWithBLOBs(BlTableAnnounce record);

    int updateByPrimaryKey(BlTableAnnounce record);
}