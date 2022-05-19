package s1.exer.exer2;

import java.util.Calendar;
import java.util.Scanner;

/*
创建Employee变量数组并初始化，该数组存放各
类雇员对象的引用。利用循环结构遍历数组元素，输出各个对象的类
型,name,number,birthday,以及该对象生日。当键盘输入本月月份值时，如果本
月是某个Employee对象的生日，还要输出增加工资信息。

 */
public class PayrollSystem {
    public static void main(String[] args) {
//        方式一
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当月月份：");
//        int month = scanner.nextInt();
        //方式二
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH)+1;//public static final int JANUARY = 0;
        System.out.println(month);

        Employee[] staff = new Employee[2];
        staff[0] = new SalariedEmployee("狂野猩",1002,new MyDate(1992,2,21),10000);
        staff[1] = new HourlyEmployee("暴龙神",1001,new MyDate(1999,5,4),60,240);
        for (int i=0;i<staff.length;i++){
            System.out.println(staff[i]);
            double salary =staff[i].earnings();
            if (month == staff[i].getBirthday().getMonth()){
                System.out.println("生日快乐！奖励100元");
                salary+=100;
            }
            System.out.println("月工资为："+salary);
        }

    }
}
