package com.wl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.wl.dao.IEmpDao;
import com.wl.entity.Emp;
import com.wl.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpServiceImpl implements IEmpService{

	@Autowired
	private IEmpDao dao;

	@Override
	public Map getAllEmp(Map<String,Object> query) {

		Map map = new HashMap();
		map.put("rowList",dao.getAllEmp(query));
		map.put("totalRow",dao.getTotal());
		return map;
	}

    @Override
	public int addOne(Emp emp) {

		return dao.addOne(emp);
	}

}
