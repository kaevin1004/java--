package javawork;

import java.util.Scanner;

public class ex3_반평균구하기 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //배열 만들기
        
        
        int size =3;
        int[] array=new int[size];
        
        
        for( int i = 0; i <= array.length-1 ; i=i+1 ) {
        
        
      //숫자입력 받기
            System.out.print("숫자입력:");
            array [i]=keyboard.nextInt();
        
        }
        //배열 값을 출력
        System.out.print("배열의 값은:");
        for( int i = 0; i <= array.length-1; i=i+1 ) {//for 문을 사용
            System.out.print(array[i]);
            //if else문 사용
            if(i==array.length-1){
            //.length에 -1을 넣는 이유: 배열은 0부터 시작
            //1부터 시작하는 숫자를 -1로 하여 0부터 시작하게 맞추기 위해    
            }
            else{
                System.out.print(",");
            }
        }
        
    }
    
}
