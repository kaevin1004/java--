package java04;

public class jv04_03_역삼각형출력 {
    public static void main(String[] args){
        
        for(int i=1; i<=5; i=i+1){//i가 5가 될때까지 반복하는 문장
            for(int j=5; j>=i; j=j-1){//j가 i와 같아질때 까지 반복하는 문장
                
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
