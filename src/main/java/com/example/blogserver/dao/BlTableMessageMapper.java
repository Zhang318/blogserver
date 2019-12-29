package com.example.blogserver.dao;


import com.example.blogserver.model.entity.BlTableMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 张鑫
 */
@Mapper
@Repository
public interface BlTableMessageMapper {
    int deleteByPrimaryKey(String messageId);

    int insert(BlTableMessage record);

    int insertSelective(BlTableMessage record);

    BlTableMessage selectByPrimaryKey(String messageId);

    int updateByPrimaryKeySelective(BlTableMessage record);

    int updateByPrimaryKeyWithBLOBs(BlTableMessage record);

    int updateByPrimaryKey(BlTableMessage record);
}