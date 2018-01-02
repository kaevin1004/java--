package java20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.IOP.CodecFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Movie implements Comparable<Movie>{

    
    
    private double rating;
    private String name;
    private int year;
    
    
    public double getRating() {
        return rating;
    }


    public void setRating(double rating) {
        this.rating = rating;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    

    @Override
    public String toString() {
        return "Movie [rating=" + rating + ", name=" + name + ", year=" + year
                + "]";
    }

    

    public Movie() {
        super();
    }

    

    public Movie( String name, double rating, int year) {
        super();
        this.rating = rating;
        this.name = name;
        this.year = year;
    }


    @Override
    public int compareTo(Movie o) {
        
        //year를 오름차순으로 정렬
        // + 일때
        // 0 일때
        // - 일때
        
        
        return this.year - o.year;
    }
    
    // rating 값으로 정렬 
    
    public static class RatingCompare implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
            
            if(o1.getRating() < o2.getRating()){
                
                return -1;//바꾸지 않는다
                
            }
            else if(o1.getRating() > o2.getRating()){
                
                return 1;//바꾼다.
                
            }
            else{
                
                return 0;
                
            }
            
            
        }
        
        
        
    }
    
    public static class NameCompare implements Comparator<Movie>{

        @Override
        public int compare(Movie o1, Movie o2) {
           
            return o1.getName().compareTo(o2.getName());
        }
        
    }
    
   
}


public class jv20_11Comparable_Comparator {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    
    public static void main(String[] args) {
        
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force", 8.3, 2015));
        list.add(new Movie("Start", 8.7, 1977));
        list.add(new Movie("Empir", 8.8, 1990));
        list.add(new Movie("Retur", 8.4, 2000));
        
        
        //year 를 기준으로 정렬
        Collections.sort(list);//Movie.compareTo()를 사용하여 정렬된다.
        System.out.println(list.toString());
        
    }
    
    
    
}
