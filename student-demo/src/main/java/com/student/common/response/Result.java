package com.student.common.response;

import javax.annotation.Resource;

/**
 * @author: wuchao
 * @date： 2017/5/2
 */
public class Result {

    private String msg;
    private String code;
    private Object data;

    public Result() {

    }

    public Result(String msg, String code, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
