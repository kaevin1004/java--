package java04;

import java.util.Scanner;

public class jv04_ex04_21_무한입력 {
    public static void main(String[] args){
        int a=0;
        
        Scanner keyboard = new Scanner(System.in);
       //입력 스캐너 받는 수식을 넣고
        
        
        for(int i=a; true; i=i+1){//무한루프 for문
            System.out.print("정수를 입력하시오:");
            a=keyboard.nextInt();
            //키보드로 입력하는 숫자 수식을 for문 안에 넣어야 한다.
            if(a>=0){//a가 0보다 크거나 같으면 if문 계속 무한 반복
                System.out.println(a);
            }
            else{//a가 0보다 작은 숫자가 나오면 무한루프에서 빠져나옴
                break;
            }
        }
        System.out.println();//줄바꿈으로 다시 for문으로 돌아가 계속 반복문이 된다.
        
    }   
    
}
