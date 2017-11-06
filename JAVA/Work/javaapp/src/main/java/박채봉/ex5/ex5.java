package 박채봉.ex5;

import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args){
        
        Scanner key = new Scanner(System.in);
        
        Manager[] a = new Manager[3];
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            a[i] = new Manager();
            
            
            System.out.print("이름 : ");
            a[i].setName(key.next());
            
            System.out.print("주소 : ");
            a[i].setAddr(key.next());
            
            System.out.print("급여 : ");
            a[i].setSalary(key.nextInt());
            
            System.out.print("주민번호 : ");
            a[i].setRrn(key.next());
            
            System.out.print("보너스 : ");
            a[i].setBonus(key.nextInt());
              
        }
        
        for(int i=0; i<=a.length-1; i=i+1){
            
            System.out.println(a[i].toString());
        }
        
    }
    
}
