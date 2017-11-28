package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.inf.IServiceUser;
import board.inf.IUser;
import board.model.ModelUser;

@Service("serviceuser")
public class ServiceUser implements IServiceUser {
    
    @Autowired
    @Qualifier("daouser")    
    private IUser dao;
    
    @Override
    public int insertUser(ModelUser user) throws Exception {
        
        int rs = -1;
        
        try {
            rs = dao.insertUser(user);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        
        List<ModelUser> rs = null;
        
        try {
            rs = dao.login(user);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int logout(String user) throws Exception {
        
        int rs = -1;
        
        try {
            rs = dao.logout(user);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue)
            throws Exception {
        
        int rs = -1;
        
        try {
            rs = dao.updateUserInfo(updateValue, searchValue);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int updatePasswd(String newPasswd, String currentPasswd,
            String userid) throws Exception {
        
        int rs = -1;
        
        try {
            rs = dao.updatePasswd(newPasswd, currentPasswd, userid);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int deleteUser(ModelUser user) throws Exception {
        
        int rs = -1;
        
        try {
            rs = dao.deleteUser(user);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public ModelUser selectUserOne(ModelUser user) throws Exception {
        
        ModelUser rs = null;
        
        try {
            rs = dao.selectUserOne(user);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        
        List<ModelUser> rs = null;
        
        rs = dao.selectUserList(user);
        
        return rs;
    }
    
    @Override
    public int checkuserid(String id) throws Exception {
        
        int rs = -1;
        
        try {
            rs = dao.checkuserid(id);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
}
