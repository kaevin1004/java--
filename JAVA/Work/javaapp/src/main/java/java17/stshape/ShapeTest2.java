package java17.stshape;

public class ShapeTest2 {
    
    public static void main(String[] args){
        
        // 글래스 상향 형변환
        Shape s= null;
        Rectangle r= new Rectangle();
        
        r.x=20;
        r.y=5;
        r.widht=100;
        r.height=100;
        System.out.println("r"+ r.toString());
        
        s=r; //클래스 형변환 발생: Rectangle----> Shape
        
        System.out.println("s"+ s.toString());
        
        s.x=10;
        s.y=10;
        s.width = 100;
        s.height=100;
        System.out.println("s"+s.toString());
        System.out.println("r"+r.toString());
        
    }
    
}
