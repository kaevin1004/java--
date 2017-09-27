package java07;

import java.util.Scanner;

public class jv07_03_배열로최대최소구하기 {
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        System.out.println("정수입력:");
        int b=keyboard.nextInt();
        
        int[] a=new int[b];
        
        for(int i=0; i<=a.length-1; i=i+1){
            System.out.println("정수를 입력:");
            
            a[i]=keyboard.nextInt();
            
        }
    }
    
}
