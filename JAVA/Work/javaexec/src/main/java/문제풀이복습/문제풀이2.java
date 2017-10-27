package 문제풀이복습;

import java.util.Scanner;

public class 문제풀이2 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        int t = 0;
        
        
        for(; true ;){
            
            System.out.print("시작 단 :");
            int a = key.nextInt();
            
            System.out.print("종료 단 :");
            int b = key.nextInt();
            
            if(a == 0 || b == 0){
                
                System.out.print("시작 단과 종료 단에 0이 포함되어 있어서 종료합니다.");
                
                break;
                
            }
            
            if(a>b){
                t = a;
                a = b;
                b = t;
                
            }
            
            for(int i=a; i<=b; i=i+1){
                
                for(int j=1; j<=9; j=j+1){
                    
                    int sum = i*j;
                    
                    System.out.print(i+" "+"*"+" "+j+" "+"="+" "+" "+sum);
                    
                    if(j == 9){
                        System.out.println(".");
                        
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
