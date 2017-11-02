package java22.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    
    @Test
    public void testAdd() {
        
        //Oper 클래스의 인스턴스 생성
        Oper op = new Oper(2,4);
        
        int rs = op.add();
        
        assertEquals(6, rs);
    }
    
}
