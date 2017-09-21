package tw04;

import java.util.Scanner;

public class tw04_05_합계구하기swap {
    public static void main(String[] args){
        
        int p = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 값:");
        p=keyboard.nextInt();
        
        int s = 0;
        System.out.print("종료 값:");
        s = keyboard.nextInt();
      
        if(p>s){
          int temp=s;//종료값을 temp에 넣는다
            s=p;//시작 값을 종료 값에 넣는다
            p=temp;//temp를 시작값에 넣는다
            System.out.println(p);
            System.out.println(s);
            System.out.println(temp);
        }
        else {
            
        }
        int sum=0;
        
        for(int i =p; i<=s; i=i+1){
            sum = sum+i;           
        }
        System.out.println(sum);
    }
    
}
