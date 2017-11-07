package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DaoBook implements IBook {
    
    private java.sql.Connection comm = null;
    
    
    
     public DaoBook(Connection comm) {
        super();
        this.comm = comm;
    }

    @Override
    public int getCount(ModelBook book) throws SQLException {
        
        int result = -1;
        
        //SQL 문장
        String query = "SELECT count(*) as total from book";
        
        try{
            // 문장 객체 생성
            java.sql.PreparedStatement stmt = comm.prepareStatement(query);
            
            // SQL 문장 실행
            java.sql.ResultSet rs = stmt.executeQuery();//SQL문장을 실행하고 결과로 ResultSet을 반환한다.
            
            rs.next();// 커서 이동. ResultSet 첫번째로 로우로.
            
            result = rs.getInt("total");// total 컬럼의 값을 가져온다.
                                        //result = rs.getInt(0); 가능
        } catch(java.sql.SQLException e){
            
            
            
            e.printStackTrace();
            
        }
        
        return result;
    }

    @Override
    public int getMaxBookid() throws SQLException {
        
        int result = -1;
        
        String a = "SELECT max(bookid) as total from book";
        try{
        
        java.sql.PreparedStatement stmt = comm.prepareStatement(a);
        
        java.sql.ResultSet x = stmt.executeQuery();
        
        x.next();
        
        result = x.getInt("total");
        
        } catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public ResultSet selectAll() throws SQLException {
        
        java.sql.ResultSet a = null;
        
        //SQL 문장 실행
        String x = "select * from book order by bookid asc";
        
        try{
            //문장 객체 생성
            java.sql.PreparedStatement stmt = comm.prepareStatement(x);
            
            //SQL 문장 실행
            a = stmt.executeQuery();
            
        } catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public ResultSet selectLike(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResultSet seelctEqual(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insertBook(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int udateBook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
   
    
}
