package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기2 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        int b =0;//사이즈 변수를 만듬
        
        System.out.print("사이즈를 입력:");
        //사이즈 값을 입력 받는다.(방 배정)
        
        //사이즈 변수의 키보드 입력 값을 선언
        b=keyboard.nextInt();
        int[] a=new int[b];//배열식을 입력한다.
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print("숫자입력:");
            a[i] = keyboard.nextInt();
            //배열 값을 입력한다.
        }
        System.out.print("배열 값은:");
        
        for(int i=0; i<=a.length-1; i=i+1){
            System.out.print(a[i]);//입력된 배열 값을 출력한다.
            
            if(i==a.length-1){
                System.out.println(".");
            }
            else{
                System.out.print(",");
            }
        }
    }
    
}
