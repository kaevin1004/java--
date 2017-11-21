package java24.mybatis;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybais.svr.ServiceBook;
import net.sf.log4jdbc.CallableStatementSpy;

public class TestServiceBook {
    
    private static ServiceBook service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        //classpath를 이용한 설정 파일 로딩
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        
        //file을 이용한 설정 파일 로딩
        //ApplicationContext context = new
                //ClassPathXmlApplicationContext("file:src/main/resources/ApplicationContext.xml");
        
        //ID를 이용한 servicebook 인스턴스 생성
        service = context.getBean("servicebook", ServiceBook.class);
    }
    
    @Test
    public void testGetCount() {
        
        
        
    }
    
    @Test
    public void testGetMaxBookid() {
        
        
        
    }
    
    @Test
    public void testSelectAll() {
        
        
        
    }
    
    @Test
    public void testSelectLike() {
        
        
        
    }
    
    @Test
    public void testSelectEqual() {
        
        
        
    }
    
    @Test
    public void testInsert() {
        
        
        
    }
    
    @Test
    public void testInsertMap() {
        
        
        
    }
    
    @Test
    public void testUpdate() {
        
        
        
    }
    
    @Test
    public void testDelete() {
        
        
        
    }
    
    @Test
    public void testSelectDynamic() {
        
        
        
    }
    
}
