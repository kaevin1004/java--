package homejava2;

public class homejava02_10_삼각형출력 {
    public static void main(String[] args){
        
        for(int i=1; i<=5; i=i+1){//for문 작성시 반복횟수를 적는다
            for(int j=1; j<=i; j=j+1){//i값을 넣어 종료될때까지 반복하게 한다.
             //j가 i와 같거나 작을때까지 -1씩 해야한다.   
                System.out.print("*");//*이 반복되며 옆으로 출력하게 한다.
            }
            System.out.println("");//줄바꿈을 해주며 나머지는 빈공간으로 채우고 다시 for문으로 돌아가게 한다.
        }
    }
    
}
