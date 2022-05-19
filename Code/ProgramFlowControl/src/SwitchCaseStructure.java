/*
switch(表达式){
case 常量1:
语句1;
break;
case 常量2:
语句2;
break;
… …
case 常量N:
语句N;
break;
default:
语句;
break;

 switch(表达式)中表达式的值必须是下述几种类型之一：byte，short，
char，int，枚举 (jdk 5.0)，String (jdk 7.0)；
 case子句中的值必须是常量，不能是变量名或不确定的表达式值；
 同一个switch语句，所有case子句中的常量值互不相同；
 break语句用来在执行完一个case分支后使程序跳出switch语句块；如
果没有break，程序会顺序执行到switch结尾
 default子句是可任选的。同时，位置也是灵活的。当没有匹配的case时，
执行default
}

if和switch语句很像，具体什么场景下，应用哪个语句呢？
 如果判断的具体数值不多，而且符合byte、short 、char、int、String、枚举等几
种类型。虽然两个语句都可以使用，建议使用swtich语句。因为效率稍高。
 其他情况：对区间判断，对结果为boolean类型判断，使用if，if的使用范围更广。
也就是说，使用switch-case的，都可以改写为if-else。反之不成立。

 */

import java.util.Scanner;

public class SwitchCaseStructure {
    public static void main(String[] args) {
//        SwitchCaseStructure.instance1();
//        SwitchCaseStructure.describeSeason();

//        SwitchCaseStructure.charToUp();
//        SwitchCaseStructure.passOrNot();
//        SwitchCaseStructure.judgingSeason();
        while (true){
//            SwitchCaseStructure.leapYearJudgment();
//            SwitchCaseStructure.practice2();
//            SwitchCaseStructure.practice3();
            SwitchCaseStructure.chineseZodiac();
        }
    }

    //switch语句应用举例1
    public static void instance1() {
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        }

    }

    //switch语句应用举例2
    public static void describeSeason() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入季节，我会用一个词语形容它\n" +
                "可选词（spring,summer,autumn,winter）,不区分大小写");
        String season =scan.next().toLowerCase();//将输入字符串转化为小写
        switch (season){
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;
        }
    }

    //    1.使用 switch 把小写类型的 char型转为大写。只转换 a, b, c, d, e. 其它的输出 “other”。
    //    提示：String word = scan.next(); char c = word.charAt(0); switch(c){}
    public static void charToUp() {
        System.out.print("请输入一个字符，我会把a,b,c,d,e更换成大写：");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char c = word.charAt(0);
        switch (c) {
            case 'a', 'b', 'c', 'd', 'e' -> System.out.println(Character.toUpperCase(c));
            default -> System.out.println("other");
        }
    }

    // 2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
    public static void passOrNot() {
        System.out.print("请输入学生成绩：");
        Scanner scan = new Scanner(System.in);
        int testScore = scan.nextInt();
        int passIndex = testScore>=60?1:0;
        switch (passIndex){
            case 1 -> System.out.println("合格");
            default -> System.out.println("不合格");
        }

    }

    //3.根据用于指定月份，打印该月份所属的季节。
    //    3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季
    public static void judgingSeason() {
        System.out.print("请用阿拉伯数字输入月份，我会打印其所属的季节：");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month){
            case 3,4,5 -> System.out.println("春季");
            case 6,7,8 -> System.out.println("夏季");
            case 9,10,11 -> System.out.println("秋季");
            case 12,1,2 -> System.out.println("冬季");
        }
    }

    // 4. 编写程序：从键盘上输入2019年的“month”和“day”，要求通过程序
    //    输出输入的日期为2019年的第几天



    /*
    从键盘分别输入年、月、日，判断这一天是当年的第几天
    注：判断一年是否是闰年的标准：
    1）可以被4整除，但不可被100整除或
    2）可以被400整除
     */
    public static void leapYearJudgment() {
        System.out.println("输入年月日(阿拉伯数字)，你会得到这一年是否为闰年和这一天是当年的第几天");
        Scanner scan = new Scanner(System.in);
        System.out.print("年份：");
        int year = scan.nextInt();
        System.out.print("月份：");
        int month = scan.nextInt();
        System.out.print("日：");
        int day = scan.nextInt();

        //判断是否为闰年，若为闰年，februaryLength = 29
        int februaryLength = 28;
        switch (year % 4) {
            case 0 -> {
                februaryLength = 29;
                switch (year % 100) {
                    case 0 -> {
                        februaryLength = 28;
                        switch (year%400){
                            case 0 -> februaryLength = 29;
                        }
                    }
                }
            }
        }

        //计算今天是第几天
        int num = 0;
        switch (month){
            case 1 -> num+=0;
            case 2 -> num+=31;
            case 3 -> num+=(februaryLength+31);
            case 4 -> num+=(februaryLength+31*2);
            case 5 -> num+=(februaryLength+30+31*2);
            case 6 -> num+=(februaryLength+30+31*3);
            case 7 -> num+=(februaryLength+30*2+31*3);
            case 8 -> num+=(februaryLength+30*2+31*4);
            case 9 -> num+=(februaryLength+30*2+31*5);
            case 10 -> num+=(februaryLength+30*3+31*5);
            case 11 -> num+=(februaryLength+30*3+31*6);
            case 12 -> num+=(februaryLength+30*4+31*6);
        }
        num += day;

        //输出今年是否为闰年
        switch (februaryLength){
            case 28 -> System.out.println("今年是平年。");
            case 29 -> System.out.println("今年是闰年。");
        }

        //输出今天是第几天
        System.out.println("今天是"+year+"年"+month+"月"+day+"日。\n今天是"+year+"年的第"+num+"天");

    }

    //switch语句练习2
    public static void practice2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
         int a = scan.nextInt();
