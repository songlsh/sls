package com.mybatis.test.test;

import com.mybatis.test.bean.Department;
import com.mybatis.test.bean.Employee;
import com.mybatis.test.dao.DepartDao;
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
import java.util.List;
import java.util.Map;

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
        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);
        Employee mark = new Employee("mark", 0, "xinlang@google.com.cn");
        mapper.addEmp(mark);
        System.out.println(mark);
        //sqlSession.commit();
    }

    @Test
    public void test02(){

        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);
        Employee emp = mapper.findById(2);
        System.out.println(emp);
    }

    @Test
    public void test03(){

        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);
        Employee emp = new Employee();
        emp.setEmpname("lihua");
        emp.setId("4");
        mapper.modEmp(emp);
    }
    @Test
    public void test04(){

        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);
//        Employee mark = mapper.findOne("5", "mark");
        Employee emp = new Employee();
        emp.setEmpname("m");
        final Employee mark = mapper.findOneObject("5", emp);
        System.out.println(mark);
    }

    @Test
    public void test05(){

        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);

        List<Employee> employeeList = mapper.returnList("j");
        for (Employee employee:employeeList) {
            System.out.println(employee);
        }
    }

    @Test
    public void test06(){

        EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);

        Map<Integer, Object> mapp = mapper.returnMapObjects("%j%");

        System.out.println(mapp);

    }

    @Test
    public void test07(){

        EmpReulutMapDao mapper = sqlSession.getMapper(EmpReulutMapDao.class);

        Employee mapp = mapper.findById(3);

        System.out.println(mapp);

    }

    @Test
    public void test08(){

        EmpReulutMapDao mapper = sqlSession.getMapper(EmpReulutMapDao.class);
        
        //级联查询
      //  Employee mapp = mapper.findObjLoc(4);
        //分布查询
        Employee mapp = mapper.findSeparate(4);

        System.out.println(mapp.getEmpname());
        System.out.println(mapp.getDepart());

    }

    @Test
    public void test09(){

        DepartDao mapper = sqlSession.getMapper(DepartDao.class);

        //级联查询
      //  Employee mapp = mapper.findObjLoc(4);
        //分布查询

        Department mapp = mapper.findOne(1);

        System.out.println(mapp);

    }

    @After
    public void after(){
      sqlSession.close();
    }
}
