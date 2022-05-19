package s2.java8;

public class SubClassTest{
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.method1();
        subClass.method2();
        subClass.method3();

    }
}
class SubClass extends SuperClass implements CompareA,CompareB{


    @Override
    public void method1() {
        CompareA.super.method1();
    }

    @Override
    public void method2() {
        System.out.println("SubClass: 上海");
    }
}