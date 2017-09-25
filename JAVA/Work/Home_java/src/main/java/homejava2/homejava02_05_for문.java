package homejava2;

public class homejava02_05_for문 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1; i<=5; i=i+1){
            sum=sum+i;
            System.out.print(sum+"\n");
        }
        int n=0;
        for(int i=1; i<=9; i=i+1){
            for(int j=1; j<=9; j=j+1){
                n=2*i;
            }
            System.out.println("2*"+i+"="+n);
        }
    }
    
}
