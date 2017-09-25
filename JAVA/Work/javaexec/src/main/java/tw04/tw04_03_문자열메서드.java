package tw04;

import java.util.Scanner;

public class tw04_03_문자열메서드 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수:");
        int a=keyboard.nextInt();
        System.out.print("정수:");
       //프린트 입력하기
        int b=keyboard.nextInt();
        int i=Add(a,b);//아래Add메서드의 x와y값과 같다.
        System.out.println(i);
        
    }
   public static int Add(int x, int y){//int 메서드
       
       return x+y;//i로 되돌아 간다.
       // 
    }
}



