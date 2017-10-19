package java14.st6manager;

public class Manager extends Employee{
    
    private int bouns = 0;
    
    
    // getter & setter
    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }
    
    
    // toString
    @Override
    public String toString() {
        return "Manager [bouns=" + bouns + ", salary=" + salary
                + ", toString()=" + super.toString() + "]";
    }

    // constructor
     public Manager() {
        super();
    }
    
    public Manager(int bouns) {
        super();
        this.bouns = bouns;
    }

    //method
    public void test(){
        
        String info = "name:" + super.getName();
        info = info + "address:" + super.getAddress();
        info = info + "salary:" + super.salary;
        info = info + "rrn:" + super.getRrn();
        
        System.out.println(info);
    }

   
    
    
}
