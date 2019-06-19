package com.spring_mybatis.test.service;


import com.spring_mybatis.test.bean.Employee;
import com.spring_mybatis.test.dao.EmployeeDao;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List<Employee> findAll(){

        return employeeDao.selectAll();
    }

    public void mutipate(){
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH,false);
        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);
//        EmployeeDao mapper = sqlSessionTemplate.getMapper(EmployeeDao.class);
        long start = System.currentTimeMillis();
        for(int i=0;i<100;i++) {
            mapper.addEmp(new Employee(UUID.randomUUID().toString().substring(1, 6), 0, i+"@google111"));
        }
        sqlSession.commit();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
