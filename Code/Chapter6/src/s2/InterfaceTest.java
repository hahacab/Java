package s2;
/*
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 *
 * 		3.1 JDK7及以前：只能定义全局常量和抽象方法
 * 			>全局常量：public static final的.但是书写时，可以省略不写
 * 			>抽象方法：public abstract的
 *
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法(略)
 *
 * 4. 接口中不能定义构造器的！意味着接口不可以实例化
 *
 * 5. Java开发中，接口通过让类去实现(implements)的方式来使用.
 *    如果实现类覆盖了接口中的所抽象方法，则此实现类就可以实例化
 *    如果实现类没覆盖接口中所的抽象方法，则此实现类仍为一个抽象类
 *
 * 6. Java类可以实现多个接口   --->弥补了Java单继承性的局限性
 *   格式：class AA extends BB implements CC,DD,EE
 *
 * 7. 接口与接口之间可以继承，而且可以多继承
 *
 * *******************************
 * 8. 接口的具体使用，体现多态性
 * 9. 接口，实际上可以看做是一种规范
 *
* */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
//        Flyable.MIN_SPEED = 2;//无法将值赋给 final 变量 'MIN_SPEED'
        Plane plane = new Plane();
        plane.fly();
        plane.stop();
    }
}
interface Flyable{
    public final static int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//全局常量

    public abstract void fly();//修饰符 'abstract' 对于接口方法是冗余的
    void stop();//抽象方法


}

interface Attackable{
    void stack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("芜湖，起飞！");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止!");
    }
}

interface AA extends Attackable,Flyable{}

abstract class Kate implements Flyable{//类 "Kate" 必须声明为抽象，或为实现 "Flyable" 中的抽象方法 "stop()"

    @Override
    public void fly() {

    }
}
class Bullet implements AA{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void stack() {

    }
}