package s1.abstracttest;
/*
抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());//匿名对象

        method1(new Worker());//非匿名的类的匿名对象

        Person person1 = new Person() {//创建了一个匿名子类的非匿名的对象
            @Override
            public void eat() {
                System.out.println("吃东西");
            }

            @Override
            public void breath() {
                System.out.println("呼吸");
            }
        };
        System.out.println("*********");
        method1(person1);
        System.out.println("*********");
        method1(new Person() {////创建了一个匿名子类的匿名的对象
            @Override
            public void eat() {
                System.out.println("吃");
            }

            @Override
            public void breath() {
                System.out.println("呼吸");
            }
        });
    }
    public static void method(Student student){

    }
    public static void method1(Person person){
        person.eat();
        person.breath();
    }

}
class Worker extends Person{
    @Override
    public void eat() {

    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void breath() {

    }
}
