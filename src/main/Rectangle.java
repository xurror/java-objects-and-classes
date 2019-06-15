/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author xurror
 */
public class Rectangle {
    
    private int ID = 0;
    private float length;
    private float width;
    private String color;
    
    public Rectangle(){
        this.ID++;
        this.length = 0;
        this.width = 0;
        this.color = "Black";
    }
    
    public Rectangle(float side1, float side2, String color){
        this.ID++;
        if (side1 >= side2){
            this.length = side1;
            this.width = side2;
        }
            
        else{
            this.length = side2;
            this.width = side1;
        }
        
        this.color = color;
    }
    
    public float perimeter(){
        return (this.length+this.width)*2;
    }
    
    public float area(){
        return this.length * this.width;
    }
    
    public void setLength(float length){
        this.length = length;
    }
    
    public float getLength(){
        return this.length;
    }
    
    public void setWidth(float width){
        this.width = width;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
}
