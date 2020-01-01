package com.example.blogserver.controller;

import com.example.blogserver.model.dto.AccountAndPasswordDto;
import com.example.blogserver.model.entity.Admin;
import com.example.blogserver.service.AdminService;
import com.example.blogserver.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 张鑫
 * @date 2020/1/1 20:48
 * @description
 */
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    AdminService adminService;
    @PostMapping("/login")
    public JsonResult login( AccountAndPasswordDto accountAndPasswordDto){
        JsonResult jsonResult = new JsonResult();
        Admin admin = adminService.selectByPrimaryKey(accountAndPasswordDto.getAccount());
        if (admin!=null){
            if (admin.getPassword().equals(accountAndPasswordDto.getPassword())){
                jsonResult.setCode(200);
                jsonResult.setMessage("登录成功！");
                jsonResult.setData(admin);

            }
        }else {
            jsonResult.setCode(500);
            jsonResult.setMessage("登录失败");
        }
        return jsonResult;
    }
}
