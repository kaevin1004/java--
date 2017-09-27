package java07;

public class jv07_05_foreach {
    public static void main(String[] args){
        
        int[] numbers={10,20,30};
        
        //for문을 사용하여 배열 값 출력
        
        for (int j=0; j<=numbers.length-1; j=j+1){
            System.out.println(numbers[j]);
        }
        
        //for each문을 이용하여 배열에 값을 출력
        for(int value : numbers){
            System.out.println(value);
        }//배열 출력할때 사용 그 외엔 위험함.
        
    }
    
}
