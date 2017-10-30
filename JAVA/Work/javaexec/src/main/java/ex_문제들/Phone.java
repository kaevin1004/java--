package ex_문제들;

public class Phone {
    
    private String name;
    private String address;
    private String number;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return "Phone [name=" + name + ", address=" + address + ", number="
                + number + "]";
    }
    
    public Phone() {
        super();
    }
    
    public Phone(String name, String address, String number) {
        super();
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    
    
    
    
    
}
