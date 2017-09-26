package homejava03;

public class homejava03_01_배열의선언과생성 {
    public static void main(String[] args){
        
        int size=6;
        int[] number=new int[size];
        
        for(int i=0; i<number.length; i=i+1){
            number[i]=i;
            System.out.println(number[i]);
        }
        for(int j=0; j<number.length; j=j+1){
            System.out.println(number[j]);
        }
    }
    
}
