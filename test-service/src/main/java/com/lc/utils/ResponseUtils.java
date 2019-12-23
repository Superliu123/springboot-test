package com.lc.utils;

import lombok.Data;

/**
 * @description: 控制层统一返回数据bean
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 21:14
 */
@Data
public class ResponseUtils<T> {

    private static final String SUCCESS = "200";

    private static final String FAIL = "500";

    private String code;

    private String msg;

    private T data;

    public ResponseUtils(String code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static<T> ResponseUtils ok(T data, String msg){
        return new ResponseUtils<>(SUCCESS, msg, data);
    }

    public static ResponseUtils warn(String msg){
        return new ResponseUtils<>(FAIL,msg, null);
    }
}
