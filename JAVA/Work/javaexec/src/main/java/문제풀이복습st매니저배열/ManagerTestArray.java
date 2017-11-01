package 문제풀이복습st매니저배열;

import java.util.Scanner;

public class ManagerTestArray {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        System.out.print("사원 수 : ");
        int b = key.nextInt();
        
        
        Manager[] a = new Manager[b];
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            a[i] = new Manager();
            System.out.print("이름 :");
            a[i].setName(key.next());
            System.out.print("주소 :");
            a[i].setAddress(key.next());
            System.out.print("월급 :");
            a[i].setSalary(key.nextInt());
            System.out.print("주민번호 :");
            a[i].setRrn(key.next());
            System.out.print("보너스 :");
            a[i].setBouns(key.nextInt());
            
        }
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.println(a[i].toString());
      
        }
         
       
    }
    
}
