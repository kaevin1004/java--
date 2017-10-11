package java11.st2;

public class box {
    
    private int width;
    private int length;
    private int height;
    
    
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
        //boxtest의 mebox.setwidth
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
      //boxtest의 mebox.setlength
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
      //boxtest의 mebox.setheight
    }
    
    
    public box() {
        super();
    }
    public box(int width, int length, int height) {
        super();
        this.width = width;
        this.length = length;
        this.height = height;
    }
    @Override
    public String toString() {
        return "box [width=" + width + ", length=" + length + ", height="
                + height + "]";
    }
    
    int getVolumn(){
        
        return width*length*height;
    }
    void printVolumn(){
        
        int volumn=getVolumn();
        System.out.println(volumn);
    }
    
    
    
}
