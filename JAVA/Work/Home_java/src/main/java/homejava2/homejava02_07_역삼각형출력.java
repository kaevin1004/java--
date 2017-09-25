package homejava2;

public class homejava02_07_역삼각형출력 {
    public static void main(String[] args){
        
        for(int i=1; i<=10; i=i+1){//i가 10개가 될때까지 반복하게 하는 문장
            for(int j=10; j>=i; j=j-1){//i가 j와 같아질때까지 -1을 반복한다.
                System.out.print("*");//별을 출력한다.
            }
            System.out.println("");//반복을 실행하고,
        }
    }
}
