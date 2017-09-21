package home_java1;

import java.util.Scanner;

public class homejava01_02_면적구하기 {
    public static void main(String[] args){
        int w;//가로
        int h;//세로
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("가로를 입력하시오:");
        w=keyboard.nextInt();
        System.out.println("세로를 입력하시오:");
        h=keyboard.nextInt();
        
        int d=w*h;//면적
        int s=2*(w+h);//둘레
            System.out.println("사각형의 넓이:"+d);
            System.out.println("사각형의 둘레:"+s);
    }
    
}
