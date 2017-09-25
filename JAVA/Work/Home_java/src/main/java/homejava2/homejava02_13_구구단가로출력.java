package homejava2;

public class homejava02_13_구구단가로출력 {
    public static void main(String[] args){
        
        int sum=0;
        for(int i=1; i<=9; i=i+1){
            for(int j=1; j<=9; j=j+1){
                sum=i*j;
                System.out.print(i+"*"+j+"="+sum);
                if(j==9){
                    System.out.print(".");
                }
                else{
                    System.out.print(",");
                }
            }
            System.out.println();//줄바꿈으로 for문으로 돌아가기
        }
    }
    
}
