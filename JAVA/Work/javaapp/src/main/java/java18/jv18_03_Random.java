package java18;

import java.util.Random;
import java.util.Scanner;

public class jv18_03_Random {
    
    public static void main(String[] args){
        
//난수(임의의 수) 만들기
// new Random().nextDouble()는 0부터 1사이의 실수 값
        Random rand = new Random();
        double rand1 = rand.nextDouble();
        System.out.println(rand1);
        
//난수를 이용해서 0부터 2사이의 값을 만드시오.
        
        double rand3 = rand.nextDouble() * 2;
        
        System.out.println(rand3);
        
//문제. 난수를 이용해서 1부터 3사이의 실수 값을 만드시오.
        
        int rand4 = new Random().nextInt(3)+1;
// nextInt(3) = 3미만의 값이 출력 0~2 사이의 숫자가 랜덤으로 나옴 3은 포함이 안됨.
// +1을 하면 최소,최대 값이 1씩 증가한다. => 1~3의 숫자 랜덤 출력
// (3)+1=4 == 정수는 4미만 정수 값 출력
        
        int rand7 = rand.nextInt(3)+1;// 정수
// new Random().nextInt(3)+1 == rand.nextInt(3)+1; 같다.
        
        
        double rand2 = rand.nextDouble() * 2 + 1;// double 실수로 구하기.
// 더블은 소숫점으로 표기됨. 마지막 값 포함되지 않는 3으로 설정해야 된다.
        
        
        System.out.println(rand4);
        System.out.println(rand7);
        System.out.println(rand2);
        
//문제. 0이상 10미만의 실수 난수 5개를 생성해서 출력하시오.
        
        
        for(int i=1; i<=5; i=i+1){
            
            int rand5 = new Random().nextInt(10);//for문 안에 선언해야 값을 지정한다.
            
            System.out.println(rand5);
        }// 정수 값으로 0이상 10미만의 실수 난수 5개를 생성해서 출력하시오.
        
        for(int i=1; i<=5; i=i+1){
            
            double rand8 = rand.nextDouble()*10;
            
            System.out.println(rand8);
        }
        // 실수 값으로 정수 값으로 0이상 10미만의 실수 난수 5개를 생성해서 출력하시오.
        
        
        //문제. 사용자로부터 최대 정수 A와 최소 정수 B를 입력 받는다.
        //      그리고 A와 B 사이에 존재하는 난수 10개를 생성해서 출력하시오.
        
        Scanner key = new Scanner(System.in);
        System.out.print("최대 값 정수 A :"+" ");
        int A=key.nextInt();  //A=10
        
        System.out.print("최소 값정수 B :"+" ");
        int B=key.nextInt();  //B=1
        
        for(int i=1; i<=10; i=i+1){ 
             
            int rand9 = new Random().nextInt(A - B + 1) +B;
            
//(A-B+1)+B=(최대값 - 최소값 + 범위지정 값)==최대값 지정 + 최소값 지정
//(10-1+1)+1= 11미만의 값 중 랜덤으로 출력한다. -> 1(최소값)~11(최대값+1)미만 
            System.out.println(rand9);
        }
        
    }
    
}
