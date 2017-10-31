package 문제풀이복습;

import java.util.Arrays;

public class 문제풀이문자열의숫자나누기 {
    
    public static void main(String[] args){
        
        String a = "74 874 9883 73 9 73646 774";
        String[] b = a.split(" ");
        
        int[] c = new int[b.length];
        
        for(int i=0; i<=b.length-1; i=i+1){
            
            String d = b[i];
            
            int x = Integer.valueOf(d);
            
            c[i] = x;
        }
        
        Arrays.sort(c);
        
        for(int i=0; i<=c.length-1; i=i+1){
            
            System.out.println(c[i]);
        }
        System.out.println(c[c.length-1]);
        
        int sum = 0;
        int ave = 0;
        
        for(int i=0; i<=b.length-1; i=i+1){
            
            sum = sum+c[i];
            ave = sum/c.length-1;
        }
        
        System.out.println(sum);
        System.out.println(ave);
        
    }
    
}
