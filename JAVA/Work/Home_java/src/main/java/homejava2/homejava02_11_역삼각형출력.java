package homejava2;

public class homejava02_11_역삼각형출력 {
    public static void main(String[] args){
        
        for(int i=1; i<=5; i=i+1){
            for(int j=5; j>=i; j=j-1){//j가 i와 같아질때까지 -1씩 반복해라
                System.out.print("*");
            }
                
            System.out.println("");
        }
        
    }
    
}
