package home_java1;

import java.util.Scanner;

public class homejava01_03_ifelse문 {
    public static void main(String[] args){
        
        int grade=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("점수를 입력하시오:");
        grade=keyboard.nextInt();
        
        if(grade>=60){//grade가 60보다 크면 if값이 출력
            System.out.println("합격입니다.");
            System.out.println("장학금을 받을 수 있습니다.");
        }
        else{//grade가 60보다 작으면 else값 출력
            System.out.println("불합격입니다.");
            System.out.println("장학금을 받지 못합니다.");
        }
    }
    
}
