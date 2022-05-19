package s1.abstracttest;
/*
abstract: 抽象的
1.可以用来修饰：类、方法
2.具体的：
3.abstract修饰类：抽象类
 *      > 此类不能实例化
 *      > 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 *      > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作 --->抽象的使用前提：继承性

4.abstract修饰方法：抽象方法
 * 		> 抽象方法只方法的声明，没方法体
 * 		> 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *      > 若子类重写了父类中的所的抽象方法后，此子类方可实例化
 *        若子类没重写父类中的所的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰
3.注意点：
 * 1.abstract不能用来修饰：属性、构造器等结构
 * 2.abstract不能用来修饰私方法、静态方法、final的方法、final的类
*/
public class AbstractTest {
    public static void main(String[] args) {
//        Person person1 = new Person();//'Person' 为 abstract；无法实例化
//        person1.eat();
        Student student1 = new Student();
        student1.eat();
    }
}
abstract class Creature{
    public abstract void breath();
}
abstract class Person extends Creature{
    String name;
    int age;

    public Person(){};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public void walk(){
        System.out.println("人走路");
    }

}
class Student extends Person{//类 "Student" 必须声明为抽象，或为实现 "Person" 中的抽象方法 "eat()"

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void breath() {
        System.out.println("学生呼吸");
    }
}