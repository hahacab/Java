/*
?顺序结构
Java中定义成员变量时采用合法的前向引用。如：
public class Test{
int num1 = 12;
int num2 = num1 + 2;
}
错误形式：
public class Test{
int num2 = num1 + 2；
int num1 = 12;
}

 */
public class SequentialStructure {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = num1 + 2;
        System.out.println(num2);
    }
}
