package javawork;

import java.util.Scanner;

public class ex03_02_연속ifelse {
    public static void main(String[] args){
        
        int n = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하시오:");
        n = keyboard.nextInt();
        
        if(n>=90){//n이 90보다 크다면
            System.out.println("A");//<==90이상이면 출력
        }else
        {
            if(n>=80){//n이 80~89 사이면
                System.out.println("B");//<== 출력됨
            }
            else{
                if(n>=70){//70~79 사이면
                    System.out.println("C");//<== 출력됨
                }
                else{
                    if(n>=60){//60~69 사이면
                        System.out.println("D");//<== 출력됨
                    }
                    else{//59부터 이하는
                        System.out.println("F");//<== 출력됨
                    }
                }
            }
        }
    }
    
}