//        int a = (int)(Math.random()*8);
        int x = 100;
        switch (a){
            case 1 -> x+=5;
            case 2 -> x+=10;
            case 3 -> x+=16;
            default -> x+=34;
        }
        System.out.println("x="+x);
    }

    /*
    编写程序：从键盘上读入一个学生成绩，存放在变量score中，根据score的
    值输出其对应的成绩等级：
    score>=90 等级: A
    70<=score<90 等级: B
    60<=score<70 等级: C
    score<60 等级: D
    方式一：使用if-else
    方式二：使用switch-case: score / 10: 0 - 10
     */
    //switch语句练习3
    public static void practice3() {
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = scan.nextInt();
//        //if-else
//        if(score>=90)
//            System.out.println("等级: A");
//        else if (score>=70 && score<90)
//            System.out.println("等级: B");
//        else if (score>=60 && score<70)
//            System.out.println("等级: C");
//        else
//            System.out.println("等级: D");
        //Switch-case
        switch (score/10){
            case 9,10 -> System.out.println("等级: A");
            case 7,8 -> System.out.println("等级: B");
            case 6 -> System.out.println("等级: C");
            default -> System.out.println("等级: D");
        }
    }

    /*
    编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，
    每年用一个动物代表：rat、ox、tiger、rabbit、dragon、snake、horse、sheep、monkey、
    rooster、dog、pig。
    提示：2019年：猪 2019 % 12 == 3
     */
    public static void chineseZodiac(){
        System.out.println("输入年份，得到生肖。");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        switch (year%12){
            case 0 -> System.out.println("猴 monkey");
            case 1 -> System.out.println("鸡 rooster");
            case 2 -> System.out.println("狗 dog");
            case 3 -> System.out.println("猪 pig");
            case 4 -> System.out.println("鼠 rat");
            case 5 -> System.out.println("牛 ox");
            case 6 -> System.out.println("虎 tiger");
            case 7 -> System.out.println("兔 rabbit");
            case 8 -> System.out.println("龙 dragon");
            case 9 -> System.out.println("蛇 snack");
            case 10 -> System.out.println("马 horse");
            case 11 -> System.out.println("羊 sheep");
        }
    }
}
