package java02;

public class jv02_016_비교논리결합 {
    public static void main(String[] args) {
        //정수 변수 선언 & 초기화
        int x = 3;
        int y = 4;
        
        System.out.println((x==y) && (x!=y) ); // fales and true = false
        System.out.println((x>y) || (x<y) ); // fales or true = true
        System.out.println((x>=y) || (x<=y) ); // fales or true = true
        System.out.println((x==y) && (x!=y) || (x<y) ); //fales and true or true = true
        
    }
    
}
