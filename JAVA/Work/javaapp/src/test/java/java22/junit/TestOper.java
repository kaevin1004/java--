package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java11.st2.oper;

public class TestOper {
    
    private static Oper op = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        op = new Oper(3, 5);
    }
    
    @Test
    public void testAdd() {
        
        int rs = op.add();
        
        assertEquals(8, rs);
        assertNotEquals(7, rs);
        
        assertTrue(8 == rs);
        assertFalse(7 == rs);
        
    }
    
    @Test
    public void testMinus() {
        
        int rs = op.minus();
        
        assertEquals(-2, rs);
        assertNotEquals(0, rs);
        
        assertTrue(-2 == rs);
        assertFalse(0 == rs);
    }
    
    @Test
    public void testMul() {
        
        int rs = op.mul();
        
        assertEquals(15, rs);
        assertNotEquals(12, rs);
        
        assertTrue(15 == rs);
        assertFalse(12 == rs);
        
        
    }
    
    @Test
    public void testDiv() {
        
        double rs = op.div();
        
        assertEquals(0.6, rs, 0.1);
        assertNotEquals(0.4, rs, 0.1);
        
        assertTrue(0.6 == rs);
        assertFalse(0.5 == rs);
    }
    
}
