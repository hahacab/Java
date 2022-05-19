/*
逻辑运算符用于连接布尔型表达式，在Java中不可以写成3<x<6，应该写
成x>3 & x<6 。
“&”和“&&”的区别：
单&时，左边无论真假，右边都进行运算；
双&时，如果左边为真，右边参与运算，如果左边为假，那么右边不参与运算。
“|”和“||”的区别同理，||表示：当左边为真，右边不参与运算。
异或( ^ )与或( | )的不同之处是：当左右都为true时，结果为false。
理解：异或，追求的是“异”!
 */
public class LogicalOperator {
    public static void main(String[] args) {
        int x = 1;
        int y=1;
        if(x++==2 & ++y==2){//&符号两边都运算
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=2,y=2

        x = 1;
        y = 1;
        if(x++==2 && ++y==2){//&&
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=2,y=1

        x = 1;
        y = 1;
        if(x++==1 | ++y==1){// |
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=7,y=2


        x = 1;
        y = 1;
        if(x++==1 || ++y==1){// ||
            x =7;
        }
        System.out.println("x="+x+",y="+y);//x=7,y=1

        LogicalOperator.test1();

    }
    static void test1(){
        //面试题
        boolean x=true;
        boolean y=false;
        short z=42;
        //if(y == true)
        if((z++==42)&&(y=true))z++;//y取值为true,条件正确，z=44
        if((x=false) || (++z==45)) z++;// 条件正确，z=46
        System. out.println("z="+z); //z=46
    }
}

