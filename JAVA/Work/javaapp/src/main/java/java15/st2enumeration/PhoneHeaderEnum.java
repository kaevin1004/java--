package java15.st2enumeration;

public enum PhoneHeaderEnum {
    
    P010("010"),
    P011("011"),
    P016("016"),
    P017("017"),
    P018("018"),
    P019("019");
    
    private final String value;
    PhoneHeaderEnum(String value){
        
        this.value = value;
    }
    
    public String getvalue(){
      //enum은 숫자클래스라서 문자로 받을 수 있는 메서드를 적어준다.        
        
        return value;
    }
    
}
