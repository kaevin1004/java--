package homejava2;

public class homejava02_08_구구단 {
    public static void main(String[] args){
        
        int a=0;
        
        for(int i=2; i<=9; i=i+1){//2단에서 9단 설정
            for(int j=1; j<=9; j=j+1){//곱하는 수 결정
                a=i*j;//곱하기 수식
                System.out.println(i+"*"+j+"="+a);
            }//곱하기 출력 수식
        }
    }
    
}
