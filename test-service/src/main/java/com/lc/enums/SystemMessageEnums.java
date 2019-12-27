package com.lc.enums;

public enum SystemMessageEnums {

    SUCCESS("1000", "成功"),
    FAIL("1001","失败"),
    DATA_IS_NULL("1000", "未查询到数据"),
    SYSTEM_ERROR("1002","服务器异常,请稍后重试");

    private String code;

    private String msg;

    SystemMessageEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
