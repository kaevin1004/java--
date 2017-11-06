package 박채봉.ex4;

public class Oper {
    
    private int firstNum;
    private int secondNum;
    
    
    public int getFirstNum() {
        return firstNum;
    }
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }
    public int getSecondNum() {
        return secondNum;
    }
    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }
    
    @Override
    public String toString() {
        return "Oper [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
    }
    
    public Oper() {
        super();
    }
    
    public Oper(int firstNum, int secondNum) {
        super();
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    
    public static int add(int firstNum, int secondNum){
        
        return firstNum+secondNum;
    }

    public static int minus(int firstNum, int secondNum){
        
        return firstNum-secondNum;
        
    }
    
    public static int mul(int firstNum, int secondNum){
        
        return firstNum*secondNum;
        
    }
    
    public static double div(double firstNum, double secondNum){
        
        return (double)firstNum/(double)secondNum;
        
    }
    
    
}
