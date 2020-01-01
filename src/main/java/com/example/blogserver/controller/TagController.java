package com.example.blogserver.controller;

import com.example.blogserver.model.entity.Tag;
import com.example.blogserver.service.TagService;
import com.example.blogserver.utils.GenerateId;
import com.example.blogserver.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张鑫
 * @date 2020/1/2 3:02
 * @description
 */
@RestController
@CrossOrigin
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagService service;

    @GetMapping("/getAll")
    public JsonResult getAllTags(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(service.getAllTags());
        return jsonResult;
    }

    @PostMapping("/add")
    public JsonResult addTag(String tag){
        Tag tag1= new Tag();
        tag1.setTagId(GenerateId.getId());
        tag1.setTagName(tag);
        JsonResult jsonResult = new JsonResult();
        int success = service.addTag(tag1);
        if (success>0) {
            jsonResult.setMessage("添加成功");
            jsonResult.setCode(200);
        }else {
            jsonResult.setCode(500);
            jsonResult.setMessage("添加失败！");
        }
        return jsonResult;
    }

}
