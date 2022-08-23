package com.my.usercenter.model.domain.request;

import lombok.Data;

//没有实现Serializable
@Data
public class UserRegisterRequest{
    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
