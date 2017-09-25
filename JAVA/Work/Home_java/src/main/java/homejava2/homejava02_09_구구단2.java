package homejava2;

public class homejava02_09_구구단2 {
    public static void main(String[] args){
        
        int sum=0;
        
        for(int i=2; i<=19; i=i+1){//2단에서 9단까지 설정
            for(int j=1; j<=9; j=j+1){//곱하는 숫자 설정
                sum=i*j;//곱하기 수식
                System.out.print(i+"*"+j+"="+sum);//옆으로 출력
                //곱하기 수식 출력
                if(j==9){//j가 9와 같으면 if문 출력
                    System.out.print(".");
                }
                else{//j가 9와 같지 않다면 else문 출력
                    System.out.print(",");
                }
            }
            System.out.println();//반복실행 단설정for문으로 돌아가
        }
    }
    
}
