package homejava2;

import java.util.Scanner;

public class homejava02_01_월급구하기 {
    public static void main(String[] args){
        
        int n=0;//월급
        int y=0;//10년치 월급
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("월급을 입력하시오:");
        n=keyboard.nextInt();//월급을 입력함
        
        y=10*12*n;//10년치 월급=10년*12개월*월급
        
        System.out.println("10년치 월급은:"+y);
    }
    
}
