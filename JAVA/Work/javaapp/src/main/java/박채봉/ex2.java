package 박채봉;

import java.util.Arrays;

public class ex2 {
    
    public static void main(String[] args){
        
        int[] a = {23, 96, 35, 42, 81, 19, 8, 77, 50};
        
        System.out.print("정렬 전 : ");
        
        mad(a);
        
        Arrays.sort(a);
        
        System.out.print("정렬 후 : ");
        
        mad(a);
    
    }

    private static void mad(int[] a) {
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print(a[i]);
            
            if(i == a.length-1){
                
                System.out.println(" ");
                
            }
            else{
                
                System.out.print(" ");
                
            }
        
        
        }
    }
}
