package 문제풀이복습;

import java.util.Scanner;

public class 문제풀이메서드무한구구단 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        for(; true ;){
            
            System.out.print("시작 단 :");
            int a = key.nextInt();
            
            System.out.print("종료 단 :");
            int b = key.nextInt();
            
            if(a==0 || b==0){
                
                System.out.print("시작 단 및 종료 단에 0이 있어 종료함.");
                
                break;
            }
            
            무한구구단메서드(a, b);
            
                   
        }
        
    }

    private static int 무한구구단메서드(int a, int b) {
        int t = 0;
        int sum= 0;
        
        if(a>b){
            t = a;
            a = b;
            b = t;
            
        }
        
        for(int i=a; i<=b; i=i+1){
            
            for(int j=1; j<=9; j=j+1){
                
                 sum = i*j;
                
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
        return sum;
    }
    
}
