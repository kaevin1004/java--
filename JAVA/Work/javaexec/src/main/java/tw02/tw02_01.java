package tw02;

public class tw02_01 {
    public static void main(String[] args){
        
        printhello();  //
        
        System.out.println("asdasdad");
        
        printhello();
       
    }
    public static void printhello(){
        int x = 0;
        for (int i = 1; i <= 10; i++)
        {
            x = x + i;
        }
        System.out.println(x);
        System.out.println("Hello World");
        
        return;//void메서드는 리턴 값이 없다. 일회성이다.  - 실행한 부분으로 돌아가라
    }//리턴시 출력한 값을 가지고 올라가지 않고 출력한 다음 메인 메서드의 다음 수식문장을 실행한다.
}
