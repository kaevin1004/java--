package tw02;

public class tw02_03_사칙연산 {
    public static void main(String[] args){
        
        int a=2, b=4;
        
        System.out.println(Add(a,b));
        System.out.println(Minus(a,b));
        System.out.println(Mul(a,b));
        System.out.println(Div(a,b));
        
    }
    public static int Add(int x, int y){
        
        return x+y;
    }
    public static int Minus(int x, int y){
        
        return x-y;
    }
    public static int Mul(int x, int y){
        
        return x*y;
    }
    public static double Div(int x, int y){
        
        
        return (double)x / (double)y ;
    }
    
}
