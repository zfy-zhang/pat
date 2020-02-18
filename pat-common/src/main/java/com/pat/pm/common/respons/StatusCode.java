package com.pat.pm.common.respons;
/**
 * @描述
 * @创建人 不才人
 * @创建时间 2020/2/17
 * @修改人和其它信息
 */

/**
 *@Description：通用响应状态码-Enum
 *@Author 不才人
 *@Create Date 2020/2/17 10:26 下午
 *@Modify
 */
public enum StatusCode {
    Success(0, "成功"),
    Fail(-1, "失败");

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
