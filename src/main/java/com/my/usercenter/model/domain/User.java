package com.my.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Getter
@Setter
public class User implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String userAccount;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private Integer userStatus;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    @TableLogic
    private Integer idDelete;

    private Integer userRole;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ",username='" + username + '\'' +
                ",userAccount='" + userAccount + '\'' +
                ",gender=" + gender +
                ",phone='" + phone + '\'' +
                ",email='" + email + '\'' +
                ",userStatus=" + userStatus +
                ",createTime=" + createTime +
                ",userRole=" + userRole +
                '}';
    }
}