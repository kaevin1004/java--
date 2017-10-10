package java08;

public class jv08_String_format {
    
    public static void main(String[] args){
        
        String fo3= String.format("H__%d", 2); System.out.println(fo3);
        
        String fo4= String.format("%04d",30); System.out.println(fo4);
        
        String fo5= String.format("%,d",1000000000); System.out.println(fo5);
        
        String fo6= String.format("%.2f", 44444444.4444444);
        System.out.println(fo6);
        
        String fo7= String.format("%,.2f",44444444.4444444);
        System.out.println(fo7);
    }
    
}
