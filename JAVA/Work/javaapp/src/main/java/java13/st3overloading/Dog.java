package java13.st3overloading;

public class Dog {
    
    public void sound(){
        
        System.out.println("sound");
    }
    
    public void sleep(){
        
        System.out.println("sleep");
    }
    
    public void sleep(int x){
        
        //오버로딩(메서드 관계가 수평적이다.)
        
        System.out.println("sleep(int x)");
    }
    
    public void sleep(String x){
        
        System.out.println("sleep(String x)");
        
     }
    
    
    public void sleep(int y,String x){
        
        System.out.println("sleep(int x)");
    }
    
    public void sleep(String x,int y){
        
        
        System.out.println("sleep(int x)");
        
    }
    
}
