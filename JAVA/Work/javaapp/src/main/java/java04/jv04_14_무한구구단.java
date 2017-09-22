package java04;

import java.util.Scanner;

public class jv04_14_무한구구단 {
    public static void main(String[] args){
        
        int s=0;//시작
        int f=0;//종료
        int temp;//시작단수 값과 종료단수 값을 서로 바꿔주기 위해 만든 변수
        int sum=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        for(;true;){//for무한루프문장을 먼저 실행해야만이 아래 수식break가 실행된다.
            
            System.out.print("시작단수:");
            s=keyboard.nextInt();//시작단수 키보드 입력
            System.out.print("종료단수:");
            f=keyboard.nextInt();//종료단수 키보드 입력
            
            
            if(s>f){//s시작단수가 f종료단수보다 크다면 if값 실행
                temp=s;//시작단수를 temp에 넣는다
                s=f;//종료단수를 시작단수에 넣는다
                f=temp;//temp를 종료값에 넣는다
            }
            
            if(s==0||f==0){//시작단수가 0이거나(||=ro)종료단수가 0일 경우if값 실행
                System.out.println("0이있다.");
                break;//프로그램을 종료시키며 빠져나간다.
            }   //break가 실행되려면 for무한루프 문장이 가장 먼저 입력되어야 한다.      
            
            for(int i=s; i<=f; i=i+1){//구구단 실행
                for(int j=1; j<=9; j=j+1){
                    sum=i*j;//구구단 곱하기 실행 수식
                    System.out.println(i+"*"+j+"="+sum);//구구단 실행 출력하는 수식
                    
                }
            }
            System.out.println();//줄바꿈을 실행 다시 for문으로 올라가서 반복 실행한다.
        }
        
    }
    
}
