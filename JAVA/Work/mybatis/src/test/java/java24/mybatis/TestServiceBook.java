package java24.mybatis;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;
import net.sf.log4jdbc.CallableStatementSpy;

public class TestServiceBook {
    
    private static IServiceBook service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        //classpath를 이용한 설정 파일 로딩
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        
        //file을 이용한 설정 파일 로딩
        //ApplicationContext context = new
                //ClassPathXmlApplicationContext("file:src/main/resources/ApplicationContext.xml");
        
        //ID를 이용한 servicebook 인스턴스 생성
        service = context.getBean("servicebook", ServiceBook.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        
        ModelBook book = new ModelBook();
        
        book.setBookname("java");
        book.setPublisher(null);
        int rs = service.getCount(book);        
        assertEquals(1, rs);
        
        book.setBookname("");
        book.setPublisher("wiley");
        rs = service.getCount(book);        
        assertEquals(2, rs);
        
        
    }
    
    @Test
    public void testGetMaxBookid() throws Exception {
        
        ModelBook book = new ModelBook();
        int rs = service.getMaxBookid();
        
        assertEquals(4, rs);
        
    }
    
    @Test
    public void testSelectAll() throws Exception {
        
        ModelBook book = new ModelBook();
        
        List<ModelBook>rs = service.selectAll(book);
        
        //인스턴스 검증
        assertNotNull(rs);
        
        //값으로 검증
        ModelBook m = rs.get(0);
        
        assertSame(1, m.getBookid());
        assertEquals("operating system", m.getBookname());
        
        //갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
        
        
    }
    
    @Test
    public void testSelectLike() throws Exception {
        
        ModelBook book = new ModelBook();
        
        book.setBookname("%ja%");
        book.setPublisher("hall");
        List<ModelBook> rs = service.selectLike(book);
        
        //인스턴스 검증
        assertNotNull(rs);
        
        //값으로 검증
        ModelBook m = rs.get(0);
        
        assertSame(3, m.getBookid());
        assertEquals("java", m.getBookname());
        //갯수로 검증
        
        
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        
        ModelBook book = new ModelBook();
        
        book.setBookname("java");
        
        List<ModelBook> rs = service.selectEqual(book);
        
        assertNotNull(rs);
        
        ModelBook m = rs.get(0);
        
        assertSame(3, m.getBookid());
        assertEquals("java", m.getBookname());
        
    }
    
    @Test
    public void testInsert() throws Exception {
        
        
        Date date2 = Date.valueOf("2017-11-22");
        
        ModelBook book = new ModelBook();
        
        book.setBookname("test");
        book.setPublisher("내가");
        book.setYear("2017");
        book.setPrice(10000);
        book.setDtm(date2);
        book.setUse_yn(true);
        book.setAuthid(2);
        
        int a  = service.insert(book);
        
        assertEquals(14, a);
        
    }
    
    @Test
    public void testInsertMap() throws Exception {
        
        Date date1 = Date.valueOf("2017-11-23");
        
        
        ModelBook book = new ModelBook();
        
        book.setBookname("test");
        book.setDtm(date1);
        book.setAuthid(6);
        
        int a = service.insert(book);
        
        assertEquals(15, a);
                
        
    }
    
    @Test
    public void testUpdate() throws Exception {
        
        ModelBook wherebook = new ModelBook();
        
        wherebook.setBookname("test");
        
        ModelBook setbook = new ModelBook();
        
        setbook.setBookname("test");
        setbook.setPrice(12000);
        setbook.setYear("2016");
        
        int a = service.update(wherebook, setbook);
        System.out.println(a);
        assertTrue(a >= 0);
    }
    
    @Test
    public void testDelete() throws Exception {
        
        ModelBook book = new ModelBook();
        
        book.setBookname("test");
        
        int a = service.delete(book);
        
        assertTrue(a >=0);
        
    }
    
    @Test
    public void testSelectDynamic() {
        
        
        
    }
    
}
