package com.spring_mybatis.test.controller;


import com.github.pagehelper.PageHelper;
import com.spring_mybatis.test.service.EmployeeService;
import com.spring_mybatis.test.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/goView")
    public String goEmp(Model model){

       // PageHelper.startPage(1,5);
        //List<Employee> list = employeeService.findAll();
       // model.addAttribute("emplist",list);
//        for (Employee emp:list) {
//          System.out.println(emp);
//        }
      employeeService.mutipate();
      return "emp";
    }
}
