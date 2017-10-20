package java17.stshape;

public class ShapeTest {
    
    public static void main(String[] args){
        
        Circle a= new Circle();
        a.draw();
        
        Rectangle b= new Rectangle();
        b.draw();
        
        Triangle c= new Triangle();
        c.draw();
        
        Shape s = new Rectangle();
        s.draw();
    }
    
}
