package board.service;

import java.util.List;

import board.inf.IServiceBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

public class ServiceBoard implements IServiceBoard{

    @Override
    public String getBoardName(String boardcd) throws Exception {
        
        
        
        return null;
    }

    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        
        
        
        return null;
    }

    @Override
    public List<ModelBoard> getBoardList(String searchWord) throws Exception {
        

        
        return null;
    }

    @Override
    public int insertBoard(ModelBoard board) throws Exception {
       

        
        return 0;
    }

    @Override
    public int updateBoard(ModelBoard setValue, ModelBoard whereValue)
            throws Exception {
        

        
        return 0;
    }

    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        

        
        return 0;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
       

        
        return null;
    }

    @Override
    public int getBoardTotalRecord(String boardnm) throws Exception {
        

        
        return 0;
    }

    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
        

        
        return null;
    }

    @Override
    public int insertBoardList(List<ModelBoard> list) throws Exception {
        

        
        return 0;
    }

    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord)
            throws Exception {
 

        
        return 0;
    }

    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord,
            int start, int end) throws Exception {
       

        
        return null;
    }

    @Override
    public ModelArticle getArticle(int articleno) throws Exception {
        

        
        return null;
    }

    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        

        
        return 0;
    }

    @Override
    public int updateArticle(ModelArticle setValue, ModelArticle whereValue)
            throws Exception {
        

        
        return 0;
    }

    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        

        
        return 0;
    }

    @Override
    public int increaseHit(int articleno) throws Exception {
        

        
        return 0;
    }

    @Override
    public ModelArticle getNextArticle(int articleno, String boardcd,
            String searchWord) throws Exception {
        

        
        return null;
    }

    @Override
    public ModelArticle getPrevArticle(int articleno, String boardcd,
            String searchWord) throws Exception {
       

        
        return null;
    }

    @Override
    public ModelAttachFile getAttachFile(int attachFileNo) throws Exception {
        

        
        return null;
    }

    @Override
    public List<ModelAttachFile> getAttachFileList(int articleno)
            throws Exception {
        

        
        return null;
    }

    @Override
    public int insertAttachFile(ModelAttachFile attachFile) throws Exception {
        

        
        return 0;
    }

    @Override
    public int deleteAttachFile(ModelAttachFile attachFile) throws Exception {
        

        
        return 0;
    }

    @Override
    public ModelComments getComment(int commentNo) throws Exception {
        

        
        return null;
    }

    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        

        
        return null;
    }

    @Override
    public int insertComment(ModelComments comment) throws Exception {
        

        
        return 0;
    }

    @Override
    public int updateComment(ModelComments setValue, ModelComments whereValue)
            throws Exception {
        

        
        return 0;
    }

    @Override
    public int deleteComment(ModelComments comment) throws Exception {
       

        
        return 0;
    }
    
    
    
}
