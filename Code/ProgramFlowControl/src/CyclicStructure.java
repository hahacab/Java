import java.util.Scanner;

/*
循环结构
在某些条件满足的情况下，反复执行特定代码的功能
循环语句分类
for 循环
while 循环
do-while 循环

循环语句的四个组成部分
初始化部分(init_statement)
循环条件部分(test_exp)
循环体部分(body_statement)
迭代部分(alter_statement)

程序流程控制：循环结构之for循环
语法格式
 for (①初始化部分; ②循环条件部分; ④迭代部分)｛
③循环体部分;
｝
 执行过程：
①-②-③-④-②-③-④-②-③-④-.....-②
 说明：
 ②循环条件部分为boolean类型表达式，当值为false时，退出循环
 ①初始化部分可以声明多个变量，但必须是同一个类型，用逗号分隔
 ④可以有多个变量更新，用逗号分隔

程序流程控制：循环结构之while循环
语法格式
①初始化部分
while(②循环条件部分)｛
③循环体部分;
④迭代部分;
}
执行过程：
①-②-③-④-②-③-④-②-③-④-...-②
说明：
注意不要忘记声明④迭代部分。否则，循环将不能结束，变成死循环。
for循环和while循环可以相互转换

 程序流程控制：循环结构之do-while循环
 语法格式
①初始化部分;
do{
③循环体部分
④迭代部分
}while(②循环条件部分);
执行过程：
①-③-④-②-③-④-②-③-④-...②
说明：
do-while循环至少执行一次循环体。

程序流程控制：嵌套循环结构

将一个循环放在另一个循环体内，就形成了嵌套循环。其中，
for ,while ,do…while均可以作为外层循环或内层循环。
 实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的
循环条件为false时，才会完全跳出内层循环，才可结束外层的当次循环，开
始下一次的循环。
 设外层循环次数为m次，内层为n次，则内层循环体实际上需要执行m*n次。

特殊关键字的使用：break、continue

break 语句
break语句用于终止某个语句块的执行
{ ……
break;
……

continue 语句
continue只能使用在循环结构中
continue语句用于跳过其所在循环语句块的一次执行，继续下一次循环
continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环
continue语句用法举例
public class ContinueTest {
public static void main(String args[]){
for (int i = 0; i < 100; i++) {
if (i%10==0)
continue;
System.out.println(i);
}
}
}
}
break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是
哪一层语句块
label1: { ……
label2: { ……
label3: { ……
break label2;
……
}
}
}

附加：特殊流程控制语句3
 return：并非专门用于结束循环的，它的功能是结束一个方法。
当一个方法执行到一个return语句时，这个方法将被结束。
 与break和continue不同的是，return直接结束整个方法，不管
这个return处于多少层循环之内

break只能用于switch语句和循环语句中。
continue 只能用于循环语句中。
二者功能类似，但continue是终止本次循环，break是终止本层循环。
break、continue之后不能有其他的语句，因为程序永远不会执行其后的语句。
标号语句必须紧接在循环的头部。标号语句不能用在非循环语句的前面。
很多语言都有goto语句，goto语句可以随意将控制转移到程序中的任意一条
语句上，然后执行它。但使程序容易出错。Java中的break和continue是不同
于goto的。


 */
public class CyclicStructure {
    public static void main(String[] args) {
        int jumpOut =1;
        while (jumpOut==1){
//            CyclicStructure.examples1();
//            CyclicStructure.examples2();
//            CyclicStructure.practices1();
//            CyclicStructure.doWhile();
//            CyclicStructure.countNum();
//            CyclicStructure.nineNineMultiply();
//            CyclicStructure.primeNumberWithin100();
            CyclicStructure.breakLabel();

            //跳出循环
            System.out.println("\n键入0，跳出循环，否则，继续执行循环体部分");
            Scanner scan = new Scanner(System.in);
            jumpOut = scan.nextInt();
        }
    }
    /*
    Examples1
    编写程序从1循环到150，并在每行打印一个值，另外在每个3的倍数行
    上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”
     */
    public static void examples1() {
        for (int i=1;i<=150;i++){
            System.out.print(i);
            if (i%3==0) System.out.print("\tfoo");
            if (i%5==0) System.out.print("\tbiz");
            if (i%7==0) System.out.print("\tbaz");
            System.out.println();
        }
    }

