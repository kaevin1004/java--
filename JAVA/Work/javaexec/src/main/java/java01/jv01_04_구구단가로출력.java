package java01;

public class jv01_04_구구단가로출력 {
    
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
