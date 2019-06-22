package com.page.simplebusiness.mapper;


import com.page.simplebusiness.entity.VoteEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VoteMapper {

    void satisfyRate(VoteEntity entity);

    List<VoteEntity> queryVote(VoteEntity entity);
}
