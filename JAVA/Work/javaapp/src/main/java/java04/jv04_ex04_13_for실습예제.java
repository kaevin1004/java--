package java04;

public class jv04_ex04_13_for실습예제 {
    public static void main(String[] args){
        
        int sum=0;  //부터까지는 for문으로 생성.
                
        for(int i = 1; i <=9; i=i+1){
            sum = 3*i;//sum=sum(숫자변경)+(수식변경)i;
            System.out.println("3*"+i+"="+sum);//for문 안에서 출력??(반복수만큼)
        }
           //for문 밖에서 출력??(1번만 출력)
    }
    
}
