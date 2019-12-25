package com.wanghy.common.util;

import com.wanghy.common.bean.Manager;
import org.junit.Test;

import java.util.Date;

public class ManagerTest {


    @Test
    public void managerTest(){
        Manager m = new Manager();
        m.setName("张三");
        m.setHireDay(new Date());
        m.setSalary(1500);
        m.setBonus(200);
        System.out.println(m.toString());
    }
}
