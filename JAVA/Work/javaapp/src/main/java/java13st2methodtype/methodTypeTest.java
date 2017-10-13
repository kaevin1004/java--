package java13st2methodtype;

public class methodTypeTest {
    
    public static void main(String[] args){
        
        methodType m = new methodType();
        
        //인스턴스 메서드를 호출할 때는 인스턴스 이름.메서드명
        m.instanceMethod();
        
        
        m.staticMethod();// 이 방법은 사용치 말자.
        
        
        //ststic 메서드를 호출할 때는 클래스이름.메서드명
        methodType.staticMethod();
        
    }
   
    
}
