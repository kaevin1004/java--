package java01;

import java.util.Scanner;

public class jv01_03 {
    public static void main(String[] args) {
        
        int salary = 0;
        int deposit = 0;
        
        Scanner keyboard = new Scanner(System.in);//키보드와 프로그램 연결
        System.out.println("월급을 입력하시오");
        
        salary = keyboard.nextInt();
        
        deposit = 10*12*salary;
        
        System.out.println(deposit);
    }
    
}
