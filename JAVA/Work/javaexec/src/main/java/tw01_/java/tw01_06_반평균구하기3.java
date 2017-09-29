package tw01_.java;

import java.util.Scanner;

public class tw01_06_반평균구하기3 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int i=0;
        
        System.out.print("배열 크기:"+" ");
        i=keyboard.nextInt();
        
        int[] a=new int[i];
        
        int sum=0, ave=0;
        
        for(i=0; i<=a.length-1; i=i+1){
            
            System.out.print("숫자:"+" ");
            
            a[i]=keyboard.nextInt();
            
            sum=sum+a[i];
            ave=sum/a.length-1;
        }
        System.out.println("합계"+" "+sum);
        System.out.println("평균"+" "+ave);
    }
    
}
