package di01.reflaction;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

import di01.model.Employee;

public class TestEmployee {
    
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        di01.model.Employee emp1 = new di01.model.Employee();
        
        emp1.setName("emp1 name");
        emp1.setAddress("emp1 address");
        emp1.setSalary(1000);
        emp1.setRrn("emp1 rrn");
        
        assertEquals("emp1 address", emp1.getAddress());
        
        Employee emp2 = new di01.model.Employee("emp2 name", "emp2 address",
                1000, "emp2 rrn");
    }
    
    @Test
    public void test_Make_instance_with_new() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
       
        // reflection을 이용해서 인스턴스 만들기
        // reflection으로 new di01.model.Employee("emp2 name", "emp2 address",
        //1000, "emp2 rrn");
        Class klass = Class.forName("di01.model.Employee");
        
        //생성자 메서드의 매개변수 타입 선언
        Class [] paramTypes = {String.class, String.class, int.class, String.class};
        
        // 매개변수 값 설정
        Object [] objs = {"emp2 name", "emp2 address", 1000, "emp2 rrn"};
        
        //생성자 함수 가져오기.
        java.lang.reflect.Constructor cons = klass.getConstructor(paramTypes);
        
        // 인스턴스 만들기.
        Object instance = cons.newInstance(objs);
        
        // 실행결과
        System.out.println(instance.toString());
        
        assertEquals("emp2 address", ((di01.model.Employee)instance).getAddress());
        
        // setter를 이용하여 필드 값 바꾸기
        
        java.lang.reflect.Method m = klass.getMethod("setName", String.class);
        
        // 매개변수 값 설정
        Object [] params = {"hello"};
        
        // 메서드 호출
        m.invoke(instance, params); // Employee.setName("hello"); 가 실행된다.
        
        // setter 를 이용하여 필드 값 가져오기.
        
        m = klass.getMethod("getName");
        Object result = m.invoke(instance);
        
        assertEquals("hello", result);
        
    }
    
}
