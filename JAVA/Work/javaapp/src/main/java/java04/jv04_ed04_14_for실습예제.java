package java04;

public class jv04_ed04_14_for실습예제 {
    public static void main(String[] args){
        
        int sum=0;
        for(int i=1; i<=9; i=i+1){//for문 기본 입력 수식
            sum=2*i;//sum=sum(숫자입력)*(수식입력)i;
            System.out.print("2*"+i+"="+sum);
            if(i==9){//i가 9와 같다면
                System.out.print(".");//true면 if 값 출력
            }
            else{
                System.out.print(",");//false면 else값 출력
            }
        }
    }
    
}
