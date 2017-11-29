package board.inf;

import java.util.List;

public interface IBoard {
    
    String getBoardName(string name) throws Exception;
    List<ModelBoard> getBoardOne(ModelBoard board) throws Exception;
    List<ModelBoard> getBoardList(ModelBoard board) throws Exception;
    int insertBoard(ModelBoard board) throws Exception;
    int updateBoard(ModelBoard updateValue, ModelBoard searchValue) throws Exception;
    int deleteBoard(ModelBoard board) throws Exception;
    List<ModelBoard> getBoardSearch(ModelBoard boardcd, ModelBoard boardnm) throws Exception;
    int getBoardTotalRecord(ModelBoard boardcd, ModelBoard searchWord) throws Exception;
    List<ModelBoard> getBoardPaging(ModelBoard boardcd, ModelBoard boardnm, ModelBoard UseYN) throws Exception;
    int insertBoardList(String boardcd, String boardnm, int UseYN) throws Exception;
    
    int getArticleTotalRecord(ModelBoard boardcd, ModelBoard searchWord) throws Exception;
    List<ModelArticle> getArticleList( ) throws Exception;
    
    
}
