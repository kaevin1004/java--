package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IUser;
import board.model.ModelUser;

@Repository("daouser")

public class DaoUser implements IUser {
    
    @Autowired
    @Qualifier("sqlSession")

    @Override
    public int insertUser(ModelUser user) throws Exception {
        
        int rs = -1;
        
        session.in
        
        return 0;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        
        
        
        return null;
    }

    @Override
    public int logout(String user) throws Exception {
        
        
        return 0;
    }

    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue)
            throws Exception {
        
        
        
        return 0;
    }

    @Override
    public int updatePasswd(String newPasswd, String currentPasswd, int userid)
            throws Exception {
        
        
        
        return 0;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        
        
        
        return 0;
    }

    @Override
    public List<ModelUser> selectUserOne(ModelUser user) throws Exception {
        
        
        
        return null;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        
        
        
        return null;
    }

    @Override
    public int checkuserid(String id) throws Exception {
        
        
        
        return 0;
    }
    
    
    
}
