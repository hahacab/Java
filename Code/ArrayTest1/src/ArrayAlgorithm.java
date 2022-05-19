import java.util.Arrays;
import java.util.Scanner;

/*
数组中涉及的常见算法
1. 数组元素的赋值(杨辉三角、回形数等)
2. 求数值型数组中元素的最大值、最小值、平均数、总和等
3. 数组的复制、反转、查找(线性查找、二分法查找)
4. 数组元素的排序算法

算法的5大特征
输入（Input） 有0个或多个输入数据，这些输入必须有清楚的描述和定义
输出（Output） 至少有1个或多个输出结果，不可以没有输出结果
有穷性（有限性，Finiteness）
算法在有限的步骤之后会自动结束而不会无限循环，并且每一个步骤
可以在可接受的时间内完成
确定性（明确性，Definiteness） 算法中的每一步都有确定的含义，不会出现二义性
可行性（有效性，Effectiveness） 算法的每一步都是清楚且可行的，能让用户用纸笔计算而求出答案

说明：满足确定性的算法也称为：确定性算法。现在人们也关注更广泛的概念，例如
考虑各种非确定性的算法，如并行算法、概率算法等。另外，人们也关注并不要求终
止的计算描述，这种描述有时被称为过程（procedure）。

java.util.Arrays类即为操作数组的工具类，包含了用来操作数组（比
如排序和搜索）的各种方法。
1 boolean equals(int[] a,int[] b) 判断两个数组是否相等。
2 String toString(int[] a) 输出数组信息。
3 void fill(int[] a,int val) 将指定值填充到数组之中。
4 void sort(int[] a) 对数组进行排序。
5 int binarySearch(int[] a,int key) 对排序后的数组进行二分法检索指定的值。

数组使用中的常见异常

数组脚标越界异常(ArrayIndexOutOfBoundsException)
int[] arr = new int[2];
System.out.println(arr[2]);
System.out.println(arr[-1]);
访问到了数组中的不存在的脚标时发生。

空指针异常(NullPointerException)
int[] arr = null;
System.out.println(arr[0]);
arr引用没有指向实体，却在操作实体中的元素时。

 */
public class ArrayAlgorithm {
    public static void main(String[] args) {
//        ArrayAlgorithm.practice5();
//        ArrayAlgorithm.practice6();
//        ArrayAlgorithm.practice7();
        ArrayAlgorithm.practice8();
    }

    //练习5
    public static void practice5() {
        /*
        定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
        然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
        要求：所有随机数都是两位数。
         */
        int[] arr = new int[10];
        int max = 10;
        int min = 99;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //Math 类的 random() 方法没有参数，它默认会返回大于等于 0.0、小于 1.0 的 double 类型随机数
            arr[i] = (int) (Math.random() * 90 + 10);
            System.out.println(arr[i]);
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            sum += arr[i];
        }
        double ave = (double) sum / arr.length;
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("和值为：" + sum);
        System.out.println("平均值为：" + ave);
    }

    //练习6
    public static void practice6() {
        /*
        使用简单数组
        (1)创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，
        他们是int[]类型的数组。
        (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
        (3)显示array1的内容。
        (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
        (如array[0]=0,array[2]=2)。打印出array1。
         */
        int[] array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        int[] array2 = new int[8];
        System.out.println("array1的值：");
        for (int i = 0; i < array1.length; i++) System.out.printf("a[%d]=%d\n", i, array1[i]);
        array2 = array1;
        for (int i = 0; i < array1.length; i += 2) array2[i] = i;
        System.out.println("\narray2的值：");
        for (int i = 0; i < array1.length; i++) System.out.printf("a[%d]=%d\n", i, array2[i]);
    }

    //练习7
    public static void practice7() {
        /*
        数组中涉及到的常见算法：二分法查找算法
         */
        //二分法查找：要求此数组必须是有序的。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想查找的数：");
        int number = scanner.nextInt();
        int[] arr3 = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        boolean isFlag = true;
        //int number = 25;
        int head = 0;//首索引位置
        int end = arr3.length - 1;//尾索引位置
        while (head <= end) {
            int middle = (head + end) / 2;
            if (arr3[middle] == number) {
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag = false;
                break;
            } else if (arr3[middle] > number) {
                end = middle - 1;
            } else {//arr3[middle] < number
                head = middle + 1;
            }
        }
        if (isFlag) {
            System.out.println("未找打指定的元素");
        }
    }

    //练习8
    public static void practice8() {
        int [] numbers = {5,900,1,5,77,30,64,700};
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
