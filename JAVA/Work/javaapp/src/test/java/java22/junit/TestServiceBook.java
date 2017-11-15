package java22.junit;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import java23.jdbc.DaoBook;
import java23.jdbc.ModelBook;
import java23.jdbc.ServiceBook;

public class TestServiceBook {
    
    private static ServiceBook svr = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
      svr =  new ServiceBook();
        
    }
    
        
    @Test
    public void testGetCount() throws SQLException {
        
        ModelBook model = new ModelBook();
        
        int result = svr.getCount(model);
        
        assertEquals(4, result);
        
    }
    
    @Test
    public void testGetMaxBookid() throws SQLException {
        
        
        int x = svr.getMaxBookid();
        
        assertEquals(4, x);
        
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        
        java.sql.ResultSet x = svr.selectAll();
        x.next();
        int bookid = x.getInt("bookid");
        
        assertEquals(1, bookid);
        
        String bookname = x.getString("bookname");
        
        assertEquals("operating system", bookname);
        
    }
    
    @Test
    public void testSelectLike() throws SQLException {
        
        
        ModelBook book = new ModelBook();
        
        book.setBookname("ja");
        
        java.sql.ResultSet a = svr.selectLike(book);
        
        // a.getRow(); //resultset 의 커서가 가르키는 위치.
        
        assertNotNull(a);
        
        //assertTrue(a.getRow() >= 1);
        //값을 이용한 검증
        a.next();//커서가 첫번째 로우로 이동
        
        String name = a.getString("bookname");//java 가져옴
        assertTrue(name.contains("ja"));
        assertTrue(name.contains(book.getBookname()));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        
        ModelBook book = new ModelBook();
        
        book.setBookname("mysql");
        
        java.sql.ResultSet a = svr.selectEqual(book);
        
        //인스턴스 검증
        assertNotNull(a);
        
        // 값을 이용한 검증
        a.next();//result 커서가 첫번째 로우로 이동.
        String name = a.getString("bookname");
        
        assertEquals("mysql", name);
        assertEquals(book.getBookname(), name);
        
    }
    
    @Test
    public void testSelectDynamic() throws SQLException {
        
        ModelBook book = new ModelBook();
        //첫번째 검증. select * from book where 1 = 1
        //             select count(*) from book where 1 = 1
        
        book.setBookid(null);
        book.setBookname("");
        java.sql.ResultSet a = svr.selectDynamic(book);
        
        assertNotNull(a);//인스턴스 검증
        a.last();
        int rows = a.getRow();
        assertEquals(svr.getCount(book), rows);
        
        //두번째 검증 select * from book where 1 = 1 and bookid =1;
        
        book.setBookid(1);
        book.setBookname("");
        
        a = svr.selectDynamic(book);
        
        //인스턴스 검증
        assertNotNull(a);
        //값으로 검증
        
        a.next();//커서의 위치를 다음 row로 이동.
        int bookid = a.getInt("bookid");
        String bookname = a.getString("bookname");
        
        assertEquals(1, bookid);
        assertSame(book.getBookid(), bookid);
        
        assertEquals("operating system", bookname);
        
        
        //세번째 검증 select * from book where 1 = 1and bookname = 'java';
        
        book.setBookid(null);
        book.setBookname("java");
        a = svr.selectDynamic(book);
        
        //인스턴스 검증
        assertNotNull(a);
        
        a.next();
        
        bookid = a.getInt("bookid");
        bookname = a.getString("bookname");
        
        assertEquals(3, bookid);
        assertEquals("java", bookname);
        
        //네번째 검증 select * from book where 1 = 1 and bookid = 2 and bookname = 'mysql';
        
        book.setBookid(2);
        book.setBookname("mysql");
        
        a = svr.selectDynamic(book);
        
        a.last();
        
        bookid = a.getInt("bookid");
        bookname = a.getString("bookname");
        
        assertEquals(2, bookid);
        assertEquals("mysql", bookname);
        
        
    }
    
    @Test
    public void testInsertBook() throws SQLException {
        
        java.util.Date date1 = new java.util.Date();
        
        java.sql.Date date2 = java.sql.Date.valueOf("2017-11-08");
        // new java.util.Date(117,10, 8);
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        book.setPublisher("abc");
        book.setYear("2017");
        book.setPrice(20000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(3);
        
       
        int a = svr.insertBook(book);
        
        //insert 검증 : 
        //1이 리턴되는 경우 : insert 성공
        //0이 리턴되는 경우 : insert 실패
        //-1이 리턴되는 경우 : exception 으로 인한 실패
        
        
        assertEquals(1, a);
        
    }
    
    @Test
    public void testUpdateBook() throws SQLException {
        
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("test");
        
        ModelBook setbook = new ModelBook();
        
        setbook.setPrice(12000);
        setbook.setYear("2016");
        
        
        int a = svr.updateBook(wherebook,setbook);
        
        //검증코드
        //1이상의 숫자가 리턴되는 경우 : 성공
        //0값이 리턴되는 경우 : 성공
        assertTrue(a >=0);
        
    }
    
    @Test
    public void testDeletebook() throws SQLException {
        
        ModelBook book = new ModelBook();
        book.setBookname("test");
        
        
        int a = svr.deletebook(book);
        
        //검증코드
        //1 이상의 값이 리턴되는 경우 : 성공
        //0 값이 리턴되는 경우 : 성공
        
        assertTrue(a >=0);
        
        book.setBookname("test2");
        a = svr.deletebook(book);
        //검증코드
        //1 이상의 값이 리턴되는 경우 : 성공
        //0 값이 리턴되는 경우 : 성공
        
        assertTrue(a >=0);
        
    }
    
    @Test
    public void testTransCommit() {
        
        
        
    }
    
    @Test
    public void testTransRollback() {
        
        
        
    }
    
}
