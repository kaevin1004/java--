package 문제풀이복습.st객체배열;

import java.util.Scanner;

public class EmployeeTestArray {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("사원 수 : ");
        int x = key.nextInt();
        
        Employee[] a = new Employee[x];
        
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            a[i] = new Employee();
            
            System.out.print("이름 : ");
            String b = key.next();
            
            System.out.print("주소 : ");
            String c = key.next();
            
            System.out.print("급여 : ");
            int d = key.nextInt();
            
            System.out.print("주민번호 : ");
            String e = key.next();
            
            
            a[i].setName(b);
            a[i].setAddress(c);
            a[i].setSalary(d);
            a[i].setRrn(e);
            
        }
        
        System.out.println();
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.println(a[i].toString());
        }
    }
    
    
}
