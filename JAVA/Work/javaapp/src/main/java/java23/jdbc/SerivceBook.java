package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SerivceBook implements IServiceBook {
    
    @Override
    public int getCount(ModelBook book) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int getMaxBookid() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public ResultSet selectAll() throws SQLException {
        // TODO Auto-generated method stub
        return null;
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
    
    @Override
    public int transCommit(ModelBook b1, ModelBook b2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int transRollback(ModelBook b1, ModelBook b2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
