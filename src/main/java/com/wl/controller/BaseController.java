/**
 * @program: VueSpringboot
 * @description: 基础类
 * @author: 王璐
 * @create: 2018-12-08 09:49
 **/

package com.wl.controller;

import com.wl.entity.Result;

public class BaseController {

    /**
     * @Description: 返回带提示信息的成功消息
     * @Author: 王璐
     * @Date: 2018/12/8
    */
   public Result returnSuccessInfo(String message){
       Result result = new Result();
       result.setRetStatus(0);
       result.setMessage(message);
       return  result;
   }
   /**
    * @Description: 返回成功消息,带提示信息和返回内容
    * @Author: 王璐
    * @Date: 2018/12/8
   */
   public Result returnSuccessInfo(String message,Object obj){
       Result result = new Result();
       result.setRetStatus(0);
       result.setMessage(message);
       result.setObj(obj);
       return result;
   }
   /**
    * @Description: 返回带提示信息的失败消息
    * @Author: 王璐
    * @Date: 2018/12/8
   */
   public Result returnErrorInfo(String message){
       Result result = new Result();
       result.setRetStatus(1);
       result.setMessage(message);
       return  result;
   }
   /**
    * @Description: 返回失败消息,带提示消息和返回对象
    * @Author: 王璐
    * @Date: 2018/12/8
   */
   public Result returnErrorInfo(String message,Object obj){
       Result result = new Result();
       result.setRetStatus(1);
       result.setMessage(message);
       result.setObj(obj);
       return result;
   }
}
