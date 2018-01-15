package com.spring65.phone;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring65.phone.inf.IServicePhone;
import com.spring65.phone.model.ModelPhone;

public class TestServicePhone {
    
    private static ClassPathXmlApplicationContext context;
    private static IServicePhone service;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        context= new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        service=context.getBean("svrphone",IServicePhone.class);
    }    
    
    @Test
    public void testGetPhoneOne() {
        
        ModelPhone rs = service.getPhoneOne("name1");
        
        assertNotNull(rs);
        assertEquals("name1", rs.getName());
    }
    
    @Test
    public void testGetPhoneList() {
        List<ModelPhone> rs = service.getPhoneList();
        
        assertNotNull(rs);
        assertTrue(rs.size() > 0);
    }
    
    @Test
    public void testInsertPhone() {
        
        ModelPhone phone = new ModelPhone("name1", "manu1", 1000);
        int rs = service.insertPhone(phone);
        assertEquals(1, rs);
    }
    
    @Test
    public void testInsertPhoneList() {
        
        List<ModelPhone> phones = new ArrayList<ModelPhone>();
        
        phones.add(new ModelPhone("name2", "manu2", 2000));
        phones.add(new ModelPhone("name3", "manu3", 3000));
        phones.add(new ModelPhone("name4", "manu4", 4000));
        phones.add(new ModelPhone("name5", "manu5", 5000));
        
        int rs = service.insertPhoneList(phones);
        
        assertEquals(4, rs);       
        
    }
}
