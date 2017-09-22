package java04;

import java.util.Scanner;

public class ex04_13_구구단 {
    public static void main(String[] args){
        int s=0;//시작단수
        int f=0;//종료단수
        int sum=0;//곱하기 합
        int temp=0;//시작값과 종료값을 바꾸기위해 만든 변수
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하시오:");
        s=keyboard.nextInt();//시작 단수 키보드 입력
        System.out.print("종료 단수를 입력하시오:");
        f=keyboard.nextInt();//종료 단수 키보드 입력
        
        if(s>f){//시작값이 종료값보다 클때 if 값이 실행
            temp=s;//시작값을 temp로 넣는다
            s=f;//종료값을 시작값에 넣는다
            f=temp;//temp값을 종료값에 넣는다.
        }//위의 수식은 시작 값과 종료값을 서로 바꾸는 수식
        
        for(int i=s; i<=f; i=i+1){//구구단 반복 for문
            
            for(int j=1; j<=9; j=j+1){//구구단이 끝나는 1~9번을 설정
                
                sum=i*j;//for문의 i와 j 값을 곱한다(곱하기 실행)
                System.out.print(i+"*"+j+"="+ sum );//곱하기 실행문을 출력하는 수식
                
                if(j==9){//j가 9와 같을때 if문을 실행
                    System.out.print(".");
                }else{//j가 9와 같지 않을 때 else문을 실행
                    System.out.print(",");
                }
            }
            System.out.println();//줄바꿈 실행수식 위의 상위 for문으로 돌아가 반복한다.
            
        }
    }
//시작단수와 종료단수중 어느 단수를 높게 입력해도 결과 값은 낮은 수부터 높은 수 곱하기로 나오게 하는 수식
}
