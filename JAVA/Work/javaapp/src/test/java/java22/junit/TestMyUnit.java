package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMyUnit {
    
    private static MyUnit myUnit = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        myUnit = new MyUnit();
    }
   
    @Test
    public void testconcate() {
        String result = myUnit.concate("ab", "12");
        assertEquals("ab12", result);
    }
    

    @Test
    public void testgetboolean() {
        
        boolean a = myUnit.getboolean();
        assertFalse(a);
        assertEquals(a, false);
        assertSame(a, false);
        
    }
    
    @Test
    public void testgetSameObject() {
        
        Object a = myUnit.getSameObject();
        assertNull(a);
        assertEquals(null, a);
        assertSame(null, a);
        
    }
    
    @Test
    public void testgetObject() {
        
        Object a = myUnit.getObject();
        assertNull(a);
        
    }
    
    @Test
    public void testgetStringArray() {
        
        String[] a = myUnit.getStringArray();
        String[] s = {"one", "two", "three"};
        assertArrayEquals(s, a);
        
    }
    
    @Ignore // 생략한다.
    @Test(expected = ArithmeticException.class)
    public void testgetException(){  
        
        double a = myUnit.getException();  // ArithmeticException
        
    }
    
    @Ignore //생략한다.
    @Test(expected = IndexOutOfBoundsException.class)
    public void testgetEmptyList(){ 
        
        ArrayList<String> a = myUnit.getEmptyList();
        
        a.get(0);
        
    }
}
