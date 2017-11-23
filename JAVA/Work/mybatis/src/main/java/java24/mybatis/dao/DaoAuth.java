package java24.mybatis.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.inf.IAuth;
import java24.mybatis.model.ModelAuth;

@Repository("daoauth")

public class DaoAuth implements IAuth {
    
    @Autowired
    @Qualifier("sqlSession")
    
    private SqlSession session;

    @Override
    public int getCount(ModelAuth auth) throws Exception {
        
       int rs = -1;
       
       rs = session.selectOne("mapper.mapperAuth.getCount", auth);
        
        return rs;
    }

    @Override
    public int getMaxAuthid() throws Exception{
        
        int rs = -1;
        
        rs = session.selectOne("mapper.mapperAuth.getMaxAuthid");
        
        return rs;
    }

    @Override
    public List<ModelAuth> selectAll(ModelAuth auth) throws Exception {
        
        List<ModelAuth> rs = null;
        
        rs = session.selectList("mapper.mapperAuth.selectAll", auth);
        
        return rs;
    }

    @Override
    public List<ModelAuth> selectLike(ModelAuth auth) throws Exception {
        
        List<ModelAuth> rs = null;
        
        rs = session.selectList("mapper.mapperAuth.selectLike", auth);
        
        return rs;
    }

    @Override
    public List<ModelAuth> selectEqual(ModelAuth auth) throws Exception {
        
        List<ModelAuth> rs = null;
        
        rs = session.selectList("mapper.mapperAuth.selectEqual", auth);
        
        return rs;
    }

    @Override
    public int insertAuth(ModelAuth auth) throws Exception {
        
        session.insert("mapper.mapperAuth.insertAuth", auth);
        
        return auth.getAuthid();
    }

    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws Exception {
        
        int rs = -1;
        
        Map<String, Object> map = new HashMap<>();
        
        map.put("whereauth", whereauth);
        map.put("setauth", setauth);
        
        rs = session.update("mapper.mapperAuth.updateAuth", map);
        
        return rs;
    }

    @Override
    public int deleteAuth(ModelAuth auth) throws Exception {
        
        int rs = -1;
        
        rs = session.delete("mapper.mapperAuth.deleteAuth", auth);
        
        return rs;
    }
    
    
    
}
