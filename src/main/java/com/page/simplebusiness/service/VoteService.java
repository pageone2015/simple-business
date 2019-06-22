package com.page.simplebusiness.service;

import com.page.simplebusiness.dto.QueryVoteResponse;
import com.page.simplebusiness.dto.SatisfyRateEvent;

public interface VoteService {
    void satisfyRate(SatisfyRateEvent event);

    QueryVoteResponse queryVote(String userName);
}
