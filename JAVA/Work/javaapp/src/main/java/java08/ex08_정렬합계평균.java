package java08;

import java.util.Arrays;

public class ex08_정렬합계평균 {
    
    public static void main(String[] args){
        
        String a = "74 874 9883 73 9 73646 774";
        String[] d = a.split(" ");
        
        int[] c = new int[d.length];
        
        for(int i=0; i<=d.length-1; i=i+1){
            
            String s=d[i];
            
            int v = Integer.valueOf(s);
            
            c[i]=v;
        }
        
        Arrays.sort(c);
        
        for(int i=0; i<=c.length-1; i=i+1){
            
            System.out.println(c[i]);
        }
        
        System.out.println(c[c.length-1]);
        
        
        int sum = 0;
        int ave = 0;
        
        for(int i=0; i<=d.length-1; i=i+1){
            
            sum = sum + c[i];
            ave=sum/c.length-1;
            
        }
        
        System.out.println(sum);
        System.out.println(ave);
    }
    
}
