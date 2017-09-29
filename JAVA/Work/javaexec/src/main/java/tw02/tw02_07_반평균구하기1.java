package tw02;

import java.util.Scanner;

public class tw02_07_반평균구하기1 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int b=0;
        
        System.out.print("방 갯수:");//배열 갯수를 설정
        b=keyboard.nextInt();//배열 갯수를 키보드 입력받는다.
        
        int[] g=new int[b];//배열 갯수를 정하는 수식
        
        //배열의 값을 지정한 곳에 대입
        
        for(int i=0; i<=g.length-1; i=i+1){
          //정해진 배열 갯수만큼 배열 값을 반복해서 입력한다.
            
            System.out.print("숫자입력:");//배열 값 출력
            
            g[i]=keyboard.nextInt();//배열 값을 키보드 입력
            
            
        }
        
        System.out.print("배열의값은:");//배열의 값을 출력한다.
        
        for(int i=0; i<=g.length-1; i=i+1){//배열의 갯수만큼 값을 반복하여 저장.
            System.out.print(g[i]);//지정된 배열의 갯수에 지정된 값을 출력
            
            if(i==g.length-1){
                System.out.print(".");
            }
            else{
                System.out.print(",");
            }
        }
        
    }
    
}
