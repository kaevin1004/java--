package java07;

import java.util.Arrays;

public class jv07_09_maxarray2 {
    
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
        
        //최대값은 배열의 마지막방(배열명.length-1)
        System.out.println("최대값은:"+b[b.length-1]);
        //최대값(배열명[배열명.length-1])
        System.out.println("최소값은:"+b[0]);
        //최소값
        
        //위의 값은 정렬이 적용이 되지 않아 값이 틀리다.
        
        //max메서드를 이용한 최대값 구하기
        
        int temp=max(b);//아래 리턴 된 x가 적용됨
        //메서드 입력 받는 값을 만듬 int temp=max(b);
        
        System.out.println("temp의 최대값:"+temp);
        
        System.out.println("최대값은:"+b[b.length-1]);
        System.out.println("최소값은:"+b[0]);
        //아래 sort 정렬이 되어 서 정상적인 출력이 가능
    }
    public static int max(int[] x){
        
        //배열 정렬
        Arrays.sort(x);
        //최대값 반환
        
        return x[x.length-1];//최대값을 반환(리턴)
    }
    
}
