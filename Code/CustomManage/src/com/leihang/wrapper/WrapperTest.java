package com.leihang.wrapper;

import org.junit.Test;

public class WrapperTest {
    @Test
    public void test3(){
        int num1 = 10;
        method(num1);//自动装箱
        int num2 = 10;
        Integer in1 = num2;//自动装箱

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱
        int num3 = in1;//自动拆箱
    }
    public void method(Object obj){

    }

    @SuppressWarnings("removal")
    @Test
    //基本数据类型----> 包装类
    public void test1(){
        int num1 = 10;
//        System.out.println(num1.toString);
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2);
//        Integer in3 = new Integer("123abc");//必须是纯粹的数
//        System.out.println(in2.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.4");
        System.out.println(f1);
        System.out.println(f2);

        System.out.println("********".repeat(4));
        Boolean b1 = new Boolean(true);//true
        Boolean b2 = new Boolean("true");//true
        Boolean b3 = new Boolean("true1");//false
        Boolean b4 = new Boolean("True");//true
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println("********".repeat(4));
        Order order = new Order();
        System.out.println(order.isFemale);//null
        System.out.println(order.isMale);
    }

    @SuppressWarnings("removal")
    @Test
    //包装类转化为基本数据类型: 调用包装类的xxxValue()
    public void test2(){
        Integer num1 = new Integer(12);

        int i1 = num1.intValue();
        System.out.println(i1+1);

        Float f1 = new Float(10.0);

        float f2 = f1.floatValue();
        System.out.println(f1-1);
    }

    @Test
    //基本或包装类 -> String
    public void test4(){
        int num1 =10;
        //方式1
        String str1 = num1 +"";
        System.out.println(str1);
        //方式2 调用 String.valueOf(f1);
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"
        System.out.println(str2);
        Float f2 = 12.3f;
        String str3 = String.valueOf(f2);//"12.3"
        System.out.println(str3);
    }

    //String -> 基本或包装类
    @Test
    public void test5(){
        String str1 = "123";
//        int num1 = (int) String;
//        Integer in1 = (Integer) String;
        //可能会报NumberFormat的错误
        int num1 = Integer.parseInt(str1);
        System.out.println(num1+1);

        String str = "True";
        boolean b1 = Boolean.parseBoolean(str);
        System.out.println(b1);
    }
}
class Order{
    boolean isMale;
    Boolean isFemale;//默认值null
}
