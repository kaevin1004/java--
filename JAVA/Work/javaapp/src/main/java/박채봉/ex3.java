package 박채봉;

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args){
        
         Scanner key = new Scanner(System.in);
         
         int c = 0;
         int sum = 0;
         
         
        for(; true;){ 
         System.out.print("시작단수 : ");
         int a = key.nextInt();
         
         System.out.print("종료단사 : ");
         int b = key.nextInt();
         
        if(a>b){
            c=a;
            a=b;
            b=c;
        }
        
        if(a == 0 || b == 0){
            
            System.out.println("0이 포함되어 프로그램 종료");
            break;
            
        }
        mad(a, b);
            System.out.println();
            
        }
    }

    private static void mad(int a, int b) {
        int sum;
        for(int i=a; i<=b; i=i+1){
            
            for(int j=1; j<=9; j=j+1){
                sum = i*j;
                System.out.println(i+"*"+j+"="+sum);
                
            }
        }
    }
    
    
}
