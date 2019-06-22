package com.page.simplebusiness.controller;

import com.page.simplebusiness.dto.*;
import com.page.simplebusiness.service.VoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vote")
public class VoteController {

    private static Logger logger = LoggerFactory.getLogger(VoteController.class);

    @Autowired
    private VoteService voteService;

    @RequestMapping("/satisfyRate")
    public ResponseData satisfyRate(@RequestBody SatisfyRateEvent event)
    {
        ResponseData response = ResponseData.getSuccessResponse();
        voteService.satisfyRate(event);
        return response;
    }

    @RequestMapping("/queryVote")
    public ResponseData queryVote(@RequestBody QueryVoteEvent event)
    {
        ResponseData response = ResponseData.getSuccessResponse();
        QueryVoteResponse queryVoteResponse = voteService.queryVote(event.getUserName());
        response.setData(queryVoteResponse);
        return response;
    }


}
