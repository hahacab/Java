package s1.singleton;
//饿汉式
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getBank();
        Bank bank2 = Bank.getBank();

        System.out.println(bank1 == bank2);
    }
}


class Bank{
    //1.私有化类的构造器
    private Bank(){}

    //2.内部创建类的对象,此对象必须声明为静态的。
    private static Bank bank = new Bank();

    //3.提供公共的静态方法，返回类的对象
    public static Bank getBank(){
        return bank;
    }

}
