package java04;

public class ex04_11_구구단 {
    public static void main(String[] args){
        
        int r=0;
        
        for(int i=2; i<=19; i=i+1){//i값 반복문
            
            for(int j=1; j<=9; j=j+1){//j값 반복문
                
                r=i*j;
                
                System.out.print(i+"*"+j+"="+ r );
                if(j==9){//j가 9랑 같다면 if값 출력
                    System.out.print(".");
                }
                else{//j가 9랑 같지 않다면 else값 출력
                    System.out.print(",");
                }
             
            }
            System.out.println();
        }
    }
    
}
