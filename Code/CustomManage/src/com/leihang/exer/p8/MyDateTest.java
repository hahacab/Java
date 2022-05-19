package com.leihang.exer.p8;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
class MyDate{
    private int day;
    private int month;
    private int years;

    public MyDate(int day, int month, int years) {
        this.day = day;
        this.month = month;
        this.years = years;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
    public boolean equals(Object o){
        if (this == o) return true;
        if (o instanceof MyDate){
            MyDate myDate = (MyDate) o;
            return day ==myDate.day&&month == myDate.month&&years == myDate.years;
        }
        return false;
    }
}