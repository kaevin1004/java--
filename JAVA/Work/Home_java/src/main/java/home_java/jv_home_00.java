package home_java;

import java.util.Scanner;

public class jv_home_00 {
    public static void main(String[] args){
        int salary;
        int deposit;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("월급을 입력하시오:");
        salary=keyboard.nextInt();
        
        deposit=10*12*salary;
        System.out.println("10년 동안의 저축액:"+deposit);
    }
    
}
