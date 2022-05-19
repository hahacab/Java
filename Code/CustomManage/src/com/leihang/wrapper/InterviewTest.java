package com.leihang.wrapper;

import org.junit.Test;

public class InterviewTest {
    @Test
    public void test1() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        //运算符自动类型提升成double
        System.out.println(o1);//1.0 重写了toString方法

        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);//1
    }

    @Test
    public void test2() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//地址不同 false

        //IntegerCache内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        //保存了从-128~127的范围的整数，如果我们使用自动装箱的方式，给Integer赋值的范围在
        //-128~127范围内时，可以直接使用数组中的元素，不用再去new了，目的，提高效率。

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//指向相同的地址值 true
        System.out.println(m);
        m+=1;
        System.out.println(m);
        System.out.println(n);
        System.out.println(m == n);//false

        Integer x = 128;//相当于new了一个Integer对象
        Integer y = 128;//相当于new了一个Integer对象
        System.out.println(x == y);//false
    }
}

