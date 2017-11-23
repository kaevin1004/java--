package java24.mybatis.svr;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java24.mybatis.inf.IBook;
import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;

@Service("servicebook")
public class ServiceBook implements IServiceBook {
    
    @Autowired
    @Qualifier("daobook")
    
    private IBook dao;

    @Override
    public int getCount(ModelBook book) throws Exception {
        
        int result = -1;
        
        try {
            result = dao.getCount(book);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
    }

    @Override
    public int getMaxBookid() throws Exception {
        
        int result = -1;
        
        try {
            result = dao.getMaxBookid();
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
    }

    @Override
    public List<ModelBook> selectAll(ModelBook book) throws Exception {
        
        List<ModelBook> result = null;
        
        try {
            result = dao.selectAll(book);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
        
       
    }

    @Override
    public List<ModelBook> selectLike(ModelBook book) throws Exception {
        
        List<ModelBook> result = null;
        
        try {
            result = dao.selectLike(book);
        } catch (Exception e) {
           
            e.printStackTrace();
            
        }
        
        return result;
        
        
    }

    @Override
    public List<ModelBook> selectEqual(ModelBook book) throws Exception {
        
        List<ModelBook> result = null;
        
        try {
            result = dao.selectEqual(book);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
        
       
    }

    @Override
    public int insert(ModelBook book) throws Exception {
        
        int result = -1;
        
        try {
            result = dao.insert(book);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
       
       
    }

    @Override
    public int insertMap(String bookname, Date dtm, int authid)
            throws Exception {
      
        int result = -1;
        
        try {
            result = dao.insertMap(bookname, dtm, authid);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
        
       
    }

    @Override
    public int update(ModelBook wherebook, ModelBook setbook) throws Exception {
       
        int result = -1;
        
        try{
            result = dao.update(wherebook, setbook);
        }catch (Exception e){
            
            e.printStackTrace();
        }
        
        return result;
    }

    @Override
    public int delete(ModelBook book) throws Exception {
        
        int result = -1;
        
        try {
            result = dao.delete(book);
        } catch (Exception e) {
           
            e.printStackTrace();
            
        }
        
        return result;
        
        
    }

    @Override
    public List<ModelBook> selectDynamic(ModelBook book) throws Exception {
        

        List<ModelBook> result = null;
        
        try {
            result = dao.selectDynamic(book);
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return result;
        
        
    }
    
    
    
}
