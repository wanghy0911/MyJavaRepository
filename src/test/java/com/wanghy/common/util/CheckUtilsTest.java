package com.wanghy.common.util;

import org.junit.Test;

public class CheckUtilsTest {

    @Test
    public void equalsTest(){
        System.out.println(CheckUtils.equals(null,null));
        System.out.println(CheckUtils.equals(null,"aaa"));
        System.out.println(CheckUtils.equals("aaa",null));
        System.out.println(CheckUtils.equals("aaa","aaa"));
        System.out.println(CheckUtils.equals("asd","aaa"));
        System.out.println(CheckUtils.equals("hello","1234234123412"));
        System.out.println(CheckUtils.equals("helloWorld","hello World"));
    }
}
