package javawork;

import java.util.Scanner;

public class ex03_01_LargeSmall {
    public static void main(String[] args){
        
        int n=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하시오:");
        n = keyboard.nextInt();//n의 값을 키보드로 입력하게 하는 코드
        
        if(n>=100){//n이 100보다 크거나 같으면
            System.out.println("large");//true시 if 값 출력
        }
        else{
            System.out.println("small");//fales시 else 값 출력
        }
    }
    
}
