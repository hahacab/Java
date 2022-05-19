public class Practice8 {
}
class Boy{
    private String name;
    private int age;
    public Boy(){

    }
    public Boy(int age){
        this.age = age;
    }
    public Boy(String name){
        this.name = name;
    }
    public Boy(String name,int age){
        this(name);
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String marry(Girl girl){
        return girl.getName();
    }
    public void shout(){
        System.out.println("name="+name+",age="+age);
    }

    public static void main(String[] args) {
        var boy1 = new Boy();
        boy1.shout();
        boy1.setName("Make");
        boy1.setAge(25);
        boy1.shout();
    }
}

class Girl{
    private String name;
    private int age;
    public Girl(){

    }
    public Girl(int age){
        this.age = age;
    }
    public Girl(String name){
        this.name = name;
    }
    public Girl(String name,int age){
        this(name);
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String marry(Boy boy){
        return boy.getName();
    }

    public void compare(Girl girl){
        if (this.age>girl.age)
            System.out.println(this.name+"is older than "+girl.name);
        else
            System.out.println(this.name+"is not older than "+girl.name);
    }

    public static void main(String[] args) {
        Girl gir1 = new Girl("Kitty",19);
        Girl gir2 = new Girl("July");
        Boy boy1 = new Boy("Make",24);
        gir2.setAge(20);
        gir1.compare(gir2);
        gir1.setAge(23);
        gir1.setName("Lolly");
        System.out.println("her husband is "+gir2.marry(boy1));
        gir1.compare(gir2);
    }
}