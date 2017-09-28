package java07;

import java.util.Arrays;
import java.util.Scanner;

public class jv07_04_Arrays메서드 {
    public static void main(String[] args){
        
        //키보드 입
        Scanner keyboard=new Scanner(System.in);
        
        //배열 만들기
        int size=6;
        int[] arr=new int[size];//배열 수식 적용
        
        //for문을 이용한 배열 정렬
        for(int i=0; i<=arr.length-1; i=i+1){
            arr[i]=arr.length-i;
        }
        printArray(arr);
        
        //Arrays 정렬 & printArray() 호출
        java.util.Arrays.sort(arr);//Arrays.sort(arr)로 축약해서 사용 가능
        printArray(arr);
        
        
        int val=java.util.Arrays.binarySearch(arr,4);
       //binarySearch=> 반환값이 int다.
        System.out.println("4값의 위치:"+val);
        
      //Arrays 초기화 & printArray() 호출
        Arrays.fill(arr, -1);//fill이 실행되면 자동으로 -1로 된다.
        printArray(arr);
        
    }
    //배열의 값을 출력하는 메서드를 만든다.
    //메서드명 : printArray
    //메서드타입:void
    //매개변수:정수 배열
    public static void printArray(int[] x ){
        
        
        for(int i=0; i<=x.length-1; i=i+1){
            System.out.print(x[i]+", ");
            
        }
        System.out.println();
        return;
    }
    
}
