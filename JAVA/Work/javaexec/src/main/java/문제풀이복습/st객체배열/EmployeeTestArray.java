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
            a[i].setName(key.next());
            
            System.out.print("주소 : ");
            a[i].setAddress(key.next());
            
            System.out.print("급여 : ");
            a[i].setSalary(key.nextInt());
            
            System.out.print("주민번호 : ");
            a[i].setRrn(key.next());
            
            
        }
        
        System.out.println();
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.println(a[i].toString());
        }
    }
    
    
}
