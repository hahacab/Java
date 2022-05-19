/*
赋值运算符
符号：=
当“=”两侧数据类型不一致时，可以使用自动类型转换或使用强制
类型转换原则进行处理。
支持连续赋值。
扩展赋值运算符： +=, -=, *=, /=, %=
 */
public class AssignmentOperators {
    public static void main(String[] args) {
        //连续赋值
        int i1,i2;
        i1 = i2 =20;
        int i3 =30,i4 = 40;

        i1 +=i2;//i1 = i1+i2;
        System.out.println(i1);
        i4%=i3;//i4 = i4%i3;

        System.out.println(i4);
        short s = 3;
//        s = s+2; //无法编译,不兼容的类型: 从int转换到short可能会有损失
        s += 2;//不会改变本身变量的数据类型。
        System.out.println(s);
        int i =1;
        i *= 0.1;//不会改变本身变量的数据类型。
        System.out.println(i);//
        i++;
        System.out.println(i);//

        int m = 2;
        int n = 3;
        n *= m++;//先进行*=运算，m再自增
        System.out.println("m=" + m);
        System.out.println("n=" + n);

        n = 10;
        n += (n++) + (++n);
        System.out.println(n);
    }
}
