package java12.st3car;

public class cartest {
    
    public static void main(String[] args){
        
        car mycar = new car();
        mycar.speedup(100);//mycar.speed = 100;
        
        mycar.speedprint();
        System.out.println(mycar.toString());
        System.out.println("numberOfCars="+mycar.getNumberOfCars());
        
        
        car yourcar=new car();
        yourcar.setColor("블루");
        yourcar.setSpeed(80);
        yourcar.setGear(3);
        

        System.out.println(yourcar.toString());
        System.out.println("numberOfCars="+yourcar.getNumberOfCars());
        
        System.out.println("----------------");
        System.out.println("numberOfCars="+mycar.getNumberOfCars());
        System.out.println("numberOfCars="+yourcar.getNumberOfCars());
      //공유데이터
        
        
        System.out.println("----------------");
        
        System.out.println(car.getNumberOfCars());//스태틱이 붙은 출력문
        
        System.out.println(car.numberOfCars);//퍼블릭 스태틱이 붙으면 인스턴스 명으로
    }    
    
    
}
