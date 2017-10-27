package 문제풀이복습;

import java.util.Scanner;

public class 문제풀이사칙연산 extends 문제풀이사칙연산2{
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("First num :");
        int a= key.nextInt();
        
        System.out.print("Second num :");
        int b= key.nextInt();
        
        System.out.println(add(a,b));
        System.out.println(minus(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
    }
    
}
