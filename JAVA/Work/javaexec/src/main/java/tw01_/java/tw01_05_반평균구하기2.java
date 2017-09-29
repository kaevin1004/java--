package tw01_.java;

import java.util.Scanner;

public class tw01_05_반평균구하기2 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("사이즈 입력:"+" ");
        
        int a=keyboard.nextInt();
        
        int[] b=new int[a];
        
        for(int i=0; i<=b.length-1; i=i+1){
            
            System.out.print("숫자:"+" ");
            b[i]=keyboard.nextInt();
        }
        
        System.out.print("배열 값:"+" ");
        
        for(int i=0; i<=b.length-1; i=i+1){
            
            System.out.print(b[i]);
            
            if(i==b.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
    }
    
}
