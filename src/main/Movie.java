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
public class Movie {
    
    private String title;
    private String studio;
    private String rating;
    
    public Movie(String title, String studio, String rating){
        this.rating=rating;
        this.studio=studio;
        this.title=title;
    }
    
    public Movie(String title, String studio){
        this.rating="PG";
        this.studio=studio;
        this.title=title;
    }
    
    public Movie[] getPG(Movie[] movies){
        Movie[] PGMovies = new Movie[50];        
        int i=0;
        
        for (Movie movie : movies){
            if (movie.rating.substring(0, 2).equals("PG")){
                PGMovies[i] = movie;
                i++;
            }
        }
        
        return PGMovies;
    }
    
    public String getTitle(){
        return this.title;
    }
    
}
