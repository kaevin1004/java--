package java17.stshape;

public class Rectangle extends Shape{
    
    public int widht=0;
    public int height=0;
    
    
    public int getWidht() {
        return widht;
    }
    public void setWidht(int widht) {
        this.widht = widht;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    @Override
    public String toString() {
        return "Rectangle [widht=" + widht + ", height=" + height + ", color="
                + color + ", x=" + x + ", y=" + y + ", toString()="
                + super.toString() + "]";
    }
    public Shape geShape(){
        return null;
               
    }
    public void draw(){
        System.out.println("bbbbbbbbb");
    }
    
}
