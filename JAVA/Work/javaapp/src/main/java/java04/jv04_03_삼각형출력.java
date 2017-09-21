package java04;

public class jv04_03_삼각형출력 {
    public static void main(String[] args){
        
        
        for(int i=1; i<=5; i=i+1){
            for(int j=1; j<=5; j=j+1){
                if(i==j){
                    System.out.println("*");
                }
                else{
                    System.out.print("     ");
                }
            System.out.println();    
            }
        
        }
    }
    
}
