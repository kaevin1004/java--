package java02;

import java.util.Scanner;

public class jv02_01_구구단ifelse {
    
    public static void main(String[] args){
        
        Scanner key=new Scanner(System.in);
        
        System.out.print("숫자입력:"+" ");
        int a=key.nextInt();
        System.out.print("숫자입력:"+" ");
        int b=key.nextInt();
        
        int temp=0;
        
        if(a>b){
            temp=a;
            a=b;
            b=temp;
        }
        
        for(int i=a; i<=b; i=i+1){
            
            for(int j=1; j<=9; j=j+1){
                int sum=i*j;
                System.out.print(i+"*"+j+"="+" "+sum);
                
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
