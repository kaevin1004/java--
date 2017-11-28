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
        
        user.setUserid("99");
        user.setPasswd("12345");
        user.setName("abcd");
                
        int rs = service.insertUser(user);
        
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testLogin() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setPasswd("12345");
        user.setUserid("99");
        
        List<ModelUser> rs = service.login(user);
        
        assertTrue(rs.size() == 1);
        System.out.println(rs);
        
        ModelUser re = rs.get(0);
        
        assertEquals("abcd", re.getName());
        assertSame(6, re.getUserno());
        
    }
    
    @Test
    public void testLogout() throws Exception {
        
        
        
        
    }
    
    @Test
    public void testUpdateUserInfo() throws Exception {
        
        ModelUser searchValue = new ModelUser();
        
        searchValue.setUserid("99");
        
        ModelUser updateValue = new ModelUser();
        
        updateValue.setName("멍정이");
        updateValue.setPasswd("4313");
        
        int rs = service.updateUserInfo(updateValue, searchValue);
        
        assertTrue(rs>=0);
        
        
    }
    
    @Test
    public void testUpdatePasswd() throws Exception {
        
        int result = service.updatePasswd("4555", "2344", "99");
        
        assertTrue(result >= 0);
        
    }
    
    @Test
    public void testDeleteUser() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setUserid("99");
        
        int rs = service.deleteUser(user);
        
        assertTrue(rs>=0);
        
    }
    
    @Test
    public void testSelectUserOne() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setUserno(6);
        
        ModelUser rs = service.selectUserOne(user);
        
        System.out.println(rs);
        
        assertNotNull(rs);
        
    }
    
    @Test
    public void testSelectUserList() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setName("멍정이");

        List<ModelUser> rs = null;
        
        rs = service.selectUserList(user);
        
        assertNotNull(rs);
        System.out.println(rs);
        
    }
    
    @Test
    public void testCheckuserid() {
        
        
        
    }
    
}
