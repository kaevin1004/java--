package home_java1;

import java.util.Scanner;

public class homejava01_18_for문 {
    public static void main(String[] args){
        
        int a=0;
        int b=0;
        int temp;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작 값:");
        a=keyboard.nextInt();
        System.out.println("종료 값:");
        b=keyboard.nextInt();
        
        if(a>b){
            temp=b;//종료값을 temp에 넣는다
            b=a;//시작값을 종료값에 넣는다
            a=temp;//temp를 시작값에 넣는다.
        }//a가b보다 크면 a와 b의 값이 서로 변경됨.
        else{
            //a가b보다 작으면 for문으로 넘어감
        }
        int sum=0;
        for(int i=a; i<=b; i=i+1){
            sum=sum+i;
        }
        System.out.println(sum);//결국 같은 값이 출력됨.
    }
        
}
