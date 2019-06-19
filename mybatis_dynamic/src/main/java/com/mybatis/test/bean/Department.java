package com.mybatis.test.bean;

import java.io.Serializable;
import java.util.List;

public class Department implements Serializable {


    private static final long serialVersionUID = -6215775681245320374L;
    private  String id;
    private  String deptName;
    private  String location;
    //部门包含的所有员工
    private List<Employee>  employeeList;

    public Department(String id, String deptName, String location) {
        this.id = id;
        this.deptName = deptName;
        this.location = location;
    }

    public Department(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", deptName='" + deptName + '\'' +
                ", location='" + location + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Department(String id, String deptName, String location, List<Employee> employeeList) {
        this.id = id;
        this.deptName = deptName;
        this.location = location;
        this.employeeList = employeeList;
    }

    public Department() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
