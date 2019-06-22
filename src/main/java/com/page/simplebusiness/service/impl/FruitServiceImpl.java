package com.page.simplebusiness.service.impl;

import com.page.simplebusiness.dto.Fruit;
import com.page.simplebusiness.dto.UploadEvent;
import com.page.simplebusiness.entity.FruitEntity;
import com.page.simplebusiness.mapper.FruitMapper;
import com.page.simplebusiness.service.FruitService;
import com.page.simplebusiness.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    @Autowired
    private FruitMapper fruitMapper;

    @Override
    public void addFruit(UploadEvent event, String originalName, String savePath) {
        FruitEntity entity = buildFruitEntity(event, originalName, savePath);
        fruitMapper.addFruit(entity);

    }

    @Override
    public List<Fruit> queryAllFruits() {
        List<FruitEntity> fruitEntityList = fruitMapper.queryAllFruits();
        if (CollectionUtils.isEmpty(fruitEntityList)) {
            return null;
        }
        List<Fruit> fruitList = new ArrayList<>();
        for (FruitEntity entity : fruitEntityList) {
            Fruit fruit = new Fruit();
            BeanUtils.copyProperties(entity, fruit);
            fruitList.add(fruit);
        }
        return fruitList;
    }

    private FruitEntity buildFruitEntity(UploadEvent event, String originalName, String savePath) {
        FruitEntity entity = new FruitEntity();
        entity.setFruitName(event.getFruitName());
        entity.setFruitDesc(event.getDescription());
        entity.setOriginalName(originalName);
        entity.setSavePath(savePath);
        entity.setCreateTime(DateUtils.getCurrentTimestamp());
        return entity;
    }
}
