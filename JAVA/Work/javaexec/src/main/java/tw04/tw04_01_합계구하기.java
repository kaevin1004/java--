package tw04;

import java.util.Scanner;

public class tw04_01_합계구하기 {
    public static void main(String[] args){
        
        int a=0;
        int b=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작값을 입력하시오:");
        a=keyboard.nextInt();
        System.out.print("종료값을 입력하시오:");
        b=keyboard.nextInt();
        
        int sum=0;
        
        for(int i=a; i<=b; i=i+1){
            sum=sum+i;
            System.out.print(i);
            
            if(i==b){
                System.out.print("=");
            }
            else{
                System.out.print("+");
            }
        }
        System.out.println(sum);
    }
    
}
