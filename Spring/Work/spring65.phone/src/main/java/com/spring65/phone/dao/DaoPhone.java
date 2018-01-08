package com.spring65.phone.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring65.phone.inf.IDaoPhone;
import com.spring65.phone.model.ModelPhone;

public class DaoPhone implements IDaoPhone{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    SqlSession session;
    @Override
    public ModelPhone getPhoneOne(String name) {
        
        return session.selectOne("", name);
    }

    @Override
    public List<ModelPhone> getPhoneList() {
        
        return null;
    }

    @Override
    public int insertPhone(ModelPhone phone) {
        
        return 0;
    }

    @Override
    public int insertPhone(List<ModelPhone> phones) {
        
        return 0;
    }
}
