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

        //오른 차순 정렬 mode =  1;
        //내림 차순 정렬 mode = -1;
        
        
        int mode = 1;
        
        
        
        public RatingCompare() {
            super();
            mode = 1;
        }
        
        



        public RatingCompare(boolean desc) {
            super();
            if(desc == true) mode = -1;
        }





        @Override
        public int compare(Movie o1, Movie o2) {
            
            if(o1.getRating() < o2.getRating()){
                
                return -1*mode;//바꾸지 않는다
                
            }
            else if(o1.getRating() > o2.getRating()){
                
                return 1*mode;//바꾼다.
                
            }
            else{
                
                return 0*mode;
                
            }
            
            
        }
        
        
        
    }
    
    public static class NameCompare implements Comparator<Movie>{
        
        private int mode = 1;
        
        

        public NameCompare() {
            super();
        }

        
        public NameCompare(boolean desc) {
            super();
            if(desc == true) this.mode =-1;
        }




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
     
        //rating을 기준으로 정렬 : Comparator
        //1. Movie.RatingCompare 인스턴스 만들기
        //2. Collections.sort() 실행
        //3. print
        Movie.RatingCompare rating = new Movie.RatingCompare();
        Collections.sort(list, rating);
        System.out.println(list.toString());
        
        //name을 기준으로 오름차순 정렬
        //1. Movie.RatingCompare 인스턴스 만들기
        //2. Collections.sort() 실행
        //3. print
        Movie.NameCompare nameCompare = new Movie.NameCompare();
        Collections.sort(list, nameCompare);
        System.out.println(list.toString());
        
        
    }
    
    
    
}
