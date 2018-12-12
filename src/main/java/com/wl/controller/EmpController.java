package com.wl.controller;

import java.util.*;

import com.wl.entity.Emp;
import com.wl.entity.Result;
import com.wl.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/roomInfo")
public class EmpController extends BaseController{

	@Autowired
	private IEmpService service;

	/**
	 * @Description:进入入口界面
	 * @Author: 王璐
	 * @Date: 2018/12/7
	*/
	@RequestMapping("/show")
	public String TheBegin(){
		return "ElementUI";
	}

	/**
	 * @Description: 获取所有的记录
	 * @Author: 王璐
	 * @Date: 2018/12/7
	*/
	@RequestMapping("/getAllrecord")
	@ResponseBody
	public Map getAllrecord(@RequestBody Map<String,Object> query) {
		Map allrecord = service.getAllEmp(query);
		return allrecord;
	}

    /**
     * @Description: 增加一条记录
     * @Author: 王璐
     * @Date: 2018/12/7
     */
    @RequestMapping("/add")
    @ResponseBody
    public Result addOne(@RequestBody Emp emp) {
		//返回更新的条数
		int c = service.addOne(emp);
		if(c>0){
			return returnSuccessInfo("添加成功!");
		}else{
			return returnErrorInfo("添加失败!");
		}
	}

}
