package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper2 {
    
    
    @Test
    public void test_add() {
       
        Oper op = new Oper(5,5);
        int rs = op.add();
        assertEquals(10, rs);
        
    }
    
    @Test
    public void test_minus() {
       
        Oper op = new Oper(5,5);
        int rs = op.minus();
        assertEquals(0, rs);
    }
    
    @Test
    public void test_mul() {
       
        Oper op = new Oper(5,5);
        int rs = op.mul();
        assertEquals(25, rs);
    }
    
    @Test
    public void test_div() {
       
        Oper op = new Oper(5,5);
        double rs = op.div();
        assertEquals(1.0, rs, 0.01);
    }
    
}
