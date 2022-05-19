/*
 String不是基本数据类型，属于引用数据类型
 使用方式与基本数据类型一致。例如：String str = “abcd”;
 一个字符串可以串接另一个字符串，也可以直接串接其他类型的数据。例如：
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);
        str = str+"xyz";
        System.out.println(str);
        str = str+10;
        System.out.println(str);
    }
}
