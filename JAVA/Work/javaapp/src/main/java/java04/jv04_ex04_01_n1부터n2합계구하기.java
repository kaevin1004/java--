package java04;

import java.util.Scanner;

public class jv04_ex04_01_n1부터n2합계구하기 {
    public static void main(String[] args){
        
        int n1=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하시오:");//숫자 탭 숫자 입력
        n1=keyboard.nextInt();//ni 키보드 입력 값 적기
        int n2=0;
        n2=keyboard.nextInt();//n2 키보드 입력 값 적기
        
        int sum=0;
        
        for(int i=n1; i<=n2; i=i+1){//반복문 숫자 값 입력
            sum = sum+i;
            System.out.print(i);//i값을 출력
            
            if(i==n2){//i(n1)가 n2와 같다면?(같을때 까지 반복 실행함)
                System.out.print("=");//true면 if 실행
            }
            else{
                System.out.print("+");//false면 else 실행
            }
        }
        System.out.println(sum);//for문 종료시 총 합계 출력 입력
    }
    
}
