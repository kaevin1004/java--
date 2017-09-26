package tw02;

public class tw02_02 {
    
    public static void main(String[] args){
        
        int a=4;
        int b=6;
        int c=Add(a,b);//add값을 복사받아서 새로운 변수로 받는다.
        System.out.println(a+"+"+b+"="+c);
    }
    
    public static int Add(int x, int y){
        
        return x+y;//add값을 리턴 시킨다.
    }
    
}
