package tw02;

import java.util.Arrays;

public class tw02_09_배열로최대최소구하기3 {
    
    public static void main(String[] args){
        
        int a=9;//배열 갯수를 정한다.
        int [] b={23,96,35,42,81,19,8,77,50,64};//배열 갯수에 배열 값을 정한다.
        
        System.out.print("배열정렬 전:"+" ");//배열정렬 전 값 출력
        
        for(int i=0; i<=b.length-1; i=i+1){
            
            System.out.print(b[i]);//배열 값을 출력한다.
            
            if(i==b.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
        
        Arrays.sort(b);//배열을 정렬하는 수식!*************
        
        System.out.print("배열정렬 후:"+" ");//배열정렬 후 값을 출력.
        
        for(int i=0; i<=b.length-1; i=i+1){
            
            System.out.print(b[i]);//배열 값을 출력한다.
            
            if(i==b.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
        System.out.println("최소값:"+b[0]);//배열이 정렬되어서 b[0]값이 최소값이다.
        System.out.println("최대값:"+b[b.length-1]);
        //배열이 정렬되어 마지막 값을 출력한다.(최대값)
    }
}
