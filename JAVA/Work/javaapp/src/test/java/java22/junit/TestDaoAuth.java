package java22.junit;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.DaoAuth;
import java23.jdbc.ModelAuth;





public class TestDaoAuth {
    
    private static DaoAuth dao = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        
        
        ModelAuth model = new ModelAuth();
        
        int result = dao.getCount(model);
        
        assertEquals(3, result);
        
        
    }
    
    @Test
    public void testGetMaxAuthid() throws SQLException {
        
        
        
        
        int a = dao.getMaxAuthid();
        
        assertEquals(7, a);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
             
        java.sql.ResultSet a = dao.selectAll();
        a.next();
        int authid = a.getInt("authid");
        
        assertEquals(1, authid);
        
        String name = a.getString("name");
        
        assertEquals("bob", name);
        
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        
                
        ModelAuth auth = new ModelAuth();
        
        auth.setName("bo");
        
        java.sql.ResultSet rs = dao.selectLike(auth);
        
        assertNotNull(rs);
        
        rs.next();
        
        String name = rs.getString("name");
        assertTrue(name.contains("bo"));
        assertTrue(name.contains(auth.getName()));
        
    }
    
    @Test
    public void testSelectEqual() {
        
        
        
    }
    
    @Test
    public void testSelectDynamic() {
        
        
        
    }
    
    @Test
    public void testInsertAuth() {
        
        
       
    }
    
    @Test
    public void testUpdateAuth() {
        
        
        
    }
    
    @Test
    public void testDeleteAuth() {
        
        
        
    }
    
}
