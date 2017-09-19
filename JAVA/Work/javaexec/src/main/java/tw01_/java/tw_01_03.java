package tw01_.java;

import java.util.Scanner;

public class tw_01_03 {
    public static void main(String[] args){
        
        int salary = 0;
        int deposit = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("월급을 입력하시오");
        
        salary = keyboard.nextInt();
        
        deposit = 10*12*salary;
        System.out.println("10년 동안의 저축액:"+deposit);
    }
    
}
