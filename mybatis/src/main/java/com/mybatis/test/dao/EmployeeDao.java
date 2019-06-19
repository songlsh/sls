package com.mybatis.test.dao;

import com.mybatis.test.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {

    public void addEmp(Employee employee);
    public void modEmp(Employee emp);
    public void remEmp(int id);
    public Employee findById(int id);
    public Map<String,Object> returnMap(int id);

    //return object  parameter(use @param annotation another name)
    public Employee findOne( @Param("id") String id, @Param("name") String name);
    //return object  parameter(id ,object)
    public Employee findOneObject( @Param("id") String id,  Employee employee);
    //return many object data package to a list
    public List<Employee> returnList(String empName);

    //return many object data package to a map(key=primary key value = object bean)
    @MapKey("id") //jiang huo qu dao de duixiang de id fengzhuang cheng map de key
    public Map<Integer,Object> returnMapObjects(String name);


}
