import java.time.LocalDate;
import java.util.Date;

/*
 面向过程(POP) 与 面向对象(OOP)
 二者都是一种思想，面向对象是相对于面向过程而言的。面向过程，强调的
是功能行为，以函数为最小单位，考虑怎么做。面向对象，将功能封装进对
象，强调具备了功能的对象，以类/对象为最小单位，考虑谁来做。
 面向对象更加强调运用人类在日常的思维逻辑中采用的思想方法与原则，如
抽象、分类、继承、聚合、多态等。
 面向对象的三大特征
封装 (Encapsulation)
继承 (Inheritance)
多态 (Polymorphism)
面向对象：Object Oriented Programming
面向过程：Procedure Oriented Programming

 */
public class Main {
    public static void main(String[] args) {
        //Date类
        System.out.println("\nDate类");
        Date birthday = new Date();
        String s = birthday.toString();
        System.out.println("new Date()="+birthday);
        System.out.println("s="+s);

        //LocalDate类
        System.out.println("\nLocalDate类");
        System.out.println(LocalDate.now());
        //提供年月日构造一个特定的日期对象
        System.out.println(LocalDate.of(2020,5,3));
        //将构造的对象保存在一个对象变量中
        LocalDate newYearEve = LocalDate.of(2022,12,31);
        System.out.println(newYearEve);
        //使用LocalDate的getYear,getMonthValue,getDayOfMonth得到年月日
        System.out.println(newYearEve.getYear()+"\n"+newYearEve.getMonthValue()+"\n"+
                newYearEve.getDayOfMonth());
        //使用plusDays得到一个新的LocalDate对象
        LocalDate aThousandDaysLater = newYearEve.plusDays(1000);
        System.out.println(aThousandDaysLater);
    }

}
