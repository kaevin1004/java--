package java01;

import java.util.Scanner;

public class jv01_07_무한입력 {
    
    public static void main(String[] args){
        
        Scanner key=new Scanner(System.in);
        int a=0;
        
        for(int i=a; true ; i=i+1){
            
            System.out.print("정수를 입력하시오 :");
            
            a=key.nextInt();
            
            if(a>=0){
                System.out.println("입력 값은 : "+a+" "+"입니다.");
            }
            else{
                System.out.println("정상 종료합니다.");
                break;
            }
        }
        System.out.println();
    }
    
}
