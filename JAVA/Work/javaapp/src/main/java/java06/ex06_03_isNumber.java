package java06;

import java.util.Scanner;

public class ex06_03_isNumber {
    
    public static void main(String[] args){
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("문자입력:");
        String a=keyboard.next();
        
        boolean result;
        if(a.equals(null) || a.equals(" ")){
           result=false;
        }
        else{
           result = true;
        }
        System.out.println(result);
        
    }
    
    public static boolean isNumber(String args){
        
        boolean result=true;
        
        return result;
    }
    
}
