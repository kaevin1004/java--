import java.util.Scanner;

public class fdfdf {
    public static void main(String[] args){
        
        int n1=0;//첫번째 수
        int n2=0;//두번째 수
        Scanner keyboard = new Scanner(System.in);
        System.out.print("정수를 입력하시오");
        n1=keyboard.nextInt();//첫번째 수를 키보드로 입력
        n2=keyboard.nextInt();//두번째 수를 키보드로 입력
        
        int sum=0;
        for(int i=n1; i<=n2; i=i+1){//i=첫번째수; i<=두번째수; i=i+1)
            sum=sum+i;
            System.out.print(i);
            
            if(i==n2){//i가 종료값과 같다면 if를 실행한다.
                System.out.print("=");
            }
            else{//i가 종료값과 같지 않다면 else를 실행 하고for문을 반복한다.
                System.out.print("+");
            }
        }System.out.println(sum);
    }
    
}
