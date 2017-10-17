package java14.st4shape;

public class RectangleTest {
    
    public static void main(String[] args) {
        
        //Rectangle 인스턴스 r1,r2,r3,r4 만드시오.
        
        Rectangle r1=new Rectangle();
        
        
      //r1 (x=1, y=1, color='black', whidth=0, heigth=0;)
        r1.setX(1);
        r1.setY(1);
        r1.setColor("black");
        r1.setWidth(0);
        r1.setHeight(0);
        
        
        //r2 (x=0, y=0, color='0', whidth=0, heigth=0;)
        Rectangle r2=new Rectangle();
        
        //r3 (x=0, y=0, color='0', whidth=100, heigth=200;)
        Rectangle r3=new Rectangle(100, 200);
        
        //r4 (x=1, y=1, color='black', whidth=100, heigth=200;)
        Rectangle r4=new Rectangle(1, 1, "black", 100, 200);
        
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        
    }
    
}
