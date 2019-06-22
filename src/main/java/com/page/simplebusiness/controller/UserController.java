package com.page.simplebusiness.controller;

import com.page.simplebusiness.dto.IsUserValidResponse;
import com.page.simplebusiness.dto.ResponseData;
import com.page.simplebusiness.dto.User;
import com.page.simplebusiness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/isUserValid")
    @ResponseBody
    public ResponseData isUserValid(@RequestBody User user)
    {
        ResponseData response = ResponseData.getSuccessResponse();
        boolean flag = userService.isUserValid(user);
        IsUserValidResponse isUserValidResponse = new IsUserValidResponse();
        isUserValidResponse.setFlag(flag);
        isUserValidResponse.setUsername(user.getUserName());
        response.setData(isUserValidResponse);
        return response;
    }
}
