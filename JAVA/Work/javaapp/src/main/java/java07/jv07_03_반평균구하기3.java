package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기3 {
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("학생수를 입력:");
        int a=keyboard.nextInt();
        
        int[] d=new int[a];
        
        int sum = 0, ave =0;
        
        for(int i=0; i<=d.length-1; i=i+1){
            //입력한 배열 값을 배열 갯수만큼 순차적으로 넣어준다.
            System.out.print("성적을 입력:");//배열 식의 키보드 입력 값을 선언
            
            d[i]=keyboard.nextInt();//배열 값(d[i]를 출력한다.
            
            sum=sum+d[i];
            
            ave=sum/d.length;//sum나누기 배열갯수
        }
        System.out.println("합계:"+ sum);
        System.out.println("평균:"+ ave);
    }
    
}
