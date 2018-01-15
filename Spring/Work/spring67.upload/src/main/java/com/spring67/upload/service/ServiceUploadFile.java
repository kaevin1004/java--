package com.spring67.upload.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring67.upload.inf.IDaoUpload;
import com.spring67.upload.inf.IServiceUpload;
import com.spring67.upload.model.ModelUploadFile;


@Service
public class ServiceUploadFile implements IServiceUpload{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    IDaoUpload dao;

    @Override
    public List<ModelUploadFile> getUploadFile(ModelUploadFile file) {
        
        List<ModelUploadFile> rs = null;
        try {
            rs = dao.getUploadFile(file);
        } catch (Exception e) {
            logger.error("getUploadFile"+e.getMessage());
            e.printStackTrace();
            
        }
        return rs;
    }

    @Override
    public int insertUploadFile(ModelUploadFile file) {
        int rs = -1;
        
        try {
            rs = dao.insertUploadFile(file);
        } catch (Exception e) {
            logger.error("insertUploadFile"+e.getMessage());
            e.printStackTrace();
            
        }
        return rs;
    }

    @Override
    public int insertUploadFileList(List<ModelUploadFile> files) {
        int rs = -1;
        
        try {
            rs = dao.insertUploadFileList(files);
        } catch (Exception e) {
            logger.error("insertUploadFileList"+e.getMessage());
            e.printStackTrace();
            
        }
        
        return rs;
    }

    @Override
    public int deleteUploadFile(ModelUploadFile file) {
        int rs = -1;
        
        try {
            rs = dao.deleteUploadFile(file);
        } catch (Exception e) {
            logger.error("deleteUploadFile"+e.getMessage());
            e.printStackTrace();
            
        }
        
        return rs;
    }
}
