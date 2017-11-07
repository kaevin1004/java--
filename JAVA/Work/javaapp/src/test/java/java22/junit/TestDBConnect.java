package java22.junit;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import java23.jdbc.dbconnect;

public class TestDBConnect {
    
    @Test
    public void test_connectionMySQL() throws Exception {
        
        java.sql.Connection conn = dbconnect.connectionMySQL();
        
        if(conn != null){
            
            assertTrue("db connect success", true);
            
        }
        else{
            
            assertTrue("db connect fail", false);
            
        }
    }
    
    @Test
    public void makeConnection() throws Exception {
        
        java.sql.Connection conn = dbconnect.makeConnection();
        
        if(conn != null){
            
            assertTrue("db connect success", true);
            
        }
        else{
            
            assertTrue("db connect fail", false);
            
        }
    }
    
}
