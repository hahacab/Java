package s1.block;

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.description;
        System.out.println(desc);
        Person person1 = new Person();
        Person person2 = new Person();
        Person.info();
        System.out.println("person1的年龄："+person1.age);
    }
}

class Person {
    //属性
    String name;
    int age;
     static String description = "我是一个人";

    //代码块
    static {
        System.out.println("Hello,static block-1!");
        description = "我是一个爱学习的人！";
    }

    static {
        System.out.println("Hello,static block-2!");
    }

    {
        System.out.println("Hello,block");
        age = 1;
    }


    //构造器
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人！");
    }
}