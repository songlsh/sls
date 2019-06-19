package com.spring_mybatis.test.dao;


import com.spring_mybatis.test.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {

    public Employee findById(int id);

    public  List<Employee> selectAll();

    public void addEmp(Employee employee);
}
