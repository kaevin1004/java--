package java07;

import java.util.Scanner;

public class jv07_01_동적배열 {
    public static void main(String[] args){
                
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("사이즈 입력:");
        int size=keyboard.nextInt();
        //size값을 키보드로 입력한다.
        int[] number=new int[size];
        //number배열의 크기를 입력받은 size의 값으로 만들어준다.
        
        System.out.println("사이즈:"+number.length);
        //number.length는 넘버배열의 크기를 나타내는 수식.
        
    }
    
}
