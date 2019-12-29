package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableReply;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableReplyMapper {
    int deleteByPrimaryKey(String id);

    int insert(BlTableReply record);

    int insertSelective(BlTableReply record);

    BlTableReply selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BlTableReply record);

    int updateByPrimaryKey(BlTableReply record);
}