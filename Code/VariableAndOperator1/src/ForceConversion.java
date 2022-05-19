/*
自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使
用时要加上强制转换符：()，但可能造成精度降低或溢出,格外要注意。
通常，字符串不能直接转换为基本类型，但通过基本类型对应的包装类则可
以实现把字符串转换成基本类型。
boolean类型不可以转换为其它的数据类型。
 */
public class ForceConversion {
    public static void main(String[] args) {
        String a = "43";
        System.out.println(a);
        int i = Integer.parseInt(a);
        System.out.println(i);
    }
}
