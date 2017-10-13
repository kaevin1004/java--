package java13.st5emp;

public class Employee {
    
    private String name;
    private String addres;
    private String rrn;
    private int salary;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public String getRrn() {
        return rrn;
    }
    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
    public Employee() {
        super();
    }
    
    public Employee(String name, String addres, String rrn, int salary) {
        super();
        this.name = name;
        this.addres = addres;
        this.rrn = rrn;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee [name=" + name + ", addres=" + addres + ", rrn=" + rrn
                + ", salary=" + salary + "]";
    }
    
    
            
        
}
