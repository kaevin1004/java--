package java13.st4callstack;

public class callstact {
    
    public static void main(String[] args) {
        
        firstmethod();
        
    }
    
    static void firstmethod(){
        
        secondmethod();
        
    }
    
    static void secondmethod(){
        
        System.out.println("secondmethod");
        
    }
    
}
