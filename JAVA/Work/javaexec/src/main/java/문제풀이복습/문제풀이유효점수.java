package 문제풀이복습;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 문제풀이유효점수 {
    
    public static void main(String[] args){
        
        
        int [] a = new int[5];
        
        a[0] = 7;
        a[1] = 9;
        a[2] = 4;
        a[3] = 8;
        a[4] = 5;
        
        System.out.println("심사워윈 수:"+ a.length);
        
        System.out.print("5명 심사위원 점수:"+" ");
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print(a[i]);
        }
        
        Arrays.sort(a);
        System.out.println();
        System.out.println("유효점수:"+" ");
        
        
    }
    
}
