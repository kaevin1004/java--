package java03;

import java.util.Scanner;

public class jv03_04_중첩ifelse 
{
    public static void main(String[] args) 
    {
        
        
    int n = 0;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("점수를 입력하시오");
    
    n = keyboard.nextInt();
    
    if (n >=90) 
    {
        System.out.println("학점:A");
    }
    else if (n >=80) 
    {
        System.out.println("학점:B");
    }
    else if (n >=70)
    {
        System.out.println("학점:C");
    }
    else  if (n >=60)
    {
        System.out.println("학점:D");
    }
    else
    {
        System.out.println("F");
    }
     
    }
}