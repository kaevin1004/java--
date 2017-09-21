package home_java1;

import java.util.Scanner;

public class homejava01_01_10년월급구하기 {
    public static void main(String[] args){
        
        int n=0;//(급여)
        int i=0;//(10년치 저축액)
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("월급을 입력하시오:");
        n=keyboard.nextInt();//급여 월급 입력 수식
        
        i=12*10*n;//10년치 월급액 수식(i=10년 저축액)
            System.out.print("10년동안의 저축액:"+i);
    }
    
}
