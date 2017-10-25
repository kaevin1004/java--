package java18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class jv_18_09_LocalDateTime {
    
    public static void main(String[] args){
        
        
        //현재 날짜
        LocalDate today = LocalDate.now();
        
        //현재 연도만 출력
        System.out.println(today.get(ChronoField.YEAR));
        
        //현재 월만 출력
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR));//이번해의 달
        
        //현재 일만 출력
        System.out.println(today.get(ChronoField.DAY_OF_MONTH));//이번달의 일
        
        
        LocalTime curtime = LocalTime.now();
        
        //현재 시간만 출력
        System.out.println(curtime.get(ChronoField.HOUR_OF_DAY));
        
        //현재 분만 출력
        System.out.println(curtime.get(ChronoField.MINUTE_OF_HOUR));
        
        //현재 초만 출력
        System.out.println(curtime.get(ChronoField.SECOND_OF_MINUTE));
        
        
        //현재 +3년, -4월, +2일, +4시간, -30분, +10초 더해서
        //"yyyy-MM-dd HH:mm:ss" 형태로 출력하시오
        
        LocalDateTime s = LocalDateTime.now();
        
        //현재 +3년, -4월, +2일, +4시간, -30분, +10초 더해서
        //"yyyy-MM-dd HH:mm:ss" 형태로 출력하시오
        s = s.plusYears(+3);
        s = s.plusMonths(-4);
        s = s.plusDays(+2);
        s = s.plusHours(+4);
        s = s.plusMinutes(-30);
        s = s.plusSeconds(+10);
        
       
        String a = s.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        System.out.println(a);
        
        
        System.out.println(s.toString());
        
        LocalDateTime s2 = LocalDateTime.now();
        
        //현재 +3년, -4월, +2일, +4시간, -30분, +10초 더해서
        //"yyyy-MM-dd HH:mm:ss" 형태로 출력하시오
        
        s2 = s2.plus(+3, ChronoUnit.YEARS);
        s2 = s2.plus(-4, ChronoUnit.MONTHS);
        s2 = s2.plus(+2, ChronoUnit.DAYS);
        s2 = s2.plus(+4, ChronoUnit.HOURS);
        s2 = s2.plus(-30, ChronoUnit.MINUTES);
        s2 = s2.plus(+10, ChronoUnit.SECONDS);
        
        String x = s2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        
        System.out.println(x);
        
        
        System.out.println(s2.toString());
        
        
        
    }
    
}
