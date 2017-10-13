package java11.st2;

import java.util.Scanner;

public class opertest {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        System.out.print("First num:");
        int a=key.nextInt();
        System.out.print("Second num:");
        int b=key.nextInt();
        
        oper y= new oper();
        
        y.setX(a);
        y.setY(b);
        
        System.out.println("ADD:"+y.Add());
        System.out.println("Minus:"+y.Minus());
        System.out.println("Mul:"+y.Mul());
        System.out.println("Div:"+y.Div());
    }
    
}
