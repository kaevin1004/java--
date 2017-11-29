package board.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private SqlSession session;

    @Override
    public int insertUser(ModelUser user) throws Exception {
        
        int rs = -1;
        
        rs = session.insert("mapper.mapperUser.insertUser", user);
        
        return rs;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        
        List<ModelUser> us = null;
        
        us = session.selectList("mapper.mapperUser.login",user);
        
        return us;
    }

    @Override
    public int logout(String user) throws Exception {
        
        int rs = -1;
        
        rs = session.selectOne("mapper.mapperUser.logout", user);
        
        return rs;
    }

    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue)
            throws Exception {
        
        int rs = -1;
        
        Map<String, Object> map = new HashMap<>();
        
        map.put("updateValue", updateValue);
        map.put("searchValue", searchValue);
        
        rs = session.update("mapper.mapperUser.updateUserInfo", map);
        
        return rs;
    }

    @Override
    public int updatePasswd(String newPasswd, String currentPasswd, String userid)
            throws Exception {
        
            int rs = -1;
            
            Map<String, Object> map = new HashMap<>();
            
            map.put("newPasswd", newPasswd);
            map.put("currentPasswd", currentPasswd);
            map.put("userid", userid);
            
            rs = session.update("mapper.mapperUser.updatePasswd", map);
        
        return rs;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        
        int rs = -1;
        
        rs = session.delete("mapper.mapperUser.deleteUser", user);
        
        return rs;
    }

    @Override
    public ModelUser selectUserOne(ModelUser user) throws Exception {
        
        ModelUser rs = null;
        
        rs = session.selectOne("mapper.mapperUser.selectUserOne", user);
        
        return rs;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        
        List<ModelUser> rs = null;
        
        rs = session.selectList("mapper.mapperUser.selectUserList", user);
        
        return rs;
    }

    @Override
    public int checkuserid(String id) throws Exception {
        
        int rs = -1;
        
        rs = session.selectOne("mapper.mapperUser.checkuserid", id);
        
        return rs;
    }
    
    
    
}
