package com.spring65.phone.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring65.phone.inf.IDaoPhone;
import com.spring65.phone.inf.IServicePhone;
import com.spring65.phone.model.ModelPhone;


@Service("svrphone")
public class ServicePhone implements IServicePhone {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    @Qualifier("daophone")
    IDaoPhone dao;
    
    
    @Override
    public ModelPhone getPhoneOne(String name) {
        
        ModelPhone rs = null;
        try {
            rs = dao.getPhoneOne(name);
        } catch (Exception e) {
            
            logger.error("getPhoneOne" + e.getMessage());
            
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public List<ModelPhone> getPhoneList() {
        
        List<ModelPhone> rs = null;
        
        try {
            rs = dao.getPhoneList();
        } catch (Exception e) {
            logger.error("getPhoneList" + e.getMessage());
            e.printStackTrace();
            
        }
        
        return rs;
    }
    
    @Override
    public int insertPhone(ModelPhone phone) {
        
        int rs = -1;
        try {
            rs = dao.insertPhone(phone);
        } catch (Exception e) {
            logger.error("insertPhone" + e.getMessage());
            e.printStackTrace();
            
        }
       
        return rs;
    }
    
    @Override
    public int insertPhoneList(List<ModelPhone> phones) {
        
        int rs = -1;
        try {
            rs = dao.insertPhoneList(phones);
        } catch (Exception e) {
            logger.error("insertPhoneList" + e.getMessage());
            e.printStackTrace();
            
        }
        
        return rs;
    }
}
