package java13.st5emp;

import java.util.Scanner;

public class EmployeeTest2 {
    
    public static void main(String[] args){
        
        
       Employee[] arr=new Employee[3];
        
       Scanner key=new Scanner(System.in);
       
       
       for(int i=0; i<3; i=i+1){
           System.out.print("이름:"+" ");
           String name=key.next();
           
           System.out.print("주소 :"+" ");
           String addres=key.next();
           
           System.out.print("주민번호 :"+" ");
           String rrn=key.next();
           
           System.out.print("월급 :"+" ");
           int salary=key.nextInt();
           
           //생성자를 이용하여 인스턴스 생성
           
           Employee emp1=new Employee(name, addres, rrn, salary);
           
           //emp1의 모든 값을 출력하시오
           System.out.println(emp1.toString());
           
           //직원의 인스턴스를 배열에 저장하는 코드 추가.
           arr[i] = emp1;
           System.out.println("------------------------------------------------");
           
       }
       //배열의 원소값을 출력할 때는 for each 문을 사용하도록 하시오
       for( Employee e : arr){
           System.out.println(e.toString());
       }
    }
    
}
