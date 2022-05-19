package com.leihang.exer;

public class GeometricObject {
    protected String color;
    protected double weight;
    public GeometricObject(String color,double weight){
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return 0.0;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return weight;
    }
}
class Circle extends GeometricObject{
    private double radius;

    public Circle(String color,double weight,double radius){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
class MyRectangle extends GeometricObject{
    private double width;
    private double height;
    public MyRectangle(String color,double weight,
                       double width,double height){
        super(color,weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width*height;
    }
}
