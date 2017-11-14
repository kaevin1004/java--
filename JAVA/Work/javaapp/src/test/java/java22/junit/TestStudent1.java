package java22.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent1 {
    
    static Student st = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        st = new Student();
    }
    
    @Test
    public void test() {
        
        st.getgrade(100);
        st.getgrade(99);
        st.getgrade(90);
        st.getgrade(89);
        st.getgrade(80);
        
        assertEquals("A", st.getgrade(100));
        assertEquals("A", st.getgrade(99));
        assertEquals("A", st.getgrade(90));
        
        assertEquals("B", st.getgrade(89));
        assertEquals("B", st.getgrade(80));
        
        assertEquals("C", st.getgrade(79));
        assertEquals("C", st.getgrade(70));
        
        assertEquals("D", st.getgrade(69));
        assertEquals("D", st.getgrade(60));
        
        assertEquals("F", st.getgrade(59));
        
        
    }
    
}
