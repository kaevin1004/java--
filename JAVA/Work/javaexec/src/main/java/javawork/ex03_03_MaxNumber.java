package javawork;

import java.util.Scanner;

public class ex03_03_MaxNumber {
    public static void main(String[] args){
        
        int x=0;
        int y=0;
        int z=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하시오:");
        x=keyboard.nextInt();
        System.out.println("두번째 수를 입력하시오:");
        y=keyboard.nextInt();
        System.out.println("세번째 수를 입력하시오:");
        z=keyboard.nextInt();
        
        if(x>y){
            if(x>z){
                System.out.println("입력받은 수중 가장 큰 수는:"+x+"입니다.");
            }
            else{
                System.out.println("입력받은 수중 가장 큰 수는:"+z+"입니다.");
            }
        }
        else{
            if(y>z){
                System.out.println("입력받은 수중 가장 큰 수는:"+y+"입니다.");
            }
            else{
                System.out.println("입력받은 수중 가장 큰 수는:"+z+"입니다.");
            }
        }
    }
    
}
