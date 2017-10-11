package java11.st2;

public class oper {
    
    private int x;
    private int y;
    
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    int Add(){
        return x+y;
    }
    int Minus(){
        return x-y;
    }
    int Mul(){
        return x*y;
    }
    double Div(){
        return (double)x/(double)y;
    }
    
}
