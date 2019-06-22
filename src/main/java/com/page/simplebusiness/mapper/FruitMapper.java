package com.page.simplebusiness.mapper;

import com.page.simplebusiness.entity.FruitEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FruitMapper {

    void addFruit(FruitEntity entity);

    List<FruitEntity> queryAllFruits();

}
