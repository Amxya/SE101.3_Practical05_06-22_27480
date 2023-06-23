package com.mycompany.q2_shape;
public class Rectangle implements Shape{
    
    //l = length, w = width
    private int l, w;
    private double area, perimeter;
    
    public void setL(int l){
        this.l = l;
    }
    
    public int getL(){
        return l;
    }
    
    public void setW(int w){
        this.w = w;
    }
    
    public int getW(){
        return w;
    }
    
    @Override
    public double calculateArea(){
        area = l * w;
        return area;  
    }
    
    @Override
    public double calculatePerimeter(){
        perimeter = (2 * l) + (2 * w);
        return perimeter; 
    }
    
}
