package com.example.blogserver.controller;

import com.example.blogserver.service.ClassifyService;
import com.example.blogserver.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张鑫
 * @date 2020/1/2 2:55
 * @description
 */
@RestController
@CrossOrigin
@RequestMapping("/classify")
public class ClassifyController {
    @Autowired
    ClassifyService service;

    @GetMapping("/getAll")
    public JsonResult getAllCalssify(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.getAllList());
        jsonResult.setMessage("获取成功");
        return jsonResult;
    }
}
