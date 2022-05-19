import java.time.DayOfWeek;
import java.time.LocalDate;
/*
*@version 1.0
*@author leiHang
*@time 2022/5/3
*@introduce 这个程序用来显示当前月的日历
 */
public class LocalDateProgram {

    public static void main(String[] args) {
        //构造一个对象，并用当前日期初始化。
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        //将date设置为这个月的第一天，并得到这天为星期几
        date = date.minusDays(today-1);//minus() 生成当前日期之前today-1天的日期
        DayOfWeek week = date.getDayOfWeek();
        int value = week.getValue();//1=Monday....7=Sunday
        //打印表头
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i =1;i<value;i++){
            System.out.print("    ");//保证第一天跟星期几对齐
        }

        //打印日历，每打印一个date占用4个字符，以和表头对齐
        while (date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            //每过一周换行
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        System.out.println();//换行
    }
}
