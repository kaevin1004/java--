package 문제풀이복습.st문자.숫자판독;

import java.util.Scanner;

public class 문자숫자판독 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        
        System.out.print("문자를 입력하시오 : ");
        String input = key.next();
        
        char ch = input.charAt(0);
          
        
        if(('a'<=ch && ch<='z') || ('A' <=ch && ch<='Z')){
            
            System.out.println("영문자입니다.");
            
        }
        
        //문자로 산술연산을 하는 경우 정수로 형변환되어 비교된다.
        if('0'<=ch && ch<='9'){
            
            System.out.println("숫자입니다.");
            
        }
        
    }
    
}
