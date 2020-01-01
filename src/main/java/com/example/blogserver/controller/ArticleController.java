package com.example.blogserver.controller;

import com.example.blogserver.utils.JsonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张鑫
 * @date 2020/1/1 20:05
 * @description
 */
@CrossOrigin
@RestController
@RequestMapping("/article")
public class ArticleController {
    //
    public JsonResult getArticle(){
      JsonResult jsonResult = new JsonResult();
      jsonResult.setCode(200);
      jsonResult.setMessage("成功");
      return jsonResult;
    }
}
