package tw02;

public class tw02_04_배열 {
    
    public static void main(String[] args){
        
        int size=6;//배열 갯수를 정한다.
        
        int[] numbers=new int[size];//배열을 만든다.
        
        for(int i=0; i<=numbers.length-1; i=i+1){
            //i는0부터 배열명.length-1 까지 i를 1씩 증가시킨다.
            
            numbers[i]=i;//i값을 배열에 넣는다. 0부터 배열명.length-1까지
            
            System.out.print(numbers[i]);
        }
        
        for(int j=0; j<=numbers.length-1; j=j+1){
            //위 i와 같은 이치.
            numbers[j]=j;
            //위 i와 같은 이치.
            System.out.print(numbers[j]);
        }
    }
    
}
