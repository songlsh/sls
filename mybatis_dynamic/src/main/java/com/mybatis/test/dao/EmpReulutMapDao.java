package com.mybatis.test.dao;

import com.mybatis.test.bean.Employee;

public interface EmpReulutMapDao {

    public Employee findById(Integer id);

    public Employee findObjLoc(Integer id);

    public Employee findSeparate(Integer id);

}
