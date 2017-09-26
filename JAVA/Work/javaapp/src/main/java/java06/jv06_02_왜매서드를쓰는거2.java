package java06;

public class jv06_02_왜매서드를쓰는거2 {
    
    
    
    public static void main(String[] args){
        
        int sum=getSum(1,10);//리턴(sum) 값이 복사.
        //start=1, end=10 값을 아래 for문에 적용.
        System.out.println(sum);
        
        int sum2=getSum(1,100);
        //start=1, end=100 값을 아래 for문에 적용
        System.out.println(sum2);
        
        int sum3=getSum(1,sum2);
        //start=1, end=sum2 값을 아래 for문에 적용
        System.out.println(sum3);
    }
    
    public static int getSum(int start, int end){
        //int getSum 메서드를 적어서 위for문을 실행시킨다.       
        int sum=0;
        for(int i=start; i<=end; i=i+1){
            sum=sum+i;
        }
        System.out.println("asdasd");
        return sum;//리턴 sum값을 위 getSum(1,10);에 올려준다. 
        //sum값이 같이 리턴되어 위 수식 문장안에 넣어져서 수식문장을 완성한다.
    }
}