package homejava2;

import java.util.Scanner;

public class homejava02_17_구구단가로출력2 {
    public static void main(String[] args){
        
        int sum=0;
        int a=0;
        int b=0;
        int temp=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작단수를 입력하시오:");
        a=keyboard.nextInt();
        System.out.print("종료단수를 입력하시오:");
        b=keyboard.nextInt();
        
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        
        for(int i=a; i<=b; i=i+1){
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
