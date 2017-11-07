package java22.junit;

import static org.junit.Assert.*;

import java.awt.print.Book;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.DaoBook;
import java23.jdbc.ModelBook;
import java23.jdbc.dbconnect;

public class TestDaoBook {
    
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        conn = dbconnect.makeConnection();
        
    }
    
    @Test
    public void testGetCount() throws SQLException {
        
        DaoBook book = new DaoBook(conn);
        ModelBook model = new ModelBook();
        int result = book.getCount(model);
        
        assertEquals(4, result);
        
        
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        
        DaoBook a = new DaoBook(conn);
        int x = a.getMaxBookid();
        
        assertEquals(4, x);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
        DaoBook a = new DaoBook(conn);
        
        java.sql.ResultSet x = a.selectAll();
        x.next();
        int bookid = x.getInt("bookid");
        
        assertEquals(1, bookid);
        
        String bookname = x.getString("bookname");
        
        assertEquals("operating system", bookname);
        
    }
    
    @Test
    public void testSelectLike() {
        
    }
    
    @Test
    public void testSeelctEqual() {
        
    }
    
    @Test
    public void testSelectDynamic() {
        
    }
    
    @Test
    public void testInsertBook() {
        
    }
    
    @Test
    public void testUdateBook() {
        
    }
    
    @Test
    public void testDelete() {
        
    }
    
}
