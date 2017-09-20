package home_java;

public class jv_home_03 {
    public static void main(String[] args) {
        int x=1;
        
        System.out.printf("x=%d 일때, 참인 것은%n", x);
        
        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("(!(x==0)");
        if(!(x!=0)) System.out.println("(!(x!=0)");
        
        x=1;
        System.out.printf("x=%ㅇ 일때, 참인 것은%n", x);
        
        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0)");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");
    }
    
}
