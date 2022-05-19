package com.leihang.object;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        double d = 10.0;
        System.out.println(i == j);//true
        System.out.println(i == d);//true自动类型提升

        boolean b = true;
//        System.out.println(i == b);
        char c = 10;
        System.out.println(c == i);//true

        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);//true
        System.out.println("************".repeat(5));

        String str1 = new String("1");
        String str2 = new String("1");
        String str3 = str1;
        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println("************".repeat(2)+"equals"+"************".repeat(2));
        //equals
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str2));//true

        var order1=new Custom("Kate",10);
        var order2 = new Custom("Kate",10);
        System.out.println(order1.equals(order2));//true

    }
}
class Custom{
    private String name;
    private int age;
    public Custom(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Custom custom = (Custom) o;
        return age == custom.age && Objects.equals(name, custom.name);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        //引用地址相同，相等
//        if (this == obj)return true;
//        //判断形参是否时Custom
//        if (obj instanceof Custom){
//            Custom custom = (Custom)obj;
//            //比较两个对象的每个属性是否都相同
//            return name.equals(custom.getName()) && age == (custom.getAge());
//        }
//        //obj不是Custom,返回false
//        return false;
//    }

//    @Override
//    public String toString() {
//        return getClass()+"[name = "+ name +",age = "+ age +"]";
//    }

    @Override
    public String toString() {
        return "Custom{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
