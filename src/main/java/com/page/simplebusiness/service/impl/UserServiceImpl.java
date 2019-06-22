package com.page.simplebusiness.service.impl;

import com.page.simplebusiness.dto.User;
import com.page.simplebusiness.entity.BcUserEntity;
import com.page.simplebusiness.mapper.BcUserMapper;
import com.page.simplebusiness.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BcUserMapper bcUserMapper;

    @Override
    public boolean isUserValid(User user) {
        BcUserEntity queryEntity = new BcUserEntity();
        BeanUtils.copyProperties(user, queryEntity);
        BcUserEntity resultEntity = bcUserMapper.getByNameAndPassword(queryEntity);
        return null != resultEntity;
    }

}
