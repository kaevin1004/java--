package java06;

public class jv06_03_사칙현산매서드 {
    
    public static void main(String[] args){
        
        int x=2, y=4;
        int add=Add(x,y);
        int minus=minus(x,y);
        int mul=mul(x,y);
        double div=div(x,y);//int div(소수점으로 하려면 더블로 변경)
        
        System.out.println(add);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);
    }
    
    private static int Add(int x, int y){
        int a = x+y;
        
        return a;
    }
    
    public static int minus(int x, int y){
        int b=x-y;
        return b;
    }
    
    public static int mul(int x, int y){
        int c=x*y;
        return c;
    }
    
    public static double div(int x, int y){
        double d=(double)x/(double)y;
        return d;
    }//소숫점으로 변경하려면 int자리에 더블로 변경.
    
}
