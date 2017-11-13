package java23.jdbc;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    
    public DaoAuth(Connection conn) {
        super();
        this.conn = dbconnect.makeConnection();
    }

    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        
        int result  = -1;
        
        //SQL 문장
        String query = "select count(*) as total from auth ";
        
        //문장 객체 생성
        try{
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
        
        
        //문장 객체 실행
        ResultSet rs = stmt.executeQuery();// rs에 문장 객체 실행 저장
        
        //값을 빼내기
        rs.next();//커서 이동
        
        result = rs.getInt("total");
        
        } catch (SQLException e){
            
            e.printStackTrace();
        }
        
        return result;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        
        int result = -1;
        
        String query = "select max(authid) authid from auth ";
       //문장 객체 생성
        try{
            java.sql.PreparedStatement stmt = conn.prepareStatement(query);
            
            //문장 객체 실행 : executeQuery() or executeUpdate()
            ResultSet rs = stmt.executeQuery();
            
            rs.first();//커서를 첫번째 row로 이동.
            
            result = rs.getInt("authid");
            
        }catch (SQLException e){
            
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        
        
        
            //SQL 문장
            String query = " select * from auth ";
        
        try {
                        
            //문장 객체 생성
            PreparedStatement stmt = this.conn.prepareStatement(query);
            
            //문장 객체 실행 : executeQuery() or executeUpdate()
            rs = stmt.executeQuery();
            
        } catch (Exception e) {
            
           
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        //SQL 문장
        String query = " select * from auth where name like ? ";
        
        try {
            //문장 객체 생성
            PreparedStatement stmt = this.conn.prepareStatement(query);
            stmt.setString(1, " %" + auth.getName()+"% ");
            
            //문장 객체 실행
            rs = stmt.executeQuery();
            
        } catch (Exception e) {
            
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        String query = " select * from auth where name = ? ";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(query);
            stmt.setString(1, auth.getName());
            
            rs = stmt.executeQuery();
            
        } catch (Exception e) {
            
           
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        
        
        
        return null;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        
        int a = -1;
        
        try {
            String query = " insert into ";
            query += " auth(authid, name, birth)";
            query += "values(?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, auth.getAuthid());
            stmt.setString(2, auth.getName());
            stmt.setString(3, auth.getBirth());
            
            a = stmt.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return a;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        
        int a = -1;
        
        try {
            String query = " update auth \n";
                    query += " set name = ? \n";
                    query += ", birth = ? \n ";
                    query += " where 1 = 1 \n";
                    query += "and authid = ? \n ";
            
                    
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, setauth.getName());
                    stmt.setString(2, setauth.getBirth());
                    stmt.setInt(3, whereauth.getAuthid());
                    
                    a = stmt.executeUpdate();
                    
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
                
        return a;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        
        int a = -1;
        
        String query  = " delete from auth \n";
               query += " where 1 = 1 \n";
               query += " name = ? \n";
               query += " birth = ? \n";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, auth.getName());
            stmt.setString(2, auth.getBirth());
            
            a = stmt.executeUpdate();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return a;
    }
    
}
