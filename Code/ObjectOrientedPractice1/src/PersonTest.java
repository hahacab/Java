public class PersonTest {
    public static void main(String[] args) {
        Person1 per1 = new Person1();
        System.out.println(per1.getAge());
        per1.setAge(20);
        System.out.println(per1.getAge());
        System.out.println(per1.getName());
        per1.setName("Julia");
        System.out.println(per1.getName());
    }
}
class Person1{
    private int age;
    private String name;

    public Person1(){
        age=18;
        name="unknown";
    }
    public void setAge(int aAge){
        if (aAge>=0)
            age = aAge;
        else System.out.println("Wrong Age!");
    }
    public void setName(String aName){
        name = aName;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}