package homejava2;

import java.util.Scanner;

public class homejava02_04_ifelse {
    public static void main(String[] args){
        
        int n=0;//변수 n을 설정
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("숫자를 입력하시오:");
        n=keyboard.nextInt();
//n을 키보드 로 숫자 입력하게 함        
        if(n>=100){//n이 100보다 크거나 같다면if문 실행
            System.out.println("Large");
        }
        else{//n이 100보다 작으면 else문 실행
            System.out.println("small");
        }
    }
    
}
