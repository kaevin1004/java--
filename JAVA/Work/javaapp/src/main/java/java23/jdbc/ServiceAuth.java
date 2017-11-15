package java23.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServiceAuth implements IAuth {
    
    private java.sql.Connection conn = null;
    
    
    public ServiceAuth() {
        super();
        this.conn = dbconnect.makeConnection();
    }

    @Override
    public int getCount(ModelAuth auth) throws SQLException {
        
        int rs = -1;
        try{
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            //Dao의 SQL 메서드 실행.
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.getCount(auth);
            
            this.conn.commit();
        }catch (SQLException e){
            
            e.printStackTrace();
            
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public int getMaxAuthid() throws SQLException {
        
        int rs = -1;
        
        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            //트랜젝션 커밋
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.getMaxAuthid();
            
            this.conn.commit();
            
            
        } catch (Exception e) {
            
            
            e.printStackTrace();
            
          //트랜젝션 종료
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        
        ResultSet rs = null;
        
        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            
            DaoAuth dao = new DaoAuth(conn);
             rs = dao.selectAll();
            
            //트랜젝션 커밋
            this.conn.commit();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
          //트랜젝션 종료
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectLike(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectLike(auth);
            
            //트랜젝션 커밋
            this.conn.commit();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
            //트랜젝션 종료
            this.conn.rollback();
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectEqual(ModelAuth auth) throws SQLException {
        
        ResultSet rs = null;
        
        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectEqual(auth);
            
            //트랜젝션 커밋
            this.conn.commit();
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
            //트랜젝션 종료
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
    @Override
    public ResultSet selectDynamic(ModelAuth auth) throws SQLException {

        //트랜젝션 시작
        ResultSet rs = null;
        try{
            conn.setAutoCommit(false);
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.selectDynamic(auth);
            conn.commit();
        }catch (Exception e){
            e.printStackTrace();
            conn.rollback();
        }
        
        //트랜젝션 커밋
        
        //트랜젝션 종료
        return rs;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws SQLException {

        int rs = -1;
        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.insertAuth(auth);
            
            //트랜젝션 커밋
            this.conn.commit();
            

            
        } catch (Exception e) {
            
            e.printStackTrace();
            
            //트랜젝션 종료
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws SQLException {

        int rs = -1;

        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            rs = dao.updateAuth(whereauth, setauth);
            
            //트랜젝션 커밋
            this.conn.commit();
            
            
            //트랜젝션 종료
            this.conn.rollback();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws SQLException {

        int rs = 0;
        try {
            //트랜젝션 시작
            this.conn.setAutoCommit(false);
            
            DaoAuth dao = new DaoAuth(conn);
            
            rs = dao.deleteAuth(auth);
            
            //트랜젝션 커밋
            this.conn.commit();
            

        } catch (Exception e) {
            
            e.printStackTrace();
            
            //트랜젝션 종료
            this.conn.rollback();
            
        }
        
        return rs;
    }
    
}
