package 문제풀이복습.st3Semp;

import java.util.Scanner;

public class EmployeeTestArray extends Employee{
    
    public static void main(String[] args){
        
        
        Scanner key = new Scanner(System.in);
        System.out.print("사원 수:"+" ");
        int b = key.nextInt();
        
        Employee[] a = new Employee[b];
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            a[i] = new Employee();
            
            System.out.print("name : ");
            String c=key.next();
            
            System.out.print("address : ");
            String d=key.next();
            
            System.out.print("salary : ");
            int e=key.nextInt();
            
            System.out.print("rrn : ");
            String f=key.next();
            
            a[i].setName(c);
            a[i].setAddress(d);
            a[i].setSalary(e);
            a[i].setRrn(f);
            
        }
        System.out.println();
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.print("이름 :"+a[i].getName());
            System.out.print("주소 :"+a[i].getAddress());
            System.out.print("월급 :"+a[i].getSalary());
            System.out.print("주민번호 :"+a[i].getRrn());
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println(a[i].toString());
        }
        
        
        
    }
    
}
