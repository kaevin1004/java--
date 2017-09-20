package tw04;

import java.util.Scanner;

public class tw04_05_합계구하기swap {
    public static void main(String[] args){
        
        int p = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작 값");
        p=keyboard.nextInt();
        
        int s = 0;
        System.out.println("종료 값");
        s = keyboard.nextInt();
        
        int temp;//종료값을 temp에 넣는다.
        int sum=0;
        if(p>s){
            temp=s;
            p=s;
            s=p;
        }
        else {
            
        }
        for(int i =p; i<=s; i=i+1){
            sum = sum+i;
        }
        System.out.println(sum);
    }
    
}
