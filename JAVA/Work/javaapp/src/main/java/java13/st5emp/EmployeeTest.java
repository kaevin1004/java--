package java13.st5emp;

import java.util.Scanner;

public class EmployeeTest {
    
    public static void main(String[] args){
        
        
        Scanner key = new Scanner(System.in);
        
        
        
        Employee[] a = new Employee[3];
        
        
        for(int i=0; i<=a.length; i=i+1){
           
            a[i]=new Employee();
            
            System.out.print("이름 :"+" ");
            String x=key.next();
            
            System.out.print("주소 :"+" ");
            String y=key.next();
            
            System.out.print("주민번호 :"+" ");
            String z=key.next();
            
            System.out.print("월급 :"+" ");
            int c=key.nextInt();
            
            a[i].setName(x);
            a[i].setAddres(y);
            a[i].setRrn(z);
            a[i].setSalary(c);
            
            
         }
        System.out.println();
        
            for(int i=0; i<=a.length; i=i+1){
            
                System.out.println(a[i].toString());
        }
        
    }
    
}
