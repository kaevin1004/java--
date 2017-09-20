package java04;

public class jv04_ex04_15_for실습예제 {
    public static void main(String[] args){
        
        int sum=0;
        for(int i=9; //i는 9
                     i>=1; //i는 1보다 크거나 같으면 반복실행된다
                          i=i-1){//i는 -1씩 감소한다.
            sum=2*i;// i는 2씩 곱한다.
            System.out.println("2*"+i+"="+sum);// for문 출력되는 문장             
         }
        
    }
    
}
