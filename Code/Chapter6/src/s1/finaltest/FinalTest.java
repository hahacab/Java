package s1.finaltest;

import org.junit.Test;

public class FinalTest {
    final int WIDTH = 10;
    final int LEFT;
    {
        LEFT = 1;
    }


    @Test
    public void test1(){
        FinalD finalD = new FinalD();
        finalD.eat();
        finalD.sleep();
    }
    @Test
    public void test2(){
      final int NUM = 10;
      show(NUM);
    }
    public void show(final int num){
//        num = 10;//无法将值赋给 final 变量 'num'
        System.out.println(num);
    }
}
final class FinalA{ }
//class B extends FinalA{//无法从final 's1.finaltest.FinalA' 继承
//
//}
class FinalC{
public final void eat(){
    System.out.println("我在吃饭");
}
    public  void sleep(){
        System.out.println("我在睡觉");
    }
}
class FinalD extends FinalC{
//    public void eat(){};//'eat()' 无法重写 's1.finaltest.FinalC' 中的 'eat()'；重写的方法为 final

    public  final void sleep(){
        System.out.println("我躺着睡觉");
    }

}