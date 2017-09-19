package java02;

import java.util.Scanner;

public class ex02_01 {
    
    public static void main(String[] args) {
        
        int w = 0;
        int h = 0;
        String q;
               
        Scanner keyboard = new Scanner(System.in);
        System.out.println("가로.:");
        w = keyboard.nextInt(); //가로 입력
        System.out.println("세로:");
        h = keyboard.nextInt();  //세로 입력
        System.out.println("문자열을 입력하세요:");
        q = keyboard.next();  //문자열 입력
        
        int area = w * h;
        int perimeter = 2 * (w + h);
                
        System.out.println(w);
        System.out.println(h);
        System.out.println(q);
        System.out.println("사각형의 넓이:" + area);
        System.out.println("사각형의 둘레:" + perimeter);
        
    }
}
