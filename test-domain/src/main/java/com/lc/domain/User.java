package com.lc.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: user
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-06 18:44
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("管理员账号")
    private String admin;

    @ApiModelProperty("管理员密码")
    private String password;
}
