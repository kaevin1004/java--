package java03;

import java.util.Scanner;

public class ex03_04_실습예제2 {
    public static void main(String[] args){
        int k = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        k=keyboard.nextInt();
        
        if(k==0)
        {       System.out.println('A');
        }    
        else if(k>3)
        {
                System.out.println('B');
        }
        else
        {
                System.out.println('C');
        }
        
    }
}
       
    
