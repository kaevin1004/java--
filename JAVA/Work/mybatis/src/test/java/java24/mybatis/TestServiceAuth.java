package java24.mybatis;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;
import net.sf.log4jdbc.CallableStatementSpy;

public class TestServiceAuth {
    
    private static IServiceAuth service = null;
    
    
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
       
        service = context.getBean("serviceauth", ServiceAuth.class);
        
    }
    
    @Test
    public void testGetCount() throws Exception {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("bob");
        auth.setBirth(null);
        
        int rs = service.getCount(auth);
        
        assertEquals(1, rs);
        
        auth.setName("");
        auth.setBirth("2000.05.01");
        
        rs = service.getCount(auth);
        assertEquals(1, rs);
        
    }
    
    @Test
    public void testGetMaxAuthid() throws Exception {
        
        ModelAuth auth = new ModelAuth();
        
        int rs = service.getMaxAuthid();
        
        assertEquals(7, rs);
        
    }
    
    @Test
    public void testSelectAll() throws Exception {
        
        ModelAuth auth = new ModelAuth();
        
        List<ModelAuth> rs = service.selectAll(auth);
        
        //인스턴스 검증
        assertNotNull(rs);
        
        //값으로 검증
        ModelAuth m = rs.get(0);
        
        assertSame(1, m.getAuthid());
        
        assertEquals("bob", m.getName());
        
        //갯수로 검증
        
        int count = service.getCount(auth);
        
        assertEquals(count, rs.size());
        
    }
    
    @Test
    public void testSelectLike() throws Exception{
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("%o%");
        List<ModelAuth> rs = service.selectLike(auth);
        
        //인스턴스 검증
        assertNotNull(rs);
        
        //값으로 검증
        ModelAuth m = rs.get(0);
        
        assertSame(1, m.getAuthid());
        assertEquals("bob", m.getName());
        
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("kim");
        
        List<ModelAuth> rs = service.selectEqual(auth);
        
        assertNotNull(rs);
        
        ModelAuth m = rs.get(0);
        
        assertSame(2, m.getAuthid());
        assertEquals("1980.05.01", m.getBirth());
        
    }
    
    @Test
    public void testInsertAuth() throws Exception {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("name");
        auth.setBirth("2017.11.24");
        auth.setAuthid(4);
        
        int rs = service.insertAuth(auth);
        
        assertEquals(4, rs);
        
    }
    
    @Test
    public void testUpdateAuth() throws Exception {
        
        ModelAuth whereauth = new ModelAuth();
        
        whereauth.setName("메롱");
        
        ModelAuth setauth = new ModelAuth();
        
        setauth.setName("바보");
        setauth.setBirth("2000.11.24");
        setauth.setAuthid(4);
        
        int a = service.updateAuth(whereauth, setauth);
        System.out.println(a);
        
        assertTrue(a>=0);
                
        
    }
    
    @Test
    public void testDeleteAuth() throws Exception {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("바보");
        
        int a = service.deleteAuth(auth);
        
        assertTrue(a>=0);
        
    }
    
}
