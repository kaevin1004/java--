package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyUnit1 {
    
    private static MyUnit myUnit = null; 
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        myUnit = new MyUnit();
        
    }
    
    @Test
    public void testConcate() {
        
        String rs = myUnit.concate("사랑", "해용♥");
        
        assertEquals("사랑해용♥", rs);
        
    }
    
    @Test
    public void testGetBoolean() {
        
        boolean rs = myUnit.getboolean();
        
        assertFalse(rs);
        assertEquals(rs, false);
        assertSame(rs, false);
        
    }
    
    @Test
    public void testGetSameObject() {
        
        Object rs = myUnit.getSameObject();
        
        assertNull(rs);
        assertEquals(rs, null);
        assertSame(rs, null);
    }
    
    @Test
    public void testGetObject() {
        
        Object rs = myUnit.getObject();
        
        assertNull(rs);
        assertEquals(rs, null);
        assertSame(rs, null);
        
        
    }
    
    @Test
    public void testGetStringArray() {
        
        String[] a = myUnit.getStringArray();
        String[] b = {"one", "two", "three"};
        
        assertArrayEquals(a, b);
        
    }
    
    @Test(expected = ArithmeticException.class)
    public void testGetException() {
        
        double rs = myUnit.getException();
        
        
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        
        ArrayList<String> rs = myUnit.getEmptyList();
        
        rs.get(0);
    }
    
}
