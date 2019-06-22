package com.page.simplebusiness.service;

import com.page.simplebusiness.dto.Fruit;
import com.page.simplebusiness.dto.UploadEvent;

import java.util.List;

public interface FruitService {

    void addFruit(UploadEvent event, String originalName, String savePath);

    List<Fruit> queryAllFruits();

}
