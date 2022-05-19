package s3;
/*
内部类：类的第五个成员
1.定义：Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类.
2.内部类的分类：
成员内部类（静态、非静态 ） vs 局部内部类(方法内、代码块内、构造器内)
3.成员内部类的理解：
一方面，作为外部类的成员：
 * 			>调用外部类的结构
 * 			>可以被static修饰
 * 			>可以被4种不同的权限修饰
 *
另一方面，作为一个类：
 * 			> 类内可以定义属性、方法、构造器等
 * 			> 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 * 			> 可以被abstract修饰,表示类不能被实例化。
4.成员内部类：
4.1如何创建成员内部类的对象？(静态的，非静态的)
//创建静态的Dog内部类的实例(静态的成员内部类):
Person.Dog dog = new Person.Dog();

//创建非静态的Bird内部类的实例(非静态的成员内部类):
//Person.Bird bird = new Person.Bird();//错误的
Person p = new Person();
Person.Bird bird = p.new Bird();
*/
public class InnerClassTest {
    public static void main(String[] args) {
        //创建静态成员内部类的对象
        Person.Brain brain =new Person.Brain();
        //创建非静态成员内部类的对象
        Person person =new Person();
        Person.Legs legs = person.new Legs();

        brain.sing();
        legs.sing();
        legs.display("形参");
    }




}
class Person{
    private String name = "人";
    public void eat(){
        System.out.println("人吃饭");
    }
    static class Brain{ //静态成员内部类
        String name;
        public Brain(){};
        public void sing(){
            System.out.println("我是一只小小脑");
//            eat();静态类不能调用非静态方法
        }
    }

    class Legs{
        private String name = "你的腿就是我的腿，你的命就是我的命";
        public void sing(){
            System.out.println("我是一只小小腿");
            Person.this.eat();
        }
        public void display(String name){
            System.out.println(name);//调用形参
            System.out.println(this.name);//调用Legs对象的属性
            System.out.println(Person.this.name);//调用Person对象的属性
        }
    }//非静态成员内部类

    {
        class BB{}//局部内部类
    }

    public void method(){
        class AA{}//局部内部类
    }

    public Person(){
        class CC{}//局部内部类
    }

}
