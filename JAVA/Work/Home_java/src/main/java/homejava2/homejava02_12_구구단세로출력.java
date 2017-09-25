package homejava2;

public class homejava02_12_구구단세로출력 {
    public static void main(String[] args){
        
        int sum=0;
        for(int i=1; i<=9; i=i+1){
            for(int j=1; j<=9; j=j+1){
                sum=i*j;
                System.out.println(i+"*"+j+"="+sum);
            }
        }
    }
    
}
