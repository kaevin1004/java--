package java01;

import java.util.Scanner;

public class jv01_02_scanner {
    public static void main(String[] args) {
        
       int x = 0;
       Scanner keyboard = new Scanner(System.in);//키보드와 프로그램 연결
       System.out.println("숫자를 입력하시오");
       
       x = keyboard.nextInt();
       
       System.out.println("문자를 입력하시오");
       String u = keyboard.next();
       
    }
    
}
