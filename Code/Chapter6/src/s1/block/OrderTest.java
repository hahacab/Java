package s1.block;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order {
    int orderId = 3;

    {
        orderId = 4;
    }

}