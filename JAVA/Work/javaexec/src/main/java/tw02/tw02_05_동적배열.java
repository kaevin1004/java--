package tw02;

import java.util.Scanner;

public class tw02_05_동적배열 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);//키보드 입력 수식
       
        
        System.out.print("사이즈입력:");//키보드 값 출력
        int a=keyboard.nextInt();
        //a를 키보드 값으로 적게 하고 배열의 갯수를 정하는 수식이다.
        
        int[] b=new int[a];//배열의 갯수를 설정
        
        System.out.println("사이즈:"+b.length);//==("사이즈:"+a)와 같다.
        //+a로 해도 된다.(int),b.length는 배열(주소값)이다.
    }
    
}
