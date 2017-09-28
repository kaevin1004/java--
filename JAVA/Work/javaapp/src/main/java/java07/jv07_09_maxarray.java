package java07;

import java.util.Arrays;

public class jv07_09_maxarray {
    
    public static void main(String[] arga){
        
        int a=6;
        int[] b=new int[a];
        
        //배열에 값을 넣기
        
        b[0]=3;
        b[1]=1;
        b[2]=7;
        b[3]=6;
        b[4]=9;
        b[5]=2;
        //배열 정렬
        Arrays.sort(b);//정렬 완
        //최대값은 배열의 마지막방(배열명.length-1)
        System.out.println("최대값은:"+b[b.length-1]);
        //최대값(배열명[배열명.length-1])
        System.out.println("최소값은:"+b[0]);
        //최소값
    }
    
    
    
}
