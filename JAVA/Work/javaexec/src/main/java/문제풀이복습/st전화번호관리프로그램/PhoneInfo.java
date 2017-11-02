package 문제풀이복습.st전화번호관리프로그램;

public class PhoneInfo {
    
    private String name;
    private String phoneNumer;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumer() {
        return phoneNumer;
    }
    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }
    
    @Override
    public String toString() {
        return "PhoneInfo [name=" + name + ", phoneNumer=" + phoneNumer + "]";
    }
    
    public PhoneInfo() {
        super();
    }
    
    public PhoneInfo(String name, String phoneNumer) {
        super();
        this.name = name;
        this.phoneNumer = phoneNumer;
    }
     
}
