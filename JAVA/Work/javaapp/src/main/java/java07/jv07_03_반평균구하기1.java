package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기1 {
    public static void main(String[] args){
        
        int size=3;//크기가 3인 배열을 만든다.
        int[] a=new int[size];
        //3개의 배열을 만든다.a[0],a[1],a[2]
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0; i<=a.length-1; i=i+1){
            System.out.print("숫자를 입력하시오:");
            size=keyboard.nextInt();
            //for문을 이용하여 3개의 배열을 순차적으로 적는다.
            
            //size값을 키보드로 입력한다.
            a[i]=size;//
        }
        System.out.print("배열의 값은:"+a[0]+","+a[1]+","+a[2]+".");
        //출력 값을 다 적는다.
    }
    
}
