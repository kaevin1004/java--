package java06;

public class jv06_01_왜매서드를쓰는가 {
    public static void main(String[] args){
       
        int sum=0;
        for(int i=1; i<=10; i=i+1){
            sum=sum+i;
        }
        System.out.println(sum);
        
        int sum2=0;
        for(int i=1; i<=100; i=i+1){
            sum2=sum2+i;
        }
        System.out.println(sum2);
        
        int sum3=0;
        for(int i=1; i<=sum2; i=i+1){
            sum3=sum3+i;
        }
        System.out.println(sum3);
    }
}