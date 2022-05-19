package com.leihang.exer;

public class GeometricTest {
    public boolean equalsArea(GeometricObject a,GeometricObject b){
        return a.findArea() == b.findArea();
    }
    public void displayGeometricObject(GeometricObject a){
        System.out.println("面积为： "+a.findArea());
    }

    public static void main(String[] args) {
        var test = new GeometricTest();
        var c1 =new  Circle("black",0,10);
        var r1 =new  MyRectangle("black",0,Math.PI*10,10);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(r1);
        System.out.println(test.equalsArea(c1,r1));
    }
}
