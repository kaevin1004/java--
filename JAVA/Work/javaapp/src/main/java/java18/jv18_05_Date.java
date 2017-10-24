package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class jv18_05_Date {
    
    
    public static void main(String[] args){
        
        
        SimpleDateFormat a =null;
        Date b = new Date();  
        //Date b = 날짜와 시간이 저장되어 있는 클래스
        
        //현재 날짜와 시간 출력
        System.out.println(b);
       
        
        
        //현재 연도만 출력
        System.out.println(b.getYear());//117(1900년 기준)
        
        //2017로 출력하는 방법
        a = new SimpleDateFormat("yyyy");
        System.out.println(a.format(b));
        
        //현재 월만 출력
        a = new SimpleDateFormat("MM");
        System.out.println(a.format(b));
        
        //현재 시간만 출력
        a = new SimpleDateFormat("HH");
        System.out.println(a.format(b));
        
        //현재 분만 출력
        a = new SimpleDateFormat("mm");
        System.out.println(a.format(b));
        
        //현재 초만 출력
        a = new SimpleDateFormat("ss");
        System.out.println(a.format(b));
        
        
        
        
        //날자는 "yyyy-MM-dd" 형태로 출력하시오
        
        
        //시간은 "HH:mm:ss" 형태로 출력하시오
        
        
        //현재에 +3년, -4월, +2일 더해서 출력하시오
        a = new SimpleDateFormat("yyyy");
        System.out.println(a.format(b));
        
        b.setYear(b.getYear()+3);
        b.setMonth(b.getMonth()-4);
        b.setDate(b.getDate()+2);
        
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String z = s.format(b);
        System.out.println(z);
        
        
        
        //현재에 +4시간, -30분, +10초 더해서 출력하시오.
        b.setHours(b.getHours()+4);
        b.setMinutes(b.getMinutes()-30);
        b.setSeconds(b.getSeconds()+10);
        
        SimpleDateFormat x = new SimpleDateFormat("HH:mm:ss a");
        String n = x.format(b);
        System.out.println(n);
        
        
        
    }
    
}
