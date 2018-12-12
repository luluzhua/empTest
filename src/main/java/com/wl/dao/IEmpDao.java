package com.wl.dao;

import java.util.List;
import java.util.Map;

import com.wl.entity.Emp;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IEmpDao {

     List<Emp> getAllEmp(Map<String, Object> query);

     int getTotal();

     int addOne(Emp emp);

}
