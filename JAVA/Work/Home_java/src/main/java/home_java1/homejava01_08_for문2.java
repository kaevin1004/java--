package home_java1;

import java.util.Scanner;

public class homejava01_08_for문2 {
    public static void main(String[] args){
        
        int a=0;
        int b=0;
        Scanner keyboard =new Scanner(System.in);
        System.out.println("정수를 입력하시오:");
        a=keyboard.nextInt();
        b=keyboard.nextInt();
        
        if(a>b){//a가 b보다 클때 if(for문 실행)
            int sum=0;
            for(int i=b; i<=a; i=i+1){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        else{//a가 b보다 작을때 else(for문 실행)
            int sum=0;
            for(int i=a; i<=b; i=i+1){
                sum=sum+i;
            }
            System.out.println(sum);//둘 모두 같은 값.
        }
    }
    
}
