package java22.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java22junit.Rect;

public class TestRect {
    private static Rect a = null;
    @BeforeClass
    public static void setupBeforeClass() throws Exception{
        
        System.out.println("setupBeforeClass");
        
        a = new Rect();
        a.setWidth(2);
        a.setHeight(30);
        
    }
    
    
    @Before
    public void setup() throws Exception{
        
        System.out.println("setup");
    }
    
    
    @Test
    public void test_area(){
        
        
        int x = a.area();
        assertEquals(60, x);
        
        
        
    }
    
    @Test
    public void test_perimeter(){
        
        
        int y = a.perimeter();
        
        assertEquals(64, y);
         
    }
    
    @Test
    public void test_assertTrue(){
        
        
        int x = a.area();
        assertTrue(60 == x);
    }
    
    @Test
    public void test_assertfalse(){
        
        
        int x = a.area();
        assertTrue(80 == x);
    }
    
    @Test
    public void test_type(){
        
        Object o = a.type();
        
        assertNull(o);
        
    }

    
    
}
