package java12.st3car;

public class car {
    
    //필드
    private String color = "빨강";
    private int speed = 100;
    private int gear = 4;
    
    private int carid = 0;
    
    //static필드 선언
    public static int numberOfCars=0;
    
    
    
    //동작:메서드
 
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    
    
    public void speedup(int s){
        speed=speed+s;//speed+=s;
        
    }
    public void speeddown(int s){
        speed=speed-s;//speed-=s;
        
    }
    public void speedprint(){
        System.out.println("속도"+speed+"km");
    }
    
 //-----------------------------------------------------//    
    //getter & setter
    //마우스 오른쪽 source-> get and set
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    
    
//------------------------------------------------------//    
   
    
    //constructor 
    //마우스 오른쪽 source-> constructor using field
  
    public car() {
        super();
        carid=++numberOfCars;
    }
    
    public car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        carid=++numberOfCars;
    }
//-----------------------------------------------------------//    
    
    @Override
    public String toString() {
        return "car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + ", carid=" + carid + "]";
    }
    
    
   
    
    

}
