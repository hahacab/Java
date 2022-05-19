/*
如果对负数取模，可以把模数负号忽略不记，如：5%-2=1。 但被模数是
负数则不可忽略。此外，取模运算的结果不一定总是整数。
对于除号“/”，它的整数除和小数除是有区别的：整数之间做除法时，只
保留整数部分而舍弃小数部分。 例如：int x=3510;x=x/1000*1000; x的
结果是？
“+”除字符串相加功能外，还能把非字符串转换成字符串.例如：
System.out.println(“5+5=”+5+5); //打印结果是？ 5+5=55 ?
 */
public class OperatorTest {
    public static void main(String[] args) {
        int i1 = 5%-2;
        System.out.println(i1);
        int x=3510/1000*1000;
        System.out.println(x);
        System.out.println("5+5="+5+5);
        /*
        随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
            格式如下：
            数字xxx的情况如下：
            个位数：
            十位数：
            百位数：
         */
        int xxx=153;
        int d =xxx;
        int d3= d%10;
        d = d/10;
        int d2= d%10;
        d = d/10;
        int d1= d%10;
        System.out.println("数字"+xxx+"的情况如下"+"\n"+"个位数: "+d3+"\n"+"百位数: "+d2+"\n"+"千位数: "+d1);
        System.out.println("下");
        System.out.println(System.getProperty("file.encoding"));
    }
}
