package java02;

public class jv02_24_형변환 {
    
   public static void main(String[] args) {
       
       int result = 1+'2';             //변환가능(정수 문자 실수 사이에만 형변환 가능
       System.out.println(result);
       
     //변환불능int result = '2'+true;
       result = '2'+((true)? 1:0);
       System.out.println(result);
       
     //변환불능int result = "15"-5;  
       result = Integer.parseInt("15")-5;
       System.out.println(result);
       
     //변환불능int result = "1"+'2';  
       result = Integer.parseInt("1")+'2';
       System.out.println(result);
       
     //변환불능int result = false + true;    
       result = ((false)? 1:0) + ((true)? 0:1);
       System.out.println(result);
   }
    
}
