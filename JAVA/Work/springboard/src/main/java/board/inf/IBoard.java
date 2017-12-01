package board.inf;

import java.util.List;

import board.model.ModelArticle;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;

public interface IBoard {
    
    String getBoardName(String boardcd) throws Exception;
    ModelBoard getBoardOne(String boardcd) throws Exception;
    List<ModelBoard> getBoardList(String searchWord) throws Exception;
    int insertBoard(ModelBoard board) throws Exception;
    int updateBoard(ModelBoard setValue, ModelBoard whereValue) throws Exception;
    int deleteBoard(ModelBoard board) throws Exception;
    List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception;
    int getBoardTotalRecord(String boardcd, String searchWord) throws Exception;
    List<ModelBoard> getBoardPaging(String boardcd, String searchWord, int start, int end) throws Exception;
    int insertBoardList(List<ModelBoard> list) throws Exception;
    
    int getArticleTotalRecord(String boardcd, String searchWord) throws Exception;
    List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) throws Exception;
    ModelArticle getArticle(int articleno) throws Exception;
    int insertArticle(ModelArticle article) throws Exception;
    int updateArticle(ModelArticle setValue, ModelArticle whereValue) throws Exception;
    int deleteArticle(ModelArticle article) throws Exception;
    int increaseHit(int articleno) throws Exception;
    ModelArticle getNextArticle(int articleno, String boardcd, String searchWord) throws Exception;
    ModelArticle getPrevArticle(int articleno, String boardcd, String searchWord) throws Exception;
    ModelAttachFile getAttachFile(int attachFileNo) throws Exception;
    List<ModelAttachFile> getAttachFileList(int articleno) throws Exception;
    int insertAttachFile(ModelAttachFile attachFile) throws Exception;
    int deleteAttachFile(ModelAttachFile attachFile) throws Exception;
    
    ModelComments getComment(int commentNo) throws Exception;
    List<ModelComments> getCommentList(int articleno) throws Exception;
    int insertComment(ModelComments comment) throws Exception;
    int updateComment(ModelComments setValue, ModelComments whereValue) throws Exception;
    int deleteComment(ModelComments comment) throws Exception;
    
}
