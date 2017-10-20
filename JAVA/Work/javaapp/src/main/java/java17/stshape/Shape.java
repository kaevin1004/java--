package java17.stshape;

public class Shape {
    
    protected String color="";
    protected int x=0;
    protected int y=0;
    
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
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
    
      
    @Override
    public String toString() {
        return "Shape [color=" + color + ", x=" + x + ", y=" + y + "]";
    }
    public Shape getShape(){
        return null;
                
    }
    public void draw(){
        
        System.out.println("Shape draw()");
    }
}
