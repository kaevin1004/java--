package java20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class User {
    private String  name;
    private Integer number;
    private Boolean ischeck;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getNumber() {
        return number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public Boolean getIscheck() {
        return ischeck;
    }
    
    public void setIscheck(Boolean ischeck) {
        this.ischeck = ischeck;
    }
    
    @Override
    public String toString() {
        return "User [name=" + name + ", number=" + number + ", ischeck="
                + ischeck + "]";
    }
    
    public User() {
        super();
    }
    
    public User(String name, Integer number, Boolean ischeck) {
        super();
        this.name = name;
        this.number = number;
        this.ischeck = ischeck;
    }
    
    public static class MyPredicateContains implements Predicate {
        
        private String fieldName;
        private Object exptected;
        
        public MyPredicateContains(String fieldName, Object exptected) {
            this.fieldName = fieldName;
            this.exptected = exptected;
        }

        @Override
        public boolean evaluate(Object object) {
            
            if(fieldName.equals("name")){
                
                return ((User)object).getName().contains(exptected.toString());
            }
            else if(fieldName.equals("number")){
                
                return ((User)object).getNumber().equals(exptected);
            }
            else if(fieldName.equals("ischeck")){
                
                return ((User)object).getIscheck().equals(exptected);
            }
            
            return false;
        }
        
        
    }
    
}

public class jv20_15_Search_Predicate_vs_Lamda {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @SuppressWarnings("unchecked")
    public static void main(String [] args){
        
        List<User> users = new ArrayList<User>();
        users.add(new User("User Name A", 1, true));
        users.add(new User("User Name B", 2, false));
        users.add(new User("Other User", 3, true));
        
        for(User user : users){
            
            System.out.println(user);
            
        }
        System.out.println();
        
        
        //Lamda를 이용한 searching : lamda는 java 8부터 지원
        //equal searching
        List<User> rs = users.stream().filter(e->e.getName().equals("User Name B")).collect(Collectors.toList());
        System.out.println("Eqauls Searching");
        
        for(User user : rs){
            
            System.out.println(user);
            
        }
        System.out.println();
        
        //contains searching
        rs = users.stream().filter(e->e.getName().contains("Na")).collect(Collectors.toList());
        System.out.println("Contains Searching");
        for(User user : rs){
            
            System.out.println(user);
            
        }
        System.out.println();
        
        //Predicate를 이용한 searching
        //Predicate를 사용하기 위해서는 build.gradle에
        //compile ' commons-collections:commons-collections:3.2'을
        //추가해야한다
        //User.MyOredicateContains 인스턴스 만들기
        //CollectionUtils.select() 실행
        //프린트
        
        Predicate predicate = new User.MyPredicateContains("name", "Other");
        
        rs = (List<User>) CollectionUtils.select(users, predicate);
        
        for(User user : users){
            
            System.out.println(user);
        }
        System.out.println();
    }
    
}
