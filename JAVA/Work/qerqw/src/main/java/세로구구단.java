
public class 세로구구단 {
    public static void main(String[] args){
        
        int sum=0;
        for(int i=1; i<=9; i=i+1){//1단부터 9단까지 수식
            for(int j=1; j<=9; j=j+1){//곱해야 하는 수
                sum=i*j;
                System.out.println(i+"*"+j+"="+sum);
            }
        }System.out.println();
    }
    
}
