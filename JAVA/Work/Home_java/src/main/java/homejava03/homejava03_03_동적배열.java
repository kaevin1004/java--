package homejava03;

import java.util.Scanner;

public class homejava03_03_동적배열 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("사이즈 입력:");
        int size=keyboard.nextInt();
        int[] a=new int[size];
        
        System.out.println("사이즈:"+a.length);
    }
    
}
