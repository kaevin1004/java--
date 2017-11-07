package java23.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IBook {
    
    int getCount(ModelBook book) throws SQLException;
    
    int getMaxBookid() throws SQLException;
    
    ResultSet selectAll() throws SQLException;
    
    ResultSet selectLike(ModelBook book) throws SQLException;
    
    ResultSet seelctEqual(ModelBook book) throws SQLException;
    
    ResultSet selectDynamic(ModelBook book) throws SQLException;
    
    int insertBook(ModelBook book) throws SQLException;
    
    int udateBook(ModelBook wherebook, ModelBook setbook) throws SQLException;
    
    int delete(ModelBook book) throws SQLException;
    
}
