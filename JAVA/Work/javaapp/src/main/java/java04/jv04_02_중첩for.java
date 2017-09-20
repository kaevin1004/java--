package java04;

public class jv04_02_중첩for {
    public static void main(String[] args){
        
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        
        System.out.println("for 문으로 변경");
        //for문으로
        int sum= 0;
        for(int i=1; i <= 5; i=i+1){
            System.out.println("**********");
        }
        System.out.println("중첩 for 문으로 변경");
      //중첩 for 문으로
                 
        for(int i=1; i <= 5; i=i+1){//첫번째 for문
            
        }
            for(int j=1; j <= 10; j=j+1){//두번째 중첩 for문
                System.out.print("*");
        }
        System.out.println();
    }
    
}
