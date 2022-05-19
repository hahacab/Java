package com.leihang.exer.p9;
/*
*
* Java中的Junit单元测试
*
 */

import org.junit.Test;

import java.util.Date;

public class JUnitTest {
    int num = 10;
    @Test
    public void testEquals(){
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));

        System.out.println(num);
        show();

//        Object obj = new String("GG");
//        Date date =(Date) obj;
    }

    public void show(){
        num = 20;
        System.out.println("Show().........");
    }

}
