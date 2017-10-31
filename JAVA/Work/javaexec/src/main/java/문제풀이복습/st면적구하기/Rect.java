package 문제풀이복습.st면적구하기;

public class Rect {
    
    private int width;
    private int height;
    
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
     public int area(){
        
         return width*height;
        
    }
     
     public int perimeter(){
         
         return 2*(width+height);
     }
    
    public Rect() {
        super();
    }
    
    
    public Rect(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }
    
    
    @Override
    public String toString() {
        return "Rect [width=" + width + ", height=" + height + "]";
    }
     
}
