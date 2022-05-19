package com.leihang.object;

import java.util.Date;

public class ToStringTest {
    public static void main(String[] args) {
        var custom1 = new Custom("Kate",10);
        System.out.println(custom1.toString());

        String str1 = new String("Hello!");
        System.out.println(str1);

        Date date = new Date();
        System.out.println(date);
    }
}
