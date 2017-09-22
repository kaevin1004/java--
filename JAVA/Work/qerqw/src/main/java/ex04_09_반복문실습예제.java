
public class ex04_09_반복문실습예제 {
    public static void main(String[] args){
        
        int sum = 0;

        for (int i = 1; i <= 10; i = i + 1) {//1~10까지의 더하기 수식
        for (int j = 1; j <= i; j = j + 1) {
        sum = sum + j;
//ex) 1+(1+2)+(1+2+3).... 10까지의 더하기 수식
        }

        }

        System.out.printf("결과값은:"+sum);
        
        
    }
    
    
}

   