package home_java1;

import java.util.Scanner;

public class homejava01_04_ifelse문2 {
    public static void main(String[] args){
        
        int n=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("숫자를 입력하시오:");
        n=keyboard.nextInt();
        
        if(n>=100){//n이 100보다 크면 if값 출력
            System.out.println("large");
        }
        else{//n이 100보다 작으면 if값 출력
            System.out.println("small");
        }
    }
    
}
