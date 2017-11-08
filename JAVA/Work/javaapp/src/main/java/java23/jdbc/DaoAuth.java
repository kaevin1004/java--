package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    
    public DaoAuth(Connection conn) {
        super();
        this.conn = conn;
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
        
        rs.getInt("total");
        
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
            
            rs.getInt("suthid");
            
        }catch (SQLException e){
            
            e.printStackTrace();
        }
        return result;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        return null;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        
        return null;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        return null;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {
        
        return null;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {
        
        return 0;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {
        
        return 0;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {
        
        return 0;
    }
    
}
