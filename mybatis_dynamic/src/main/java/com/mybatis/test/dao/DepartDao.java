package com.mybatis.test.dao;

import com.mybatis.test.bean.Department;

public interface DepartDao {

    public Department findOne(Integer id);
}
