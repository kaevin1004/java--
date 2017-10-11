package java11.st2;

public class boxtest {
    
    public static void main(String[] args){
        
        box mebox=new box();
        //box의 인스톤스 생성한다.
        box b=new box(100, 100, 100);//다른 예
        
        mebox.setWidth(100);
        // width=100;
        mebox.setLength(100);
        //length=100;
        mebox.setHeight(100);
        //height=100;
        
        System.out.println(mebox.toString());
        //box 메서드 안의 toString메서드를 출력한다.
        
        b.printVolumn();//다른 예
        
        mebox.printVolumn();
        //box클래스 안 void printVolumn메서드의 값을 실행하라.
        
    }
    
    
}
