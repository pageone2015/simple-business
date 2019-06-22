package com.page.simplebusiness.constant;

public enum ErrorCode {

    ADD_USER_FAILED("0001", "add user failed."),

    SYS_ERROR("9999", "system error.");

    private String code;

    private String desc;

    ErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
