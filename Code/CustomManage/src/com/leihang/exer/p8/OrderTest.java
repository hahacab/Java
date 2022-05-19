package com.leihang.exer.p8;

import java.util.Currency;

public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(5,"Cake");
        Order o2 = new Order(4,"Cake");
        Order o3 = new Order(4,"Cake");
        System.out.println(o1.equals(o2));
        System.out.println(o2.equals(o3));
    }
}
class Order{
    private int orderId;
    private String orderName;

    public Order(int orderId,String orderName){
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderId(int orderId) {
        orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null|| !(obj instanceof Order))return false;
        Order order = (Order) obj;
        return orderName.equals(order.getOrderName()) && orderId == order.getOrderId();
    }
}