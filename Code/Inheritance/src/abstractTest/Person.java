package abstractTest;

abstract class Person {//包含一个或多个抽象方法的类本身必须被声明为抽象的。
    private String name;
    public abstract String getDescription();//抽象方法

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
