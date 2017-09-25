package homejava2;

public class homejava02_06_삼각형출력 {
    public static void main(String[] args){
        
        for(int i=1; i<=10; i=i+1){//for문 작성 시작값과 종료값을 넣는다.
            for(int j=1; j<=i; j=j+1){//j<=i값을 넣어 종료될때까지 반복하게 한다.
                System.out.print("*");
            }//옆으로 출력하게 하고 별이 반복되며 늘어난다.
            System.out.println("");
        }//줄바꿈을 해주면서 다시for문으로 간다 ""빈칸을 만든다.
    }
    
}
