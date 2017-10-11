package java11.st2;

public class cartest {
    
    public static void main(String[] args){
        
        car mycar = new car();
        mycar.speedup(100);//mycar.speed = 100;
        
        mycar.speedprint();
        System.out.println(mycar.toString());
        
        
        car yourcar=new car();
        yourcar.setColor("블루");
        yourcar.setSpeed(80);
        yourcar.setGear(3);
        

        System.out.println(yourcar.toString());
    }
    
}
