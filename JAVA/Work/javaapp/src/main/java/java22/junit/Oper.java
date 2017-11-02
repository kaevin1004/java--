package java22.junit;

public class Oper {
    
    private int a = 0;
    private int b = 0;
    
    
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return "Oper [a=" + a + ", b=" + b + "]";
    }
    
    public Oper() {
        super();
    }
    public Oper(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
    
    public int add(){
        
        return this.a + this.b;
    }
    
public int minus(){
        
        return this.a - this.b;
    }

public int mul(){
    
    return this.a * this.b;
}

public double div(){
    
    return (double)this.a / (double)this.b;
}

    
}
