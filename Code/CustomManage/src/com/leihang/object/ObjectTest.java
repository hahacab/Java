package com.leihang.object;

public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}
class Order{}