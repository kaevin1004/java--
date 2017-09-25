package java06;

public class jv06_11_서로변경 {
    public static void main(String[] args){
        
        int a=5;
        int b=3;
        //기본 메소드는 변경되지 않는다.
        System.out.println("swap 전:a="+a+",b="+b);
        swap(a,b);
        System.out.println("swap 후:a="+a+",b="+b);
    }
    //서로의 메소드 영역은 서로 다른 곳이다.
    private static void swap(int a, int b){//복사가 발생한다.
        int temp=b;
        b=a;
        a=temp;
        System.out.println("swap 안:a="+a+",b="+b);
    }//스왑 안에서는 값이 변경됨
    
}
