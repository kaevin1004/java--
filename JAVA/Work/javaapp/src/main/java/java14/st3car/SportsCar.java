package java14.st3car;

public class SportsCar extends Car {
    
    private boolean turbo;
    
    // getter & setter
    // 생성자
    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
    
    //toString
    
    @Override
    public String toString() {
        return "SportsCar [turbo=" + turbo + ", toString()=" + super.toString()
                + "]";
    }

    //constructor
    //생성자
    
   public SportsCar() {
        super();// ===== Car();
        
    }

   public SportsCar(int speed, int gear, String color) {
       super(speed, gear, color);//=====Car(int speed, int gear, String color)
       
   }

   public SportsCar(boolean turbo) {
       super();// ====== Car();
       this.turbo = turbo;
   }

    public SportsCar(String color, boolean turbo) {
    super(color);
    this.turbo = turbo;
}

    public SportsCar(int speed, int gear, String color, boolean turbo) {
        super(speed, gear, color);// ===Car(int speed, int gear, String color)
        this.turbo = turbo;
        
        
        
    }

    public SportsCar(int speed, String color) {
        super(speed, color);
    }
    
   
   
    
    
   
    
   
    
}
