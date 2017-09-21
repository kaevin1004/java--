package tw04;

import java.util.Scanner;

public class tw04_02_합계구하기 {
    public static void main(String[] args){
        
        int a=0;
        int b=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작값:");
        a=keyboard.nextInt();
        System.out.print("종료값:");
        b=keyboard.nextInt();
        int sum=0;
        
        if(a<b){
            for(int i=a; i<=b; i=i+1){
                sum=sum+i;
                
            }
            System.out.println("합계"+sum);
        }
        else{
            for(int i=b; i<=a; i=i+1){
                sum=sum+i;
                
            }
        System.out.println("합계:"+sum);
        }
        
    }//swap(다른 예)
    
}
