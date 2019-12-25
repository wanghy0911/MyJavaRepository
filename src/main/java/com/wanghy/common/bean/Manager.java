package com.wanghy.common.bean;


public class Manager extends Employee{
    private Integer bonus;

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public Integer getSalary() {
        return super.getSalary()+this.bonus;
    }
}
