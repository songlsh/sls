package com.mybatis.test.dao;

import com.mybatis.test.bean.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface EmpMapDaoDynamic {

    public List<Employee> findObject(Map<String,Object> map);
    public List<Employee> findOneObject(Map<String,Object> map);
    public void modifyEmp(Map<String,Object> map);

    public List<Employee> findList(@Param("cos") Set<Integer> set);

    public void addObjectList(List<Employee> list);
}
