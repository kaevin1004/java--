package java02;

public class jv04_01_구구단가로출력2 {
    
public static void main(String[] args){
        
        for(int i=2; i<=19; i=i+1){
            
            for(int j=1; j<=9; j=j+1){
                
                int sum=i*j;
                System.out.print(i+" "+"*"+" "+j+" "+"="+" "+sum);
                
                if(j==9){
                    System.out.print(".");
                }
                else{
                    System.out.print(","+" ");
                }
                
            }
            System.out.println();
            
        }
    }
    
}
