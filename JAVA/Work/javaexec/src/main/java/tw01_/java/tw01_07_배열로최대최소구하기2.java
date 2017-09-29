package tw01_.java;

import java.util.Arrays;
import java.util.Scanner;

public class tw01_07_배열로최대최소구하기2 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int i=0;
        System.out.print("배열 갯수:");
        i=keyboard.nextInt();
        
        int[] a=new int[i];
        
        for(int j=0; j<=a.length-1; j=j+1){
            
            System.out.print("숫자 입력:");
            
            a[j]=keyboard.nextInt();
            
            
        }
        
        
        System.out.print("배열정렬 전:"+" ");
        
        i = mad(a);
        
        Arrays.sort(a);
        
        System.out.print("배열정렬 후:"+" ");
        
        i = mad(a);
        
        System.out.println("최소값:"+a[0]);
        System.out.println("최대값:"+a[a.length-1]);
    }

    private static int mad(int[] a) {
        int i;
        for(i=0; i<=a.length-1; i=i+1){
            
            System.out.print(a[i]);
            
            if(i==a.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
        return i;
    }
    
}
