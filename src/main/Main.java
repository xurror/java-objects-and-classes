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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Circle myCircle;
        myCircle = new Circle(5, "Blue");
                
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Color: " + myCircle.getColor());
        System.out.println("Area: " + myCircle.area());
        */
        
        /*
        Rectangle myRectangle;
        myRectangle = new Rectangle(3,7, "Blue");
                
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());
        System.out.println("Color: " + myRectangle.getColor());
        System.out.println("Perimeter: " + myRectangle.perimeter());
        System.out.println("Area: " + myRectangle.area());
        */
        
        /*
        Holiday one = new Holiday("One", 4, "Jan");
        Holiday two = new Holiday("Two", 4, "Feb");
        Holiday Independence_Day = new Holiday("Independence Day", 4, "July");
        
        Holiday[] holidays = {one, two};
        
        System.out.println(one.inSameMonth(two));
        System.out.println(one.avgDate(holidays));
        */
        
        Movie myMovie = new Movie("Casino Royale", "Eon Production", "PG-13");
        Movie[] Movies = new Movie[50];
        Movie[] movies = {myMovie};
        
        Movies = myMovie.getPG(movies);      
        
        System.out.println(Movies[0].getTitle());
    }
    
}
