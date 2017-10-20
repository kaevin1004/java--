package java08;

import java.util.Arrays;

import com.mysql.fabric.xmlrpc.base.Array;

public class java08_String객체 {
    
    public static void main(String[] args){
        
        // 36번 첫번째 문제
        String prov = "abc defg ijklm nop qrs wx yz";
        
        // 36번 두번째 문제
        String defg = prov.substring(4, 8);
        System.out.println(defg);
        
        //36번 세번째 문제
        String ijk = prov.replace("ijk", "*#$%^");
        System.out.println(ijk);
        
        
        
        String t = "74 874 9883 73 9 73646 774";
        String[] a= t.split(" ");
        
        int[] z=new int[a.length];
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            String e=a[i];
            
            int d=Integer.valueOf(e);
            
            z[i]=d;
            
        }
        Arrays.sort(z);
        
        for(int i=0; i<=z.length-1; i=i+1){
            
            System.out.println(z[i]);
        }
        System.out.println(z[z.length-1]);
    }
    
}
