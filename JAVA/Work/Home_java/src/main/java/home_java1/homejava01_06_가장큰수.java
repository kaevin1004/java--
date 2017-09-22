package home_java1;

import java.util.Scanner;

public class homejava01_06_가장큰수 {
    public static void main(String[] args){
        int a=1;
        int b=4;
        int c=5;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("첫번째 수를 입력하시오:");
        a=keyboard.nextInt();
        System.out.print("두번째 수를 입력하시오:");
        b=keyboard.nextInt();
        System.out.print("세번째 수를 입력하시오:");
        c=keyboard.nextInt();
        
        if(a>b){//a가 b보다 크다면
            if(a>c){//a가 c보다 크다면 if 실행
                System.out.println("입력 받은 수중 가장 큰 수는:"+a+"입니다.");
            }
            else{//a가 c보다 크지 않다면 else 실행
                System.out.println("입력 받은 수중 가장 큰 수는:"+c+"입니다.");
            }
            
        }
        else{//a가b보다 크지 않다면 실행
            if(b>c){//b가 c보다 크다면 if 실행
                System.out.println("입력받은 수중 가장 큰 수는:"+b+"입니다.");
            }
            else{//b가 c보다 크지 않다면 else 실행
                System.out.println("입력받은 수중 가장 큰 수는:"+c+"입니다.");
            }
        }
                
    }
    
}
