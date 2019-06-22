package com.page.simplebusiness.service.impl;

import com.page.simplebusiness.dto.QueryVoteResponse;
import com.page.simplebusiness.dto.SatisfyRateEvent;
import com.page.simplebusiness.entity.VoteEntity;
import com.page.simplebusiness.mapper.VoteMapper;
import com.page.simplebusiness.service.VoteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteMapper voteMapper;

    @Override
    public void satisfyRate(SatisfyRateEvent event) {
        VoteEntity entity = buildVoteEntity(event);
        voteMapper.satisfyRate(entity);
    }

    @Override
    public QueryVoteResponse queryVote(String userName) {
        QueryVoteResponse response = new QueryVoteResponse();
        VoteEntity entity1 = new VoteEntity();
        entity1.setUserName(userName);
        List<VoteEntity> entityList = voteMapper.queryVote(entity1);
        if (CollectionUtils.isEmpty(entityList)) {
            return null;
        }
        BeanUtils.copyProperties(entityList.get(0), response);
        return response;
    }

    private VoteEntity buildVoteEntity(SatisfyRateEvent event) {
        VoteEntity entity = new VoteEntity();
        BeanUtils.copyProperties(event, entity);
        return entity;
    }
}
