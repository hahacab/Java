package s2;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * 1.finally是可选的
 *
 * 2.finally中声明的是一定会被执行的代码。即使catch中又出现异常了，try中return语句，catch中return语句等情况。
 *
 * 3.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己手动的进行资源的释放。
 * 此时的资源释放，就需要声明在finally中。
 * try-catch-finally结构可以嵌套
 *
 *  * 体会1：使用try-catch-finally处理编译时异常，是得程序在编译时就不再报错，但是运行时仍可能报错。
 * 相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
 *
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
 * 针对于编译时异常，我们说一定要考虑异常的处理。
 */

public class FinallyTest {

    @Test
    public void test2() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();//资源无法被回收
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)//NullPointerException
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testMethod() {
        int num = method();
        System.out.println(num);
    }

    public int method() {
        try {
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会被执行");
            return 3;
        }
    }

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("不遣柳条青");
        }

    }
}
