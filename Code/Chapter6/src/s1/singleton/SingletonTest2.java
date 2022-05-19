package s1.singleton;
//懒汉式
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getOrder();
        Order order = Order.getOrder();

        System.out.println(order1 == order1);
    }
}
class Order{
    //1.私有化类的构造器
    private  Order(){

    }

    //2.声明当前类的对象,此对象必须声明为静态的。
    private static Order order = null;

    //3.提供公共的静态方法，返回类的对象
    public static Order getOrder(){
        if (order == null)
            order = new Order();
        return order;
    }
}