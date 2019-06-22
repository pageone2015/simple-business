package com.page.simplebusiness.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.page.simplebusiness.constant.ErrorCode;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResponseData {

    private String code;

    private String desc;

    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResponseData getSuccessResponse()
    {
        ResponseData responseData = new ResponseData();
        responseData.setCode("0");
        responseData.setDesc("Operation Successfully.");
        return responseData;
    }

    public static ResponseData getResponse(ErrorCode errorCode)
    {
        ResponseData responseData = new ResponseData();
        responseData.setCode(errorCode.getCode());
        responseData.setDesc(errorCode.getDesc());
        return responseData;
    }

    public static ResponseData getResponse(String code, String desc)
    {
        ResponseData responseData = new ResponseData();
        responseData.setCode(code);
        responseData.setDesc(desc);
        return responseData;
    }
}
