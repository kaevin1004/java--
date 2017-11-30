package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IBoard;
import board.model.ModelArticle;
import board.model.ModelAttachFile;
import board.model.ModelBoard;
import board.model.ModelComments;


@Repository("daoboard")
public class DaoBoard implements IBoard {
    
    @Autowired
    @Qualifier("sqlSession")
    
    private SqlSession session;
    
    @Override
    public String getBoardName(String boardcd) throws Exception {
        
        String rs = "";
        
        rs = session.selectOne("mapper.mapperBoard.getBoardName", boardcd);
        
        return rs;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        
        ModelBoard rs = new ModelBoard();
        
        rs = session.selectOne("mapper.mapperBoard.getBoardOne", boardcd);
        
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardList(String searchWord) throws Exception {
        
        List<ModelBoard> rs = null;
        
        rs = session.selectList("mapper.mapperBoard.getBoardList", searchWord);
        
        return rs;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        
        int rs = -1;
        
        rs = session.insert("mapper.mapperBoard.insertBoard", board);
        
        return rs;
    }
    
    @Override
    public int updateBoard(ModelBoard setValue, ModelBoard whereValue)
            throws Exception {
        
        int rs = -1;
        
        Map<String, Object> map = new HashMap<>();
        
        map.put("setValue", setValue);
        map.put("whereValue", whereValue);
        
        rs = session.update("mapper.mapperBoard.updateBoard", map);
        
        return rs;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        
        int rs = -1;
        
        rs = session.delete("mapper.mapperBoard.deleteBoard", board);
        
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) throws Exception {
        
        List<ModelBoard> rs = null;
        
        rs = session.selectList("mapper.mapperBoard.getBoardSearch", board);
        
        return rs;
    }
    
    @Override
    public int getBoardTotalRecord(String boardnm) throws Exception {
        
        int rs = -1;
        
        rs = session.selectOne("mapper.mapperBoard.getBoardTotalRecord", boardnm);
        
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String searchWord,
            int start, int end) throws Exception {
        
        int rs = -1;
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("boardcd"   , StringUtils.isEmpty(boardcd)    ?  null : boardcd            );
        map.put("searchWord", StringUtils.isEmpty(searchWord) ?  null : "%"+searchWord+"%" );
        map.put("start"     , start      );
        map.put("end"       , end        );
        
        rs = session.selectList("mapper.mapperBoard.getBoardPaging", map);
        
        return rs;
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
