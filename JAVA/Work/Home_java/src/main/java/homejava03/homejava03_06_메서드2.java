package homejava03;

public class homejava03_06_메서드2 {
    public static void main(String[] args){
        
        int sum=a(1,10);
        System.out.println(sum);
        int sum2=a(1,100);
        System.out.println(sum2);
        int sum3=a(1,sum2);
        System.out.println(sum3);
    }
    public static int a(int s, int e){
        
        int sum=0;
        for(int i=s; i<=e; i=i+1){
            sum=sum+i;
        }
        return sum;
    }
   
}
