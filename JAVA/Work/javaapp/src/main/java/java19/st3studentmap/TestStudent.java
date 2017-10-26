package java19.st3studentmap;

import java.util.HashMap;
import java.util.Map;

public class TestStudent {
    
    public static void main(String[] args){
        // HashMap 인스턴스 생성
        
        Map<Integer, Student> map = new HashMap<Integer, Student>();
        
        // Map에 추가
        // key      --> ( 이름    학번 )
        // 170101   --> new Student (170101, "구준표")
        // 170102   --> new Student (170102, "금잔디")
        // 170103   --> new Student (170103, "윤지후")
        
        map.put(170101, new Student(170101, "구준표"));
        map.put(170102, new Student(170102, "금잔디"));
        map.put(170103, new Student(170103, "윤지후"));
        
        
        // entrySet, for-each map 에 항목 출력
        
        System.out.println("학생 목록 출력 >> "+ " ");
        
        for (Map.Entry<Integer, Student> e : map.entrySet()) {
            
            System.out.println(e.getKey()+":"+ e.getValue()+". ");
            
        }
        System.out.println();
        
        
        
        
        
        // 학번 170102 를 삭제.
        map.remove(170102);
        
        aakkkkk(map);
        
        // 윤지후 이름이 "윤후"로 개명.
        // 1. 새로운 인스턴, new Student(170103, "윤후")를 만들고 put. 새로운 메모리 지정.
        // 2. 기존 값을 변경.
        
        Integer key = 0;
        
         for(Student s : map.values()){
             
             if(s.getName().equals("윤지후") ){
                 
                 key = s.getNumber();
                 break;
             }
             
         }
        map.put(key, new Student(170103, "윤후"));
        
        aakkkkk(map);
        
    }

    private static void aakkkkk(Map<Integer, Student> map) {
        System.out.println("학생 목록 출력 >> "+ " ");
        
        for(Map.Entry<Integer, Student> a : map.entrySet()){
            
            int no = a.getValue().getNumber();
            String name = a.getValue().getName();
            System.out.println(no+"   "+ name);
        }
        System.out.println();
    }
    
}
