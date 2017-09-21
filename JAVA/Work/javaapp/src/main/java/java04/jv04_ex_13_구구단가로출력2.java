package java04;

import java.util.Scanner;

public class jv04_ex_13_구구단가로출력2 {
    public static void main(String[] args){
        int r=0;
        int a=0;
        int b=0;
        //시작값:15   종료값:11
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하시오:");
        a=keyboard.nextInt();//a는 시작값
        System.out.print("종료 단수를 입력하시오:");
        b=keyboard.nextInt();//b는 종료값
        
        if(a<b) {//시작값a가 종료값b보다 작다면 if값 실행
            for(int i=a; i<=b; i=i+1){//i=시작값; i<=종료값; i=i+1)
                
                for(int j=1; j<=9; j=j+1){//2단 3단(*j)j는 구구단의 뒤의 값
                    r=i*j;
                    System.out.print(i+"*"+j+"="+r);
                    if(j==9){//j가 9와 같다면 if 값을 출력
                        System.out.print(".");
                    }
                    else{//j가 9와 같지 않다면 else 값을 출력
                        System.out.print(",");
                    }
                }
                System.out.println();
           }
            
        }
        else {//시작값a가 종료값b보다 크다면 else 값 실행
            
            for(int i=b; i<=a; i=i+1){//종료값이 크게 적용해야 함.
                
                for(int j=1; j<=9; j=j+1){
                    r=i*j;
                    System.out.print(i+"*"+j+"="+r);
                    if(j==9){
                        System.out.print(".");
                    }
                    else{
                        System.out.print(",");
                    }
                }
                System.out.println();
           }
         
        }
               
        
        
    }
    
}
