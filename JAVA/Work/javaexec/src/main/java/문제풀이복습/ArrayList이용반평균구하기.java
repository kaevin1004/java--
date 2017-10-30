package 문제풀이복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList이용반평균구하기 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        List<Integer> x = new ArrayList<Integer>();
        
                        
        System.out.print("학생수를 입력하시오 :");
        int a = key.nextInt();
        int sum = 0;
        int avg = 0;
        for(int i=0; i<=a-1; i=i+1){
            
            System.out.print("성적을 입력하시오 :");
            x.add(key.nextInt());
            // 키보드 입력값을 x.add 배열 값에 넣는다 i 가 a-1보다 작거나 같을때 까지 넣는다.
            sum = x.get(i)+sum;
            avg = sum/a;
        }
        System.out.println("합계 :"+sum);
        System.out.println("평균 :"+avg);
        
    }
    
}
