package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_03_배열로최대최소구하기 {
    public static void main(String[] args){
        
        int a=9;//배열 갯수를 정한다.
        int[] array={23,96,35,42,81,19,8,77,50,64};
        //배열 값을 정한다.
        
        //배열 정렬 전 값 출력
        System.out.print("배열정렬 전:");
        
        //for문을 사용하여 배열정렬 전 값을 출력한다.
        for(int i=0; i<=array.length-1; i=i+1){
            //i=0, arr[0]
            //i=1, arr[1]
            
            System.out.print(array[i]);
            if(i==array.length-1){
                System.out.println(".");
            }
            
            else{
                System.out.print(",");
            }
            //if else문을 넣어 ,와 .을 넣는다.
            
        }
        //배열 정렬 값을 넣어 배열을 정렬해준다.
        java.util.Arrays.sort(array);
        
        
        //배열 정렬 후 값 출력
        System.out.print("배열정렬 후:");
        
        //for문을 이용하여 배열 정렬 후 값을 출력한다.
        for(int i=0; i<=array.length-1; i=i+1){
            //i=0, arr[0]
            //i=1, arr[1]
            System.out.print(array[i]);
            
            if(i==array.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
        //배열의 최소 값과 배열의 최대 값을 출력한다.
        System.out.println("최소값:"+array[0]);
        System.out.print("최대값:"+array[array.length-1]);
    }
}
