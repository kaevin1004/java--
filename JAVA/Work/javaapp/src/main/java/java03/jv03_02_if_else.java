package java03;

import java.util.Scanner;

public class jv03_02_if_else {
    public static void main(String[] args) {
        
        int grade = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("점수를 입력하시오");
        
        grade = keyboard.nextInt();
        
        if (grade >= 70) {
            
            System.out.println("합격입니다.");
            System.out.println("장학금도 받을 수 있습니다.");
            
        }
        else {
            System.out.println("불학격입니다.");
            System.out.println("장학금을 받을 수 없습니다.");
        }
    }
    
}
