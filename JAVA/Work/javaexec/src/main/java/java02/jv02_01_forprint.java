package java02;

import java.util.Scanner;

public class jv02_01_forprint {
    
    public static void main(String[] args){
        
       Scanner keyboard=new Scanner(System.in);
       
       int x=0;
       int y=0;
       System.out.print("정수:");
       x=keyboard.nextInt();
       System.out.print("정수:");
       y=keyboard.nextInt();
       
       int sum=0;
       for(int i=x; i<=y; i=i+1){
           sum=sum+i;
           System.out.print(i);
           
           if(i==y){
               System.out.print("=");
           }
           else{
               System.out.print("+");
           }
       }
       System.out.println(sum);
    }
    
}
