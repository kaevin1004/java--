package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.ServiceAuth;

public class TestServiceAuth {
    
    private static ServiceAuth sra = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        sra = new ServiceAuth();
        
    }
    
    @Test
    public void testGetCount() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testGetMaxAuthid() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectAll() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectLike() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectEqual() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectDynamic() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertAuth() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateAuth() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteAuth() {
        fail("Not yet implemented");
    }
    
}
