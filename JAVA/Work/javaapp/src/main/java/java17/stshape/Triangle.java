package java17.stshape;

public class Triangle extends Shape{
    
    public int base=0;
    public int height=0;
    
    
    
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", color="
                + color + ", x=" + x + ", y=" + y + ", toString()="
                + super.toString() + "]";
    }
    public Shape getShape(){
        return null;
        
    }
    public void draw(){
        System.out.println("dddddddd");
    }
}
