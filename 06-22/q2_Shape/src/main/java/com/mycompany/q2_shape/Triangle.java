package com.mycompany.q2_shape;
public class Triangle implements Shape{
    
    //b = base, h = height, s1 = side1, s2 = side2
    private int b, h, s1, s2;
    private double area, perimeter;
    
    public void setB(int b){
        this.b = b;
    }
    
    public int getB(){
        return b;
    }
    
    public void setH(int h){
        this.h = h;
    }
    
    public int getH(){
        return h;
    }
    
    public void setS1(int s1){
        this.s1 = s1;
    }
    
    public int getS1(){
        return s1;
    }
    
    public void setS2(int s2){
        this.s2 = s2;
    }
    
    public int getS2(){
        return s2;
    }
    
    @Override
    public double calculateArea(){
        area = (b * h)/2;
        return area;  
    }
    
    @Override
    public double calculatePerimeter(){
        perimeter = b + s1 + s2;
        return perimeter;
    }
    
}
