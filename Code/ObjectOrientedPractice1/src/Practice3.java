/*

 */
public class Practice3 {
    public static void main(String[] args) {
        var per1 = new Person("Judy",26,1);
        per1.study();
        per1.showAge();
        per1.addAge();
        per1.showAge();

        var cir1 = new Circle(6.2);
        cir1.showPerimeter();

    }
}
class Person{
    private String name;
    private int age;
    private int sex;

    public Person(String aName,int aAge,int aSex){
        name =aName;
        age =aAge;
        sex =aSex;
    }

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("age="+age);
    }

    public void  addAge(){
        age+=2;
    }
}
class Circle{
    private double radius;
    public Circle(double aRadius){
        radius = aRadius;
    }
    public void showPerimeter(){
        System.out.println("Perimeter="+2*Math.PI*radius);
    }
}