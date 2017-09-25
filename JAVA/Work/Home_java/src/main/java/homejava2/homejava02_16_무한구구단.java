package homejava2;

import java.util.Scanner;

public class homejava02_16_무한구구단 {
    public static void main(String[] args){
        
        int s=0;
        int f=0;
        int sum=0;
        int temp=0;
        Scanner keyboard = new Scanner(System.in);
        
        for(;true;){
            System.out.print("시작단수:");
            s=keyboard.nextInt();
            System.out.print("종료단수:");
            f=keyboard.nextInt();
            
            if(s==0||f==0){
                System.out.println("0이 포함입니다.");
                break;
            }
            if(s>f){
                temp=s;
                s=f;
                f=temp;
            }
            for(int i=s; i<=f; i=i+1){
                for(int j=1; j<=9; j=j+1){
                    sum=i*j;
                    System.out.print(i+"*"+j+"="+sum);
                    
                    if(j==9){
                        System.out.print(".");
                    }
                    else{
                        System.out.print(",");
                    }
                    
                }
                System.out.println();
             }
        }
        
    }
}
