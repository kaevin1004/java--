package tw01_.java;

import java.util.Scanner;

public class tw_02_01 {
    public static void main(String[] args){
        
        int w = 0;
        int h = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("가로:");
        w = keyboard.nextInt();
        System.out.println("세로:");
        h = keyboard.nextInt();
        
        int area = w*h;
        int perimeter = 2*(w+h);
        System.out.println("사각형의 넓이:"+area);
        System.out.println("사각형의 둘레:"+perimeter);
        
        }
    
}
