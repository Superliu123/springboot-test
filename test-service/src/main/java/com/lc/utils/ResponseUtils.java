package com.lc.utils;

import com.lc.enums.SystemMessageEnums;
import lombok.Data;

/**
 * @description: 控制层统一返回数据bean
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 21:14
 */
@Data
public class ResponseUtils<T> {


    private String code;

    private String msg;

    private T data;

    private ResponseUtils(String code, String msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseUtils ok(SystemMessageEnums systemMessageEnums) {
        return new ResponseUtils<>(SystemMessageEnums.SUCCESS.getCode(), systemMessageEnums.getMsg(), null);
    }

    public static<T> ResponseUtils ok (T data) {
        return new ResponseUtils<>(SystemMessageEnums.SUCCESS.getCode(), "", data);
    }

    public static<T> ResponseUtils ok(T data, SystemMessageEnums systemMessageEnums){
        return new ResponseUtils<>(SystemMessageEnums.SUCCESS.getCode(), systemMessageEnums.getMsg(), data);
    }

    public static ResponseUtils warn(SystemMessageEnums systemMessageEnums){
        return new ResponseUtils<>(SystemMessageEnums.FAIL.getCode(), systemMessageEnums.getMsg(), null);
    }
}
