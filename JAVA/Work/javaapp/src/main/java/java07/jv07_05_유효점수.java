package java07;

public class jv07_05_유효점수 {
    
    public static void main(String[] args){
        
        int a=4;//(0,1,2,3,4) 배열 갯수 5
        int[] b={7,9,4,8,5};
        
        System.out.println("심사위원의 수를 입력하시오:"+b.length);
        //총 배열 갯수
        
        System.out.print("5명 심사 위원의 점수 입력:"+" ");
        for(int i=0; i<=b.length-1; i=i+1){
            //배열 갯수에 배열 값을 저장한다.
            System.out.print(b[i]);//배열 값을 출력
            
            if(i==b.length-1){
                System.out.println(" ");
            }
            else{
                System.out.print(" ");
            }
        }
        java.util.Arrays.sort(b);//배열 을 정렬한다.
        
        System.out.print("유효점수:"+" ");
        
        int sum=0;
        double ave=0;
        
        for(int i=1; i<=b.length-2; i=i+1){//배열 갯수를 2개 뺀다.
            sum=sum+b[i];//sum은 첫번째 배열 수와 마지막 배열수를 뺀 나머지를 더한 값이
            
            ave= (double)sum/(double)(b.length - 2);//더블 형변환으로 해야한다.
            
            System.out.print(b[i]);
            
            if(i==b.length-2){
                System.out.print(" ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("\n"+"합계:"+sum);
        System.out.println("평균:"+ave);
    }
    
}
