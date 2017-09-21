package tw04;

import java.util.Scanner;

public class tw04_05_합계구하기swap {
    public static void main(String[] args){
        
        int s=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 값:");
        s=keyboard.nextInt();
        
        int f=0;
        System.out.print("종료 값:");
        f=keyboard.nextInt();
        
        int temp;//종료값을 temp에 넣는다.
        int sum=0;
        
        if(s>f){
                temp=s;
                s=f;
                f=temp;
        }
        
    for(int i =s; i<=f; i=i+1){
        sum = sum+i;
    }
    System.out.println("합계"+sum);
            
    }
    
}
