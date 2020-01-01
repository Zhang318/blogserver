package com.example.blogserver.model.dto;

/**
 * @author 张鑫
 * @date 2020/1/1 20:50
 * @description
 */
public class AccountAndPasswordDto {
    String account;
    String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
