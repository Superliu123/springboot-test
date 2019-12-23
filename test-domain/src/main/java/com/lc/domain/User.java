package com.lc.domain;

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

    private String uuid;

    private String admin;

    private String password;
}
