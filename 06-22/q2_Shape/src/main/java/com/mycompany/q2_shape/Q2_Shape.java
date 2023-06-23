package com.mycompany.q2_shape;
public class Q2_Shape {

    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        c1.setR(7);
        System.out.println("Area of Circle = "+c1.calculateArea());
        System.out.println("Perimeter of Circle = "+c1.calculatePerimeter());
        
        System.out.println();
        Rectangle r1 = new Rectangle();
        r1.setL(5);
        r1.setW(2);
        System.out.println("Area of Rectangle = "+r1.calculateArea());
        System.out.println("Perimeter of Rectangle = "+r1.calculatePerimeter());
        
        System.out.println();
        Triangle t1 = new Triangle();
        t1.setB(10);
        t1.setH(5);
        t1.setS1(4);
        t1.setS2(4);
        System.out.println("Area of Triangle = "+t1.calculateArea());
        System.out.println("Perimeter of Triangle = "+t1.calculatePerimeter());

    }
}
