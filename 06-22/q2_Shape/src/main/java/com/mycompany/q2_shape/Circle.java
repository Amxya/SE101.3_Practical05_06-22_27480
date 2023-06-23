package com.mycompany.q2_shape;
public class Circle implements Shape{
    
    //r = radius
    private int r;
    private double area, perimeter;
    
    public void setR(int r){
        this.r = r;
    }
    
    public int getR(){
        return r;
    }
    
    @Override
    public double calculateArea(){
        area = Math.PI * r * r;
        return area;  
    }
    
    @Override
    public double calculatePerimeter(){
        perimeter = 2 * Math.PI * r;
        return perimeter;
        
    }
    
    
}
