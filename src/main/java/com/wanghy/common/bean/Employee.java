package com.wanghy.common.bean;

import java.util.Date;

public class Employee {
    private Integer salary;
    private String name;
    private Date hireDay;

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    @Override
    public String toString() {
        return "员工：" +
                getName() +
                "，入职时间：" +
                getHireDay() +
                "，薪水：" +
                getSalary() +
                "元/天";
    }
}
