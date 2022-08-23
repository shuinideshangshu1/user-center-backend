package com.my.usercenter.service;

import com.my.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @author 13696
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-06-16 21:24:53
*/
public interface UserService extends IService<User> {

    long userRegister(String userAccount,String userPassword,String checkPassword);

    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    User getSafetyUser(User originUser);

    int userLogout(HttpServletRequest request, HttpServletResponse response);

    boolean baseSetting(HttpServletRequest request,String username, String gender, String phone, String email);
}
