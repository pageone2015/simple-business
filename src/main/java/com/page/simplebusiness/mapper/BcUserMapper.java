package com.page.simplebusiness.mapper;


import com.page.simplebusiness.entity.BcUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BcUserMapper {

    void add(BcUserEntity user);

    void delete(Long id);

    BcUserEntity get(Long id);

    void update(BcUserEntity user);

    List<BcUserEntity> list();

    BcUserEntity getByNameAndPassword(BcUserEntity queryEntity);
}
