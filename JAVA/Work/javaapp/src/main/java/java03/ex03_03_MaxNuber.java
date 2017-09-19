package java03;

import java.util.Scanner;

public class ex03_03_MaxNuber {
    public static void main(String[] args){
        int x=0;
        int y=0;
        int z=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하시오");
        x = keyboard.nextInt();
        System.out.println("두번째 수를 입력하시오");
        y = keyboard.nextInt();
        System.out.println("세번째 수를 입력하시오");
        z = keyboard.nextInt();
        
        if(x>y && x>z){
            System.out.println();
        }
        else if(y>z){
            System.out.println();
        }
        else{
        }
   }
       
}
    

