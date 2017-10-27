package 문제풀이복습;

import java.util.Scanner;

public class 문제풀이메서드 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
              
        
        System.out.print("시작 값 :"+" ");
        int a=key.nextInt();
        
        System.out.print("종료 값 :"+" ");
        int b=key.nextInt();
        
        합계구하기메서드(a, b);
        
        System.out.print(a+"부터"+b+"까지의 합계는"+" "+합계구하기메서드(a, b)+"입니다.");

    }

    private static int 합계구하기메서드(int a, int b) {
        int sum = 0;
        int t = 0;
        
        if(a>b){
            t = a;
            a = b;
            b = t;
        }
        
        for(int i=a; i<=b; i=i+1){
            
            sum = sum+i;
            
        }
        //System.out.println(a+"부터"+b+"까지의 합계는"+" "+sum+"입니다.");
        return sum;
        
    }

    
}

