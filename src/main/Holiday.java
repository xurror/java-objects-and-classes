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
public class Holiday {
    private String name;
    private int day;
    private String month;
    
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }
    
    public boolean inSameMonth(Holiday holiday){
        return this.month == holiday.month;
    }
    
    public float avgDate(Holiday[] holidays){
        int count=0;
        int sum=0;
        for (Holiday holiday : holidays){
            sum += holiday.day;
            count++;
        }
        
        return sum/count;
                
    }
}
