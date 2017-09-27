package javawork;

import java.util.Scanner;

public class ex03_반평균만들기2 {
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        //키보드 입력값을 넣게 한다.
        
        System.out.print("사이즈 입력:");
        int d=keyboard.nextInt();
        //사이즈 변수 선언과 키보드 입력값을 선언
        
        //아래 배열을 입력한다.        
        int[] a=new int[d];//배열을 입력한다.
        
        for(int i=0; i<=a.length-1; i=i+1){
            //입력한 배열 값을 배열 갯수만큼 순차적으로 넣어준다.
            System.out.print("숫자입력:");
            a[i]=keyboard.nextInt();//배열 식의 키보드 입력 값을 선언
        }
        System.out.print("배열 값:");
        for(int i=0; i<=a.length-1; i=i+1){
            //입력한 배열 값을 순차적으로 출력해준다.
            System.out.println(a[i]);//배열 값(a[i]을 출력한다.
            
            if(i==a.length-1){
                
            }
            else{
                System.out.print(",");
            }
        }
    }
    
}
