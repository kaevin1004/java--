package java02;

public class jv02_01_구구단세로출력 {
    
    public static void main(String[] args){
        
        for(int i=2; i<=19; i=i+1){
            
            for(int j=1; j<=9; j=j+1){
                
                int sum= i*j;
                System.out.println(i+" "+"*"+" "+j+" "+"="+" "+sum);
            }
        }
    }
    
}
