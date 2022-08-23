package com.my.usercenter.model.domain.request;

import lombok.Data;

@Data
public class BaseSettingRequest {
    private String username;
    private String gender;
    private String phone;
    private String email;
}
