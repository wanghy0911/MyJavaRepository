package com.wanghy.common.util;

public class CheckUtils {


    public static boolean equals(String str1,String str2){
        if(str1==null && str2==null){
            return true;
        }else if (str1==null || str2==null){
            return false;
        }

        int n = str1.length();
        //先比对长度，长度不一致返回false
        if(n==str2.length()){
            //长度一致，再循环逐个比对每个字符
            char[] v1 = str1.toCharArray();
            char[] v2 = str2.toCharArray();
            int i = 0;
            while(n-- !=0){
                if(v1[i]!=v2[i]){
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }
}
