package com.mybatis.test.test;

import com.mybatis.test.bean.Department;
import com.mybatis.test.bean.Employee;
import com.mybatis.test.dao.DepartDao;
import com.mybatis.test.dao.EmpMapDaoDynamic;
import com.mybatis.test.dao.EmpReulutMapDao;
import com.mybatis.test.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class TestEmp {

    private SqlSession sqlSession;

    @Before
    public void before() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("emp-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @Test
    public void test01(){
        EmpMapDaoDynamic mapper = sqlSession.getMapper(EmpMapDaoDynamic.class);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",3);
        map.put("name","jetty");
        map.put("email","huya@google.com.cn");
        List<Employee> employeeList = mapper.findObject(map);
        for (Employee ee:employeeList) {
            System.out.println(ee.getEmpname());
            System.out.println(ee.getDepart());
        }

    }
    @Test
    public void test02(){
        EmpMapDaoDynamic mapper = sqlSession.getMapper(EmpMapDaoDynamic.class);
        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("id",3);
//        map.put("name","jetty");
        List<Employee> employeeList = mapper.findOneObject(map);
        for (Employee ee:employeeList) {
            System.out.println(ee.getEmpname());
        }

    }
    @Test
    public void test03(){
        EmpMapDaoDynamic mapper = sqlSession.getMapper(EmpMapDaoDynamic.class);
        Map<String,Object> map = new HashMap<String, Object>();
       map.put("id",3);
       map.put("name","helloKitty");
        mapper.modifyEmp(map);
    }
    @Test
    public void test04(){
        EmpMapDaoDynamic mapper = sqlSession.getMapper(EmpMapDaoDynamic.class);
        Set<Integer> sets = new HashSet<Integer>();
        sets.add(1);
        sets.add(2);
        sets.add(3);
        List<Employee> list = mapper.findList(sets);
        for (Employee ee:list
             ) {
            System.out.println(ee);
        }
    }
    @Test
    public void test05(){
        EmpMapDaoDynamic mapper = sqlSession.getMapper(EmpMapDaoDynamic.class);
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("lisi",1,"sohu@163.com",new Department("1")));
        list.add(new Employee("zhangsan",0,"qie@qie.com",new Department("2")));
        list.add(new Employee("jecy",1,"jingdong@com",new Department("1")));
        list.add(new Employee("kdok",0,"baibai@163.com",new Department("2")));
         mapper.addObjectList(list);
    }

    @After
    public void after(){
      sqlSession.close();
    }
}
