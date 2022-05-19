import java.util.Arrays;
import java.util.Scanner;

/*
1 基本概念
排序:是计算机程序设计中的一项重要操作，其功能是指一个数据元素集合或序列重新排列
成一个按数据元素某个数据项值有序的序列。

排序码(关键码):排序依据的数据项。
稳定排序:排序前与排序后相同关键码元素间的位置关系，保持一致的排序方法。
不稳定排序:排序前与排序后相同关键码元素间的相对位置发生改变的排序方法

排序分为两类：
（1）内排序:指待排序列完全存放在内存中所进行的排序。内排序大致可分为
五类：插入排序、交换排序、选择排序、归并排序和分配排序。本章主要讨论内排序。
（2）外排序：指排序过程中还需访问外存储器的排序。为了以后讨论方便，我们直接
将排序码写成一个一维数组的形式，并且在没有声明的情形下，所有排序都按排序码的值递增排列。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//定义变量接收输入字符
        int length = Main.initArrLength(scanner);//得到数组长度
        int[] arr =Main.generateArray(length,scanner);//生成数组并输出
        //挑选排序算法进行排序后得到数组，并输出耗时
        int[] arrSort =Main.chooseAlgorithm(arr,scanner);
        System.out.println("排序后结果为：");
        Main.arrToStr(arrSort);
    }

    //得到数组长度
    public static int initArrLength(Scanner scanner) {
        System.out.println("输入你想要的序列长度：");
        return scanner.nextInt();
    }

    //得到逆序数组并输出
    public static int[] generateArray(int length, Scanner scanner) {
        int[] arr = new int[length];
        System.out.println("""
                输入[1]生成无序数组
                输入[2]生成顺序数组
                输入[3]生成逆序数组""");
        int arrType = scanner.nextInt();
        switch (arrType) {
            case 1 -> {
                for (int i = 0; i < arr.length; i++)
                    arr[i] = (int) (Math.random() * 500);
            }
            //生成顺序数组
            case 2 -> {
                arr[0] = (int) (Math.random() * 6);
                for (int i = 1; i < arr.length; i++) {
                    arr[i] += arr[i - 1] + (int) (Math.random() * 6);
                }
            }
            case 3 -> {
                arr[0] = (int) (Math.random() * 6 + 600);
                for (int i = 1; i < arr.length; i++) {
                    arr[i] += arr[i - 1] - (int) (Math.random() * 6);
                }
            }
            default -> {
                System.out.println("不合法的字符,请重新输入：");
                Main.generateArray(length,scanner);
            }
        }
        System.out.println("排序前数据：");
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    //挑选排序算法并输出
    public static int[] chooseAlgorithm(int[] arr,Scanner scanner){
        System.out.println("""
                        键入一下数字选择排序算法!
                        [1]:直接插入排序\t[2]:希尔排序\t
                        [3]:冒泡排序法\t[4]:快速排序\t
                        """);
        int sortType = scanner.nextInt();
        Long sTime = System.nanoTime();
        switch (sortType){
            case 1 -> InsertSort.directInsertSort(arr);
            case 2 -> InsertSort.shellSort(arr);
            case 3 -> ExchangeSort.bubbleSort(arr);
            default -> {
                System.out.println("无效的输入");
                Main.chooseAlgorithm(arr,scanner);
            }
        }
        Long eTime = System.nanoTime();
        System.out.printf("耗时= %d\n", eTime - sTime);
        return arr;
    }
    //按脚注输出数组的元素
    public static void arrToStr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
