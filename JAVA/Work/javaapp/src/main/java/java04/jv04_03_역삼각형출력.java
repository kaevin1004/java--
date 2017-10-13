package java04;

public class jv04_03_역삼각형출력 {
    public static void main(String[] args){
       
        for(int i=1; i<=5; i=i+1){
            for(int j=5; j>=i; j=j-1){
                System.out.println("*");
            }
            System.out.println("");
        }
        
    }
    
}
