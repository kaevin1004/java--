package java15.st2enumeration;

import java.util.Scanner;

public class PhoneHeaderTest {
    
    public static void main(String[] args){
        //키보드 입력받는다.
        Scanner key = new Scanner(System.in);
        
        System.out.print("번호 : "+" ");
        String phone = key.next();
        //입력받은 폰번호에서 앞으로부터 3자리 추출
        String header = phone.substring(0,3);
        
        System.out.println(header);
        
                
        if(header.equals(PhoneHeaderClass.P010)){
         
            System.out.println("general");
        }
        else if(header.equals(PhoneHeaderClass.P011)){
            System.out.println("SKT");
        }
        else if(header.equals(PhoneHeaderClass.P016)){
            System.out.println("KT");
        }
        else if(header.equals(PhoneHeaderClass.P019)){
            System.out.println("LG");
        }
        else{
            System.out.println("통신사가 아니다.");
        }
        System.out.println();
      //---------------------------------------------------------------------//   
       
        //enum은 String getvalue 메서드의 return 값을 받아야 한다.
        
        // 클래스.번호.getvalue
        
        if(header.equals(PhoneHeaderEnum.P010.getvalue())){
            System.out.println("general");
        }
        else if(header.equals(PhoneHeaderEnum.P011.getvalue())){
            System.out.println("SKT");
        }
        else if(header.equals(PhoneHeaderEnum.P016.getvalue())){
            System.out.println("KT");
        }
        else if(header.equals(PhoneHeaderEnum.P019.getvalue())){
            System.out.println("LG");
        }
        else{
            System.out.println("통신사 없따~");
        }
        System.out.println();
    }
    
    //---------------------------------------------------------------------//
}
