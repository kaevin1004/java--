package tw01_.java;

import java.util.Scanner;

public class tw01_04_반평균구하기 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int b=0;
        
        System.out.print("방 갯수:"+" ");
        b=keyboard.nextInt();
        
        int[] a=new int[b];
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print("숫자:"+" ");
            
            a[i]=keyboard.nextInt();
        }
        System.out.print("배열 값:"+" ");
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print(a[i]);
            
            if(i==a.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
    }
    
}
