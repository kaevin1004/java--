package homejava03;

import java.util.Scanner;

public class homejava03_04_반평균구하기1 {
    public static void main(String[] args){
        int size=3;
        int[] a=new int[size];
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0; i<a.length; i=i+1){
            System.out.print("숫자입력:");
            size=keyboard.nextInt();
            
            a[i]=size;
        }
        System.out.println("배열의 값은:"+a[0]+","+a[1]+","+a[2]+".");
    }
    
}
