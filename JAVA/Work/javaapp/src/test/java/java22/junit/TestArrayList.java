package java22.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {
    
    private static List<String> emplist = null;
    
    
    
    @BeforeClass
    public static void setUpclass(){
        
        emplist = new ArrayList<String>();
        
        emplist.add("0");
        emplist.add("2");
        emplist.add("1");
        emplist.add("3");
        emplist.add("4");
        
    }
    
    
   
    @Test
    public void test() {
        
        assertNotNull(emplist);
        
    }
    
    @Test
    public void test2() {
        
        assertSame(emplist.size(), 5);
        assertEquals(5, emplist.size());
        
    }
    
    @Test
    public void test3() {
        
        int a = emplist.indexOf("10");
        assertEquals(-1, a);
        
        boolean b = emplist.contains("10");
        assertEquals(false, b);
        assertFalse(b);
        
    }
    
    @Test
    public void test4() {
        
        String name1[] = {"y2kpooh","hwang"};
        String name2[] = {"y2kpooh","hwang"};
        
        assertArrayEquals(name1, name2);
        
    }
      
}
