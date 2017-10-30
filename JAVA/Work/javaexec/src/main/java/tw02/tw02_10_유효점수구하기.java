package tw02;

import java.util.Arrays;

public class tw02_10_유효점수구하기 {
    
    public static void main(String[] args){
        
        int a=5;
        
        int[] b={7,9,4,8,5};
        System.out.println(b.length);
        System.out.println("심사위원 수:"+" "+b.length);
        
        System.out.print("5명 심사위원 점수:"+" ");
        for(int i=0; i<=b.length-1; i=i+1){
            
            System.out.print(b[i]);
            
            if(i==b.length-1){
                System.out.println();
            }
            else{
                System.out.print(" ");
            }
        }
        Arrays.sort(b);
        
        System.out.print("유효점수:"+" ");
        
        int sum=0;
        double ave=0;//소수점은 더블로 한다.
        
        for(int i=1; i<=b.length-2; i=i+1){
            
            System.out.print(b[i]);
            
            sum=sum+b[i];
            ave=(double)sum/(double)(b.length-2);//int에서 형변환 소숫점.
            
            if(i==b.length-2){
                System.out.println();
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("합계:"+" "+sum);
        System.out.println("평균:"+" "+ave);
    }
    
}
