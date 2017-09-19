package home_java;

import java.util.Scanner;

public class jv_home_01 {
    public static void main(String[] args){
        int w;
        int h;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("세로입력:");
        w=keyboard.nextInt();
        System.out.println("가로입력:");
        h=keyboard.nextInt();
        
        int area = w*h;
        int perimeter=2*(w+h);
        
        System.out.println("사각형의 넓이:"+area);
        System.out.println("사각형의 둘레:"+perimeter);
        
    }
    
}
