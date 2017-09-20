package java04;

import java.util.Scanner;

public class jv04_04_합계구하기 {
    public static void main(String[] args){
        
        int i;
        int j;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작 값을 입력하시오");
        i= keyboard.nextInt();
        
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("종료 값을 입력하시오");
        j= keyboard1.nextInt();
        
        
        if(i<4)
            for(int i=1; i<=4; i=i+1){
                sum = sum+i;
                System.out.println("1부터"+i+ "까지의 합:"+sum);
            }
            
        }
    }
    

