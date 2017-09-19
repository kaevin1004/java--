package java01;

public class jv01_02_Debug {
    
    public static void main(String[] arge){
    
        int x = 100;      //동글 점 = 브레이크 포인트 f6으로 한 단계씩 내림
        x++;
        x++;
        
        System.out.println(x);   // 첫번째 브레이크 포인트에서 f8로 다음 포인트 이동(없다면 그대로 종료)
    
        x--;
        System.out.println(x);
    }
    
}