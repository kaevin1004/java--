package com.spring.chaebong;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicePhone implements IServicePhone {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
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
    public List<ModelPhone> getPhoneList(int start, int end) {
        
        List<ModelPhone> rs = null;
                try {
                    rs = dao.getPhoneList(start, end);
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
    public int getPhoneTotalRecord() {
       
        int rs = -1;
        
        try {
            rs = dao.getPhoneTotalRecord();
        } catch (Exception e) {
            logger.error("getPhoneTotalRecord" + e.getMessage());
            e.printStackTrace();
            
        }
        
        return rs;
    }
}
