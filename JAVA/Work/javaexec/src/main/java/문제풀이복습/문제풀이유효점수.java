package 문제풀이복습;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 문제풀이유효점수 {
    
    public static void main(String[] args){
        
        
        int [] b = new int[5];
        
        int[] a = {7,9,4,8,5};
        
        System.out.println("심사워윈 수:"+ a.length);
        
        System.out.print("5명 심사위원 점수:"+" ");
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print(a[i]);
        }
        
        Arrays.sort(a);
        System.out.println();
        System.out.println("유효점수:"+" ");
        
        int sum = 0;
        double ave = 0;
        
        for(int i=1; i<=a.length-2; i=i+1){
            
            sum = sum+a[i];
            
            ave = (double)sum / (double)(a.length-2);
            
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("합계 :"+sum);
        System.out.println("평균 :"+ave);
        
    }
    
    
}
