package java06;

public class jv06_03_사칙현산매서드 {
    
    public static void main(String[] args){
        
        int x=2, y=4;
        //int div(소수점으로 하려면 더블로 변경)
        
        System.out.println(Add(x, y));
        System.out.println(minus(x, y));
        System.out.println(mul(x, y));
        System.out.println(div(x, y));
    }
    
    private static int Add(int x, int y){
        
        return x+y;
    }
    
    public static int minus(int x, int y){
        
        return x-y;
    }
    
    public static int mul(int x, int y){
        
        return x*y;
    }
    
    public static double div(int x, int y){
        
        return (double)x/(double)y;
    }//소숫점으로 변경하려면 int자리에 더블로 변경.
    
}
