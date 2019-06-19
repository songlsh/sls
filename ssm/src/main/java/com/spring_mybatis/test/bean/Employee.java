package com.spring_mybatis.test.bean;

import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = -5756992901213449625L;
    private String id;
    private String empname;
    private Integer general;
    private String  email;
    private Department depart;

    public Department getDepart() {
        return depart;
    }

    public void setDepart(Department depart) {
        this.depart = depart;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getGeneral() {
        return general;
    }

    public void setGeneral(Integer general) {
        this.general = general;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee() {
    }

    public Employee(String empname, Integer general, String email, Department depart) {
        this.empname = empname;
        this.general = general;
        this.email = email;
        this.depart = depart;
    }

    public Employee(String empname, Integer general, String email) {
        this.empname = empname;
        this.general = general;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", empname='" + empname + '\'' +
                ", general=" + general +
                ", email='" + email + '\'' +
                ", depart=" + depart +
                '}';
    }
}
