package com.spring61.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring61.rest.inf.IServiceUser;
import com.spring61.rest.model.ModelUser;
import com.spring61.rest.service.ServiceUser;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceUser {
    
    private static IServiceUser service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        ApplicationContext context = new
                ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
        
        service = context.getBean("serviceuser", ServiceUser.class);
        
        //DB Table 초기화 코드
        
        javax.sql.DataSource dataSource = (javax.sql.DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(dataSource.getConnection());
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("ddl/board.ddl.mysql.sql").getFile();
        
        java.io.Reader br = new java.io.BufferedReader(new java.io.FileReader( sf));
        runner.runScript(br);
        runner.closeConnection();
        
        
    }
    
    @Test
    public void test01InsertUser() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setUserid("99");
        user.setPasswd("12345");
        user.setName("abcd");
                
        int rs = service.insertUser(user);
        
        assertTrue(rs >= 0);
    }
    
    @Test
    public void test02Login() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setPasswd("password");
        user.setUserid("userid");
        
        List<ModelUser> rs = service.login(user);
        
        assertTrue(rs.size() == 1);
        System.out.println(rs);
        
        ModelUser re = rs.get(0);
        
        assertEquals("usr", re.getName());
        assertSame(1, re.getUserno());
        
    }
    
    @Test
    public void test03Logout() throws Exception {
        
        
        
        
    }
    
    @Test
    public void test04UpdateUserInfo() throws Exception {
        
        ModelUser searchValue = new ModelUser();
        
        searchValue.setUserid("userid");
        
        ModelUser updateValue = new ModelUser();
        
        updateValue.setName("usr");
        updateValue.setPasswd("password");
        
        int rs = service.updateUserInfo(updateValue, searchValue);
        
        assertTrue(rs>=0);
        
        
    }
    
    @Test
    public void test05UpdatePasswd() throws Exception {
        
        int result = service.updatePasswd("4555", "password", "userid");
        
        assertTrue(result >= 0);
        
    }
    
    @Test
    public void test06DeleteUser() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setUserid("userid");
        
        int rs = service.deleteUser(user);
        
        assertTrue(rs>=0);
        
    }
    
    @Test
    public void test07SelectUserOne() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setUserno(1);
        
        ModelUser rs = service.selectUserOne(user);
        
        System.out.println(rs);
        
        assertNotNull(rs);
        
    }
    
    @Test
    public void test08SelectUserList() throws Exception {
        
        ModelUser user = new ModelUser();
        
        user.setName("usr");

        List<ModelUser> rs = service.selectUserList(user);
        
        assertNotNull(rs);
        System.out.println(rs);
        
    }
    
    @Test
    public void test09Checkuserid() throws Exception {
        
        int rs = service.checkuserid("userid");
        
        assertEquals(1, rs);
        
    }
    
}
