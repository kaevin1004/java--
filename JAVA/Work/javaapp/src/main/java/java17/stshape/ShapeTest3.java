package java17.stshape;

public class ShapeTest3 {
    
    public static void main(String[] args){
        
        //클래스 하양 형변환
        Shape s = new Rectangle();
        Rectangle r = (Rectangle) s;
        
        r.x=10;
        r.y=10;
        r.widht=200;
        r.height=200;
        
        System.out.println("s"+s.toString());
        System.out.println("r"+r.toString());
    }
    
}
