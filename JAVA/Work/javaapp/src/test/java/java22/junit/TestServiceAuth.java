package java22.junit;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.ModelAuth;
import java23.jdbc.ServiceAuth;

public class TestServiceAuth {
    
    private static ServiceAuth sra = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        sra = new ServiceAuth();
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        
        ModelAuth auth = null;
        int rs = sra.getCount(auth);
        
        assertEquals(3, rs);
         
    }
    
    @Test
    public void testGetMaxAuthid() throws SQLException {
        
        int rs = sra.getMaxAuthid();
        
        assertEquals(7, rs);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
        ResultSet rs = sra.selectAll();
        
        rs.next();
        
        String name = rs.getString("name");
        
        assertEquals("bob", name);
        
        
        
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("bo");
        
        java.sql.ResultSet rs = sra.selectLike(auth);
        
        assertNotNull(rs);

        rs.next();
        
        String re = rs.getString("name");
        
        assertEquals("bob", re);
        
        assertTrue(re.contains("bo"));
        assertTrue(re.contains(auth.getName()));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setName("kim");
        
        ResultSet rs = sra.selectEqual(auth);
        
        assertNotNull(rs);
        
        rs.next();
        
        String name = rs.getString("name");
        
        assertEquals("kim", name);
        
        assertEquals(auth.getName(), name);
        
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        
        ModelAuth auth = new ModelAuth();
        //첫번째 검증. select * from auth where 1 = 1
        //      select count(*) from auth where 1 = 1
        auth.setAuthid(null);
        auth.setName("");
        auth.setBirth("");
        
        ResultSet rs = sra.selectDynamic(auth);
        
        assertNotNull(rs);
        rs.last();
        int row = rs.getRow();
        assertEquals(sra.getCount(auth), row);
        
        //두번째 검증 select * from auth where 1 = 1 and authid =1;
        
        auth.setAuthid(1);
        auth.setName("");
        auth.setBirth("");
        
        rs = sra.selectDynamic(auth);
        
        assertNotNull(rs);
        
        rs.next();
        
        int authid = rs.getInt("authid");
        
        String name = rs.getString("name");
        
        assertEquals(1, authid);
        assertSame(auth.getAuthid(), authid);
        
        assertEquals("bob", name);
        
        //세번째 검증 select * from auth where 1 = 1 and name = 'bob';
        
        auth.setAuthid(null);
        auth.setName("bob");
        
        
        rs = sra.selectDynamic(auth);
        
        assertNotNull(rs);
        
        rs.next();
        
        authid = rs.getInt("authid");
        name = rs.getString("name");
       
        
        assertEquals(1, authid);
        assertEquals("bob", name);
        
        //네번째 검증 select * from book where 1 = 1 and bookid = 2 and bookname = 'mysql';
        
        
        
    }
    
    @Test
    public void testInsertAuth() throws SQLException {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setAuthid(4);
        auth.setName("I KILL YOU");
        auth.setBirth("1900.01.01");
        
        int rs = sra.insertAuth(auth);
        
        assertTrue(rs >= 0);
        
       
    }
    
    @Test
    public void testUpdateAuth() throws SQLException {
        
        ModelAuth whereauth = new ModelAuth();
        
        ModelAuth setauth = new ModelAuth();
        
        whereauth.setAuthid(4);
        setauth.setName("I HATE YOIU");
        setauth.setBirth("2017.11.15");
        
        int rs = sra.updateAuth(whereauth, setauth);
        
        assertTrue(rs>=0);
    }
    
    @Test
    public void testDeleteAuth() throws SQLException {
        
        ModelAuth auth = new ModelAuth();
        
        auth.setAuthid(4);
        
        int rs = sra.deleteAuth(auth);
        
        assertTrue(rs>=0);
        
        
        
    }
    
}
