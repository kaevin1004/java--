package java12.st1rect;

import java.util.Scanner;

public class RectTest {
    
    public static void main(String[] args){
        
        Scanner key=new Scanner(System.in);
        
        System.out.print("가로입력:"+" ");
        int a=key.nextInt();
        System.out.print("세로입력:"+" ");
        int b=key.nextInt();
        
        Rect d=new Rect();
        
        d.setWidth(a);
        d.setHeight(b);
        
        System.out.println("사각형의 넓이:"+" "+d.area());
        System.out.println("사각형의 둘레:"+" "+d.perimeter());
        
        
    }
    
    
    
}
