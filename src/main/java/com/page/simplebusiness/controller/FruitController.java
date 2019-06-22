package com.page.simplebusiness.controller;

import com.page.simplebusiness.constant.Constant;
import com.page.simplebusiness.dto.Fruit;
import com.page.simplebusiness.dto.ResponseData;
import com.page.simplebusiness.dto.UploadEvent;
import com.page.simplebusiness.service.FruitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private static Logger logger = LoggerFactory.getLogger(FruitController.class);

    @Autowired
    private FruitService fruitService;

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file, UploadEvent event) {
        logger.info("Example upload begin, the name is {}", event.getFruitName());
        String originalName = file.getOriginalFilename();
        String suffix = getSuffix(originalName);
        String filePath = "D:\\E\\test\\file\\";
        String newName = UUID.randomUUID().toString();
        String savePath = filePath + newName + suffix;
        try {
            file.transferTo(new File(savePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        fruitService.addFruit(event, originalName, savePath);
        return "success!";
    }

    @RequestMapping("/queryAllFruits")
    public ResponseData queryAllFruits() {
        ResponseData responseData = ResponseData.getSuccessResponse();
        List<Fruit> fruitList = fruitService.queryAllFruits();
        responseData.setData(fruitList);
        return responseData;
    }

    private String getSuffix(String originalName) {
        if (StringUtils.isEmpty(originalName)) {
            return Constant.EMPTY_STR;
        }
        String[] split = originalName.split("\\.");
        if (split.length > 1) {
            return "." + split[1];
        }
        return Constant.EMPTY_STR;
    }
}
