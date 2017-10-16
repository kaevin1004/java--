package java13.st5emp;

import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args){
        
        //키보드로부터 입력 받기
        Scanner key = new Scanner(System.in);
        
        //사원수를 입력 받기
        
        System.out.println("사원 수:"+" ");
        int r=key.nextInt();
        //Employee를 저장하는 배열을 만든다.
        Employee[] a = new Employee[r];
        
        
        
        for(int i=0; i<=a.length-1; i=i+1){
           
          //배열에 저장되는 코드를 추가.
            a[i]=new Employee();
            
            System.out.print("이름 :"+" ");
            String x=key.next();
            
            System.out.print("주소 :"+" ");
            String y=key.next();
            
            System.out.print("주민번호 :"+" ");
            String z=key.next();
            
            System.out.print("월급 :"+" ");
            int c=key.nextInt();
            
            //setter를 이용하여 필드 값 설정
            a[i].setName(x);
            a[i].setAddres(y);
            a[i].setRrn(z);
            a[i].setSalary(c);
            
            
            
         }
        System.out.println();
            //for문을 사용하여 배열의 값을 출력하시오
            for(int i=0; i<=a.length-1; i=i+1){
            
                System.out.println(a[i].toString());
        }
        
    }
    
}
