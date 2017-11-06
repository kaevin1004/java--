package 박채봉;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        int temp = 0;
        int sum = 0;
        System.out.print("시작 값 : ");
        int a = key.nextInt();
        
        System.out.print("종료 값 : ");
        int b = key.nextInt();
        
        if(a>b){
            
            temp=a;
            a=b;
            b=temp;
        } 
        
        sum = mad(sum, a, b);
        System.out.print(sum);
    }

    private static int mad(int sum, int a, int b) {
        for(int i=a; i<=b; i=i+1){
            
            sum = sum+i;
            
            System.out.print(i);
            
            if(i == b){
                System.out.print("=");
                
            }
            else{
                System.out.print("+");
            }
            
        }
        return sum;
    }
    
}
