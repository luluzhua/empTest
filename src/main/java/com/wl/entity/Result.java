/**
 * @program: VueSpringboot
 * @description: 前后台数据库操作返回信息模型
 * @author: 王璐
 * @create: 2018-12-08 09:53
 **/

package com.wl.entity;

public class Result {

    /**
     * 0成功,1失败
     */
    private int retStatus = 0;

    /**
     * 返回提示信息
     */
    private String message;

    /**
     * 返回内容
     */
    private Object obj;

    public Result() {
    }

    public Result(int retStatus, String message, Object obj) {
        this.retStatus = retStatus;
        this.message = message;
        this.obj = obj;
    }

    public int getRetStatus() {
        return retStatus;
    }

    public void setRetStatus(int retStatus) {
        this.retStatus = retStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
