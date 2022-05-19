package com.leihang.exer.p9;

public class GeometricTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle("black",2.0,2.3);
        System.out.println("颜色是否相等： "+circle1.getColor().equals(circle2.getColor()));
        System.out.println("半径是否相等： "+circle1.equals(circle2));
        System.out.println(circle1);
    }
}
class GeometricObject{
    protected String color;
    protected double weight;

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
    public boolean equals(Object obj){
        if (this == obj)return true;
        if (obj instanceof Circle){
            Circle circle = (Circle) obj;
            return this.radius == circle.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[Circle]{radius = "+ this.radius+"}";
    }
}

