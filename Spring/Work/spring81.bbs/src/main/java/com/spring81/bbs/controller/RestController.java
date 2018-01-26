package com.spring81.bbs.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring81.bbs.inf.IServiceBoard;
import com.spring81.bbs.inf.IServiceUser;
import com.spring81.bbs.model.ModelArticle;
import com.spring81.bbs.model.ModelAttachFile;
import com.spring81.bbs.model.ModelBoard;
import com.spring81.bbs.model.ModelComments;
import com.spring81.bbs.model.ModelUser;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/rest")
public class RestController {
	
	private static final Logger logger = LoggerFactory.getLogger(RestController.class);
	
	// ServiceUser 인스턴스 만들기
	@Autowired
	IServiceUser userservice;
	
	@Autowired
	IServiceBoard boardservice;
	
	// http://localhost:8080/rest/selectuserlist
	@RequestMapping(value = "/selectuserlist", method = {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List<ModelUser> home(Model model) {
	    logger.info("/rest/selectuserlist");
		
	    List<ModelUser> list = userservice.selectUserList(null);
	    
		return list;
	}
	
    @RequestMapping(value = "/curtime", method = RequestMethod.GET)
    @ResponseBody
    public long curtime(Model model) {
        logger.info("/rest/curtime");
        
        return new Date().getTime();
    }
    
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelUser login(String userid, String passwd) {
        logger.info("/rest/login");
        
        return userservice.login(userid, passwd);
    }
    
    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int logout(String userid) {
        logger.info("/rest/logout");
        
        return userservice.logout(userid);
    }
    
    @RequestMapping(value = "/checkuserid", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int checkuserid(String userid) {
        logger.info("/rest/checkuserid");
        
        return userservice.checkuserid(userid);
    }
    
    @RequestMapping(value = "/updatepasswd", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int updatepasswd(String userid, String currentPasswd, String newPasswd) {
        logger.info("/rest/updatepasswd");
        
        return userservice.updatePasswd(userid, currentPasswd, newPasswd);
    }
    
    @RequestMapping(value = "/insertuser", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int insertuser(@ModelAttribute ModelUser user) {
        logger.info("/rest/insertuser");
        
        return userservice.insertUser(user);
    }
    
    @RequestMapping(value = "/selectuserone", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelUser selectuserone(@ModelAttribute Model model) {
        logger.info("/rest/selectuserone");
        
        return userservice.selectUserOne(null);
    }
    
    @RequestMapping(value = "/updateuserinfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int updateuserinfo(@RequestBody Map<String, ModelUser> map) {
        logger.info("/rest/updateuserinfo");
        
        ModelUser setValue = map.get("setValue");
        ModelUser whereValue = map.get("whereValue");
        
        return userservice.updateUserInfo(setValue, whereValue);
    }
    
    @RequestMapping(value = "/updateretire", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public int updateretire(@RequestBody ModelUser user) {
        logger.info("/rest/updateretire");
        
        return userservice.updateRetire(user);
    }
    
    @RequestMapping(value= "/getboardname", method = RequestMethod.GET)
    @ResponseBody
    public String getboardname(String boardcd) {
        logger.info("/rest/getboardname");
        
        String board = boardservice.getBoardName(boardcd);
        
        return board;
    }
    /**
     * 클라이언트에서 변수명 : cd
     * 서버 변수명 : boardcd
     */
    @RequestMapping(value= "/getboardone", method = RequestMethod.GET)
    @ResponseBody
    public ModelBoard getboardone(@RequestParam("cd") String boardcd) {
        logger.info("/rest/getboardone");
        
        ModelBoard board = boardservice.getBoardOne(boardcd);
        
        return board;
    }
	
    @RequestMapping(value= "/getboardtotalrecord", method = RequestMethod.GET)
    @ResponseBody
    public int getboardtotalrecord(String searchWord) {
        logger.info("/rest/getboardtotalrecord");
        
        return boardservice.getBoardTotalRecord(searchWord);
    }
    
    @RequestMapping(value= "/getboardtotalpaging", method = RequestMethod.GET)
    @ResponseBody
    public List<ModelBoard> getboardtotalpaging(String boardcd, String searchWord, int start, int end) {
        logger.info("/rest/getboardtotalpaging");
        
        return boardservice.getBoardPaging(boardcd, searchWord, start, end);
    }
    
    @RequestMapping(value= "/getboardlist", method = RequestMethod.GET)
    @ResponseBody
    public int getboardlist(String searchWord) {
        logger.info("/rest/getboardtotalpaging");
        
        return boardservice.getBoardTotalRecord(searchWord);
    }
    
    @RequestMapping(value= "/insertboard", method = RequestMethod.GET)
    @ResponseBody
    public int insertboard(@ModelAttribute ModelBoard board) {
        logger.info("/rest/insertboard");
        
        return boardservice.insertBoard(board);
    }
    
    @RequestMapping(value= "/updateboard", method = RequestMethod.GET)
    @ResponseBody
    public int updateboard(@RequestBody ModelBoard setValue, @RequestBody ModelBoard whereValue) {
        logger.info("/rest/updateboard");
        
        return boardservice.updateBoard(setValue, whereValue);
    }
    
    @RequestMapping(value= "/deleteboard", method = RequestMethod.GET)
    @ResponseBody
    public int deleteboard(@ModelAttribute ModelBoard board) {
        logger.info("/rest/deleteboard");
        
        return boardservice.deleteBoard(board);
    }
    
    @RequestMapping(value= "/insertboardlist", method = RequestMethod.GET)
    @ResponseBody
    public int insertboardlist(@ModelAttribute List<ModelBoard> list) {
        logger.info("/rest/insertboardlist");
        
        return boardservice.insertBoardList(list);
    }
    
    @RequestMapping(value= "/getarticletotalrecord", method = RequestMethod.GET)
    @ResponseBody
    public int getarticletotalrecord(String boardcd, String searchWord) {
        logger.info("/rest/getarticletotalrecord");
        
        return boardservice.getArticleTotalRecord(boardcd, searchWord);
    }
    
    @RequestMapping(value= "/getarticlelist", method = RequestMethod.GET)
    @ResponseBody
    public List<ModelArticle> getarticlelist(String boardcd, String searchWord, int start, int end) {
        logger.info("/rest/getarticlelist");
        
        return boardservice.getArticleList(boardcd, searchWord, start, end);
    }
    
    @RequestMapping(value= "/getarticle", method = RequestMethod.GET)
    @ResponseBody
    public ModelArticle getarticle(@RequestParam(defaultValue="0")int articleno) {
        logger.info("/rest/getarticle");
        
        return boardservice.getArticle(articleno);
    }
    
    @RequestMapping(value= "/insertarticle", method = RequestMethod.GET)
    @ResponseBody
    public int insertarticle(@ModelAttribute ModelArticle article) {
        logger.info("/rest/insertarticle");
        
        return boardservice.insertArticle(article);
    }
    
    @RequestMapping(value= "/updatearticle", method = RequestMethod.GET)
    @ResponseBody
    public int updatearticle(@RequestBody ModelArticle setValue, @RequestBody ModelArticle whereValue) {
        logger.info("/rest/updatearticle");
        
        return boardservice.updateArticle(setValue, whereValue);
    }
    
    @RequestMapping(value= "/deletearticle", method = RequestMethod.GET)
    @ResponseBody
    public int deletearticle(@ModelAttribute ModelArticle article) {
        logger.info("/rest/deletearticle");
        
        return boardservice.deleteArticle(article);
    }
    
    @RequestMapping(value= "/increasehit", method = RequestMethod.GET)
    @ResponseBody
    public int increasehit(@RequestParam(defaultValue="0")int articleno) {
        logger.info("/rest/increasehit");
        
        return boardservice.increaseHit(articleno);
    }
    
    @RequestMapping(value= "/getnextarticle", method = RequestMethod.GET)
    @ResponseBody
    public ModelArticle getnextarticle(@RequestParam(defaultValue="0")int articleno, String boardcd, String searchWord) {
        logger.info("/rest/getnextarticle");
        
        return boardservice.getNextArticle(articleno, boardcd, searchWord);
    }
    
    @RequestMapping(value= "/getprevarticle", method = RequestMethod.GET)
    @ResponseBody
    public ModelArticle getprevarticle(@RequestParam(defaultValue="0")int articleno, String boardcd, String searchWord) {
        logger.info("/rest/getprevarticle");
        
        return boardservice.getPrevArticle(articleno, boardcd, searchWord);
    }
    
    @RequestMapping(value= "/getattachfile", method = RequestMethod.GET)
    @ResponseBody
    public ModelAttachFile getattachfile(@RequestParam(defaultValue="0")int attachFileNo) {
        logger.info("/rest/getattachfile");
        
        return boardservice.getAttachFile(attachFileNo);
    }
    
    @RequestMapping(value= "/getattachfilelist", method = RequestMethod.GET)
    @ResponseBody
    public List<ModelAttachFile> getattachfilelist(@RequestParam(defaultValue="0")int articleno) {
        logger.info("/rest/getattachfilelist");
        
        return boardservice.getAttachFileList(articleno);
    }
    
    @RequestMapping(value= "/insertattachfile", method = RequestMethod.GET)
    @ResponseBody
    public int insertattachfile(@ModelAttribute ModelAttachFile attachFile) {
        logger.info("/rest/insertattachfile");
        
        return boardservice.insertAttachFile(attachFile);
    }
    
    @RequestMapping(value= "/deleteattachfile", method = RequestMethod.GET)
    @ResponseBody
    public int deleteattachfile(@ModelAttribute ModelAttachFile attachFile) {
        logger.info("/rest/deleteattachfile");
        
        return boardservice.deleteAttachFile(attachFile);
    }
    
    @RequestMapping(value= "/getcomment", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ModelComments getcomment(@RequestParam(defaultValue="0")int commentNo) {
        logger.info("/rest/getcomment");
        
        return boardservice.getComment(commentNo);
    }
    
    @RequestMapping(value= "/getcommentlist", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public List<ModelComments> getcommentlist(@RequestParam(defaultValue="0") int articleno) {
        logger.info("/rest/getcommentlist");
        
        return boardservice.getCommentList(articleno);
    }
    
    @RequestMapping(value= "/insertcomment", method = RequestMethod.POST)
    //@ResponseBody
    public String insertcomment(Model model, @RequestBody ModelComments comment) {
        logger.info("/rest/insertcomment");
        
        int commentno = boardservice.insertComment(comment);
        
        ModelComments rs = boardservice.getComment(commentno);
        
        model.addAttribute("comment", rs);
        
        return "board/articleview-commentlistbody";
    }
    
    @RequestMapping(value= "/updatecomment", method = RequestMethod.POST)
    @ResponseBody
    public int updatecomment(@RequestBody ModelComments comment) {
        logger.info("/rest/updatecomment");
        
        ModelComments setValue = new ModelComments();
        setValue.setMemo(comment.getMemo());
        
        ModelComments whereValue = new ModelComments();
        whereValue.setCommentno(comment.getCommentno());
        return boardservice.updateComment(setValue, whereValue);
    }
    
    @RequestMapping(value= "/deletecomment", method = RequestMethod.POST)
    @ResponseBody
    public int deletecomment(@ModelAttribute ModelComments comment) {
        logger.info("/rest/deletecomment");
        
        return boardservice.deleteComment(comment);
    }
    
    
}
