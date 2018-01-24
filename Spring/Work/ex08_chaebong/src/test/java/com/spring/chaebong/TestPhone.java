package com.spring.chaebong;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestPhone {
    private static IServicePhone service;
    
    
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service = context.getBean(IServicePhone.class);
    }
    
    @Test
    public void testGetPhoneOne() {
       
        ModelPhone rs = service.getPhoneOne("name");
        
        assertNotNull(rs);
        
        assertEquals("name", rs.getName());
    }
    
    @Test
    public void testGetPhoneList() {
        
        List<ModelPhone> rs = service.getPhoneList(1, 20);
        
        assertNotNull(rs);
        
        assertEquals("name", rs.get(0).getName());
        
    }
    
    @Test
    public void testInsertPhone() {
        
        ModelPhone phone = new ModelPhone();
        phone.setName("test");
        phone.setManufacturer("test");
        phone.setPrice(10);
        
        int rs = service.insertPhone(phone);
        
        assertTrue(rs == 1);
        
    }
}
