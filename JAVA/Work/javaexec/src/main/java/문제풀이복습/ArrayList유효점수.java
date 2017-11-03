package 문제풀이복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList유효점수 {
    
    public static void main(String[] args){
        
        
        
        //step1. ArrayList
        //step2. 심사 위원수를 입력 받는다.
        //step3. 심사위원의 점수를 입력 받기
        //       몇 번 입력 받아야 하는가? 심사위원수 만큼
        //step4. 합계를 구하는 메서드 만들기
        //       1번방부터 마지막방 -1까지
        //step5. 평균을 구하는 메서드 만들기
        //       평균값 = (double)sum / (list.size()-2)
        //step6. 합계를 출력
        //step7. 평균을 출력
        
        
        //step1.
        List<Integer> list = new ArrayList<>();
        
        //step2.
        Scanner key = new Scanner(System.in);
        System.out.print("심사 위원 수 : ");
        int 심사위원수 = key.nextInt();
        
        //step3.
        for(int i=1; i<=심사위원수; i=i+1){
            
            System.out.print("점수를 입력하세요 : ");
            
            int temp = key.nextInt();
            
            
            // list 에 추가
            list.add(temp);
            
        }
        // ArrayList 정렬하기
        Collections.sort(list);// 오름차순 정렬
        
        //step6. 합계를 구하고 출력
        
        int sum = getsum(list);
        System.out.print("합계 : "+sum);
        
        System.out.println("\n");
        
        //step7. 평균을 구하고 출력한다.
        double avg = getavg(sum, list.size()-2);
        System.out.format("합계 : %.2f", avg);
        
    }
    
    public static int getsum(List<Integer> list){
        
        int sum = 0;
        //step4. 합계를 구하는 메서드 만들기
        //       1번방부터 마지막방 -1까지
        
        for(int i=1; i<=list.size()-1 -1; i=i+1){
            
            // ?번방에서 값 가져오기 : list.get(1); --> 반복문
            
            sum = sum + list.get(i);
        }
        
        return sum;
    }
 
    
    public static double getavg(int sum, int size){
        //평균값 = (double)sum / (list.size()-2)
        
        
        return (double)sum / (double)size;
    }
    
}
