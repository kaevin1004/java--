package java01;

import java.util.Scanner;

public class jv01_06_무한구구단 {
    
    public static void main(String[] args){
        
        Scanner key=new Scanner(System.in);
        
        
        
        for(;true;){
        System.out.print("시작 : ");
        int a=key.nextInt();
        System.out.print("종료 : ");
        int b=key.nextInt();
        
        int temp=0;
        int sum=0;
        
        if(a==0 || b==0){
            
            System.out.println("구구단에 0이 포함되어 종료합니다.");
            break;
        }
        
        if(a>b){
            temp=a;
            a=b;
            b=temp;
                   
        }
        for(int i=a; i<=b; i=i+1){
            
            for(int j=1; j<=9; j=j+1){
                
                sum=i*j;
                System.out.print(i+" "+"*"+" "+j+" "+"="+" "+sum);
                
                if(j==9){
                    System.out.print(".");
                }
                else{
                    System.out.print(","+" ");
                }
            }
            System.out.println();
        }
        }
    }
}    
