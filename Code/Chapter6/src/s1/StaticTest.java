package s1;

public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.setName("雷航");
        c1.setAge(20);


        Chinese c2 = new Chinese();
        c2.setName("马龙");
        c2.setAge(40);
        Chinese.nation = "中国";

        System.out.println(c1);
        System.out.println(c2);

        c1.setNation("CHN");
        System.out.println(c1);
        System.out.println(c2);

    }
}

class Chinese {
     static String nation;
    private String name;
    private int age;

    public void setNation(String nation) {
        Chinese.nation = nation;
    }

    public String getNation() {
        return nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("中国人吃中餐！");
//        show();
    }

    public static void show(){
        System.out.println("我是中国人！");
//        eat();无法从 static 上下文引用非 static 方法 'eat()'
//        System.out.println(s1.Chinese.nation);
    }

    @Override
    public String toString() {
        return "s1.Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation=" + nation +
                '}';
    }
}