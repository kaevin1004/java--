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
        
        java.sql.ResultSet a = null;
        
        try{
            //SQL 문장생성
            String query = "select * from book where bookname like ? ";
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = comm.prepareStatement(query);
            stmt.setString(1, "%"+ book.getBookname() +"%");
            //문장 객체 실행
            a = stmt.executeQuery();
            
        } catch (java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return a;
    }

    @Override
    public ResultSet selectEqual(ModelBook book) throws SQLException {
        
 java.sql.ResultSet a = null;
        
        try{
            //SQL 문장생성
            String query = "select * from book where bookname = ? ";
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = comm.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            //문장 객체 실행
            a = stmt.executeQuery();
            
        } catch (java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return a;    }

    @Override
    public ResultSet selectDynamic(ModelBook book) throws SQLException {
        
        java.sql.ResultSet a = null;
        
        try{
            // query 작성
            String query = "select * from book \n";
            
                   query += "where 1 = 1 \n";
                // query = query + "where 1 = 1 \n";
        if(book.getBookid() != null){
            query += "and bookid = ? \n"; 
            // query = query + "and bookid = ? \n";
        }    
        if(!book.getBookname().isEmpty()){
            query += "and bookname = ? \n";
         // query = query + "and bookname = ? \n";
        }    
        //문장 객체 생성
        
        java.sql.PreparedStatement stmt = comm.prepareStatement(query);
        
        int c = 1;
        if(book.getBookid() !=null){
            stmt.setInt(c++, book.getBookid());
        }    
        if(!book.getBookname().isEmpty()){
            stmt.setString(c++, book.getBookname());
        }    
         
        //문장 객체 실행
        a = stmt.executeQuery();
        } catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return a;
    }

    @Override
    public int insertBook(ModelBook book) throws SQLException {
        
        int a = -1;
        try{
            String query = "insert into ";
            query += "BOOK(BOOKNAME, PUBLISHER, YEAR, PRICE, DTM, USE_YN, AUTHID)";
            query += "VALUES(?,?,?,?,?,?,?)";
            
            java.sql.PreparedStatement stmt = comm.prepareStatement(query);
            stmt.setString(1, book.getBookname());
            stmt.setString(2, book.getPublisher());
            stmt.setString(3, book.getYear());
            stmt.setInt(4, book.getPrice());
            stmt.setDate(5, (java.sql.Date)book.getDtm());
            stmt.setBoolean(6, book.getUse_yn());
            stmt.setInt(7, book.getAuthid());
            
            a = stmt.executeUpdate();
            
        } catch (java.sql.SQLException e){
            e.printStackTrace();
        }
        
        return a;
    }

    @Override
    public int updateBook(ModelBook wherebook, ModelBook setbook)
            throws SQLException {
        
        int a = -1;
        try{
            //SQL 문장 생성
            String query = "update book \n ";
            query += "set year = ?, price = ? \n ";
            query += "where bookname = ? \n ";
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = comm.prepareStatement(query);
            stmt.setString(1, setbook.getYear());
            stmt.setInt(2, setbook.getPrice());
            stmt.setString(3, wherebook.getBookname());
            
            //문장 객체 실행
            
            a = stmt.executeUpdate();
            
        } catch (java.sql.SQLException e){
            e.printStackTrace();
        }
          
        return a;
    }

    @Override
    public int deletebook(ModelBook book) throws SQLException {
        
        int a = -1;
        try{
            //SQL 문장생성
            String query = "delete from book where bookname = ? ";
            
            //문장 객체 생성
            java.sql.PreparedStatement stmt = comm.prepareStatement(query);
            
            stmt.setString(1, book.getBookname());
            
            //문장 객체 실행
            a = stmt.executeUpdate();
            
        } catch (java.sql.SQLException e){
            e.printStackTrace();
            
        }
        
        return a;
    }
    
   
    
}
