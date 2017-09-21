package home_java1;

import java.util.Scanner;

public class homejava01_05_연속ifelse {
    public static void main(String[] args){
        
        int n=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("점수를 입력하시오:");
        n=keyboard.nextInt();
                
        if(n>90){//n이 90이상이면 출력
            System.out.println("A");
        }
        else{
            if(n>80){//n이 80~89면 출력
                System.out.println("B");
            }
            else{
                if(n>70){//n이 70~79면 출력
                    System.out.println("C");
                }
                else{
                    if(n>60){//n이 60~69면 출력
                        System.out.println("D");
                    }
                    else{//n이 59포함 미만이면 출력
                        System.out.println("F");
                    }
                }
            }
        }
    }
        
    
}
