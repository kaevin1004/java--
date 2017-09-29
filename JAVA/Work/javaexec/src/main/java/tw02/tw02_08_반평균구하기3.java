package tw02;

import java.util.Scanner;

public class tw02_08_반평균구하기3 {
    
    public static void main(String[] args){
        
        Scanner keyboard=new Scanner(System.in);
        
        int i=0;//배열의 갯수를 등록하는 변수를 선언
        
        System.out.print("배열의 크기:");
        i=keyboard.nextInt();//배열의 갯수를 키보드로 입력한다.
        
        int[] a=new int [i];//배열의 갯수를 나타내는 수식.
        
        int sum=0, ave=0;//합계와 평균 값을 나타내는 변수를 선언한다.
        
        for(i=0; i<=a.length-1; i=i+1){//배열 갯수에 배열 값을 저장하는 for반복문
            
            System.out.print("숫자를 입력:");//배열 값을 출력한다.
            
            a[i]=keyboard.nextInt();//배열 값을 키보드로 입력하는 수식
            
            sum=sum+a[i];//합계는: 출력되는 배열 값을 다 더해준다.
            ave=sum/a.length;//합해진 배열 값의 평균을 나눠준다.
        }
        System.out.println("합계:"+sum);//배열 값의 합계 출력
        System.out.println("평균:"+ave);//배열 값의 평균 출력
    }
}
