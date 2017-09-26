package java07;

public class jv07_01_배열의선언과생성 {
    public static void main(String[] args){
        
        int size=6;// size = length와 같다.
        int[] numbers=new int[size];
        
        for(int i=0; i<numbers.length; i=i+1){//시작은 0부터 시작
            //i=0; i<6; i=i+1로 해석한다.
            numbers[i]=i;//
            
        }
        for(int j=0; j<numbers.length; j=j+1){
            System.out.println(numbers[j]);
            
        }
    }
    
}
