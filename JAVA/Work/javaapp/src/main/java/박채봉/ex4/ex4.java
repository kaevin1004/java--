package 박채봉.ex4;

import java.util.Scanner;

public class ex4 extends Oper{
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        Oper a = new Oper();
        
        System.out.print("First num : ");
        a.setFirstNum(key.nextInt());
        
        System.out.print("Second num : ");
        a.setSecondNum(key.nextInt());
        
        
        System.out.println("Add : "+a.add(a.getFirstNum(), a.getSecondNum()));
        System.out.println("Minus : "+a.minus(a.getFirstNum(), a.getSecondNum()));
        System.out.println("Mul : "+a.mul(a.getFirstNum(), a.getSecondNum()));
        System.out.println("Div : "+a.div(a.getFirstNum(), a.getSecondNum()));
        
        
    }
    
    
    
    
}
