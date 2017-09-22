package home_java1;

public class homejava01_10_가로점구구단 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1; i<=9;i=i+1){//for문 기본 입력 수식
            sum=sum+i;//sum=sum(숫자입력)*(수식입력)i;
            System.out.print("2*"+i+"="+sum);
            if(i==9){//i가 9와 같다면
                System.out.print(".");//true면 if 값 출력
            }
            else{
                System.out.print(",");//false면 else값 출력
            }
        }
        
    }//for문 안에 if-else문이 들아간 문장
    
}
