package java17.stshape;

public class Circle extends Shape{
    
    public int radius=0;
    

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
    
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", x=" + x
                + ", y=" + y + ", toString()=" + super.toString() + "]";
    }

    public Shape getShape(){
        return null;
        
    }
    
    public void draw(){
        
        System.out.println("ccccccc");
    }
}
