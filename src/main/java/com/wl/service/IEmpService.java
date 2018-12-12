package com.wl.service;

import com.wl.entity.Emp;

import java.util.List;
import java.util.Map;


public interface IEmpService {

	Map getAllEmp(Map<String, Object> query);

	int addOne(Emp emp);
}
