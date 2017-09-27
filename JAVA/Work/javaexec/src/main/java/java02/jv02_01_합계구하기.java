package java02;

import java.util.Scanner;

public class jv02_01_합계구하기 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int x=0;
        int y=0;
        int temp=0;
        
        System.out.print("시작 값:");
        x=keyboard.nextInt();
        System.out.print("종료 값:");
        y=keyboard.nextInt();
        
        int sum=0;
        
        if(x>y){
            temp=x;
            x=y;
            y=temp;
            
        }
        
        for(int i=x; i<=y; i=i+1){
            
            sum=sum+i;
            
         }
        System.out.println("1부터 4까지의 합계는:"+sum);
                
    }
    
}
