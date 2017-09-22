package home_java1;

import java.util.Scanner;

public class homejava01_11_n1n2합계구하기 {
    public static void main(String[] args){
        
        int n1=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하시오:");
        n1=keyboard.nextInt();
        int n2=0;
        
        n2=keyboard.nextInt();
        
        int sum=0;
        for(int i=n1; i<=n2; i=i+1){
            sum=sum+i;
            System.out.print(i);
            if(i==n2){
                System.out.print("=");
            }
            else{
                System.out.print("+");
            }
        }
        System.out.println(sum);
    }
    
}
