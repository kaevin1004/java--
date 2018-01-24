package com.spring.chaebong;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DaoPhone implements IDaoPhone{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SqlSession session;
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        
        return session.selectOne("mapper.mapperPhone.getPhoneOne", name);
    }

    @Override
    public List<ModelPhone> getPhoneList(int start, int end) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("start", start);
        map.put("end", end);
        return session.selectList("mapper.mapperPhone.getPhoneList", map);
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        
        return session.insert("mapper.mapperPhone.insertPhone", phone);
    }

    @Override
    public int getPhoneTotalRecord() {
       
        return session.selectOne("mapper.mapperPhone.getPhoneTotalRecord");
    }
}
