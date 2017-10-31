package 문제풀이복습.st면적구하기;

import java.util.Scanner;

public class RectTest {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        System.out.println("whidth(가로) 값 :");
        int a = key.nextInt();
        System.out.println("height(세로) 값 :");
        int b = key.nextInt();
        
        Rect d = new Rect();
        
        d.setWidth(a);
        d.setHeight(b);
        
        System.out.println("사각형의 넓이"+d.area());
        System.out.println("사각형의 둘레"+d.perimeter());
        
    }

   
    
}
