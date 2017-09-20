package tw04;

import java.util.Scanner;

public class tw04_04_합계구하기 {
    public static void main(String[] args){
        
        int p = 0;
                
        Scanner keyboard = new Scanner(System.in);
        System.out.println("시작 값");
        p = keyboard.nextInt();//시작 값을 키보드에 입력하게 함
        
        int s = 0;
        
        System.out.println("종료 값");
        s = keyboard.nextInt();//종료 값을 키보드에 입력하게 함
        
        int sum=0;
        
        if(p>s){//시작 값이 종료 값보다 크다면? 
            for(int i=s; i<=p; i=i+1){//true시 실행
                sum = sum + i;
            }
           System.out.println("합계:"+sum);
        }
        else{//시작 값이 종료 값보다 작다면?
            for(int i=p; i<=s; i=i+1){//fales시 실행
                sum = sum + i;
            }
            System.out.println("합계:"+sum);
        }
        
    }
    
}
