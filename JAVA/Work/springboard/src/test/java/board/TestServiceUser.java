package board;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import board.inf.IServiceUser;
import board.model.ModelUser;
import board.service.ServiceUser;


public class TestServiceUser {
    
    private static IServiceUser service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
       
        service = context.getBean("serviceuser", ServiceUser.class);
        
    }
    
    @Test
    public void testInsertUser() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setUserid("1");
        user.setPasswd("1234");
        user.setName("길동이");
                
        int rs = service.insertUser(user);
        
        assertEquals(6, rs);
        
    }
    
    @Test
    public void testLogin() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setPasswd("1234");
        user.setUserid("3");
        
        List<ModelUser> rs = service.login(user);
        
        assertNotNull(rs);
       
        ModelUser m = rs.get(0);
        
        assertSame(3, m.getUserid());
        assertEquals("1234", m.getPasswd());
        
        
        
        
    }
    
    @Test
    public void testLogout() throws Exception {
        
        String user = "";
        
        int rs = service.logout(user);
        
        assertEquals("홍길동", rs);
        
        
        
    }
    
    @Test
    public void testUpdateUserInfo() throws Exception {
        
        ModelUser searchValue = new ModelUser();
        
        searchValue.setUserid("3");
        
        ModelUser updateValue = new ModelUser();
        
        updateValue.setName("김봉삼");
        updateValue.setUserid("2");
        updateValue.setPasswd("4321");
        
        int rs = service.updateUserInfo(updateValue, searchValue);
        
        assertTrue(rs >= 0);
        
    }
    
    @Test
    public void testUpdatePasswd() {
        
        
        
    }
    
    @Test
    public void testDeleteUser() {
        
        
        
    }
    
    @Test
    public void testSelectUserOne() {
        
        
        
    }
    
    @Test
    public void testSelectUserList() {
        
        
        
    }
    
    @Test
    public void testCheckuserid() {
        
        
        
    }
    
}