    /*
    Examples2
    题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
    比如：12和20的最大公约数是4，最小公倍数是60。
    说明：break关键字的使用
     */
    public static void examples2() {
        System.out.println("输入正整数m和n,求其最小公倍数。");
        Scanner scan = new Scanner(System.in);
        System.out.println("m= ");
        int m = scan.nextInt();
        System.out.println("n= ");
        int n =scan.nextInt();

        //定义除数和被除数
        int divisor= Math.min(m, n);
        int dividend= Math.max(m,n);

        //最小数递减求最大公约数
        Long s1time = System.nanoTime();
        int i = divisor;
        for (;;i--){
            if (divisor%i==0&&dividend%i==0) break;
        }
        Long e1time = System.nanoTime();
        System.out.printf("方法1运行时间= %d\n",e1time-s1time);

        System.out.println("最大公约数= "+i);
        //最小公倍数 = m*n/最大公约数
        int mcm = m*n/i;
        System.out.println("最小公倍数= "+mcm);

        //辗转相除法求最大公因数
        divisor= Math.min(m, n);
        dividend= Math.max(m,n);

        Long s2time = System.nanoTime();
        for (int remainder = 1;;){
            remainder=dividend%divisor;

            //一旦余数为0，即跳出循环，除数即为最大公因数
            if (remainder==0)break;
//            System.out.println("余数= "+remainder);
            dividend = divisor;
//            System.out.println("被除数= "+dividend);
            divisor = remainder;
//            System.out.println("除数= "+divisor);
        }
        Long e2time = System.nanoTime();
        System.out.printf("方法2运行时间= %d\n",e2time-s2time);

        System.out.println("最大公约数= "+ divisor);
        //最小公倍数 = m*n/最大公约数
        mcm = m*n/divisor;
        System.out.println("最小公倍数= "+mcm);
    }


    public static void practices1() {
        int sum = 0;

        //打印1~100之间所有奇数的和
        for (int i = 1;i<=100;i+=2)
        {
            sum += i;
        }
        System.out.println("1~100之间所有奇数的和="+sum);

        //打印1~100之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）
        int num = 0;
        for (int i = 1;i<=100;i++)
        {
            if (i%7==0){
                sum += i;
                num++;
            }
        }
        System.out.printf("所有是7的倍数的整数的个数=%d,总和=%d.\n",num,sum);

        //  3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数
        //    字立方和等于其本身。例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
        for (int i = 100;i<1000;i++){
            int s1 = i%10;
            int s2 = i/10%10;
            int s3 = i/100%10;
            if (s1*s1*s1+s2*s2*s2+s3*s3*s3 == i)
                System.out.println(i);
        }

    }

    //do-while
    public static void doWhile() {
        int result = 0, i = 1;
        do {
            result += i;
            i++;
        } while (i <= 100);
        System.out.println("result=" + result);
    }

    //从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
    //为0时结束程序。
    public static void countNum() {
        System.out.println("从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。");
        int numP = 0;
        int numN = 0;
        Scanner scan = new Scanner(System.in);
        while (true){
            int num = scan.nextInt();
            if (num>0)numP++;
            else if (num<0)numN++;
            else break;
        }
        System.out.printf("正数有%d个,负数有%d个。",numP,numN);
    }

    //99乘法表
    public static void nineNineMultiply() {
        for (int r=1;r<10;r++) {
            for (int c =1;c<10;c++){
                System.out.printf("%d*%d=%d\t",r,c,r*c);
            }
            System.out.println();
        }
    }

    //100以内的所有质数
    public static void primeNumberWithin100() {
        for (int i =1;i<100;i++){
            for (int j=1;j<=i;j++) {
                if (i%j==0 && j!=1 &&j!=i)
                    //当除数j不等于1和i时，若可以整除i,则不为质数，跳出循环
                    break;
                //遍历后符合条件输出质数
                if (j==i)
                    System.out.println(i);
            }
        }
    }

    public static void breakLabel() {
        label1: while (true){
            label2: {
                System.out.println("label1");
                while (true){
                    label3:{
                        System.out.println("label2");
                        break label1;
                    }
                }
            }
        }
        System.out.println("跳出");
    }
}
