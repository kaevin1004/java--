package java08;

import java.util.Scanner;

public class jv08_03_문자열예제_문자열비교 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        System.out.print("문자열 입력:");
        String x=keyboard.next();
        System.out.print("문자열 입력:");
        String y=keyboard.next();
        
        //equal을 이용하여 비교
        if(x.equals(y)){
            System.out.println("x.equals(y) : same");
        }
        else{
            System.out.println("x.equals(y) : not same");
            
        }
        
        if(x==y){
            System.out.println("x.equals(y) : same");
        }
        else{
            System.out.println("x.equals(y) : not same");
            
        }
        
        
        // ==을 이용하여 비교
        
    }
    
}
