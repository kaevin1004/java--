package java06;

public class jv06_02_왜매서드를쓰는거2 {
    
    public static int getSum(int start, int end){
        //int getSum 메서드를 적어서 아래for문을 실행시킨다.       
        int sum=0;
        for(int i=start; i<=end; i=i+1){
            sum=sum+i;
        }
        return sum;//아래 수식으로 돌아가 값을 보내준다(getSum(s,e)
    }
    
    public static void main(String[] args){
        
        int sum=getSum(1,10);
        //start=1, end=10 값을 위 for문에 적용.
        System.out.println(sum);
        
        int sum2=getSum(1,100);
        //start=1, end=100 값을 위 for문에 적용
        System.out.println(sum2);
        
        int sum3=getSum(1,sum2);
        //start=1, end=sum2 값을 위 for문에 적용
        System.out.println(sum3);
    }
}