package com.spring81.bbs.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Insert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring81.bbs.common.PagingHelper;
import com.spring81.bbs.common.WebConstants;
import com.spring81.bbs.inf.IServiceBoard;
import com.spring81.bbs.model.ModelArticle;
import com.spring81.bbs.model.ModelAttachFile;
import com.spring81.bbs.model.ModelBoard;
import com.spring81.bbs.model.ModelComments;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	IServiceBoard srvboard;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/board/boardlist", method = RequestMethod.GET)
	public String boardlist(Model model, @RequestParam(defaultValue="") String searchWord, @RequestParam(defaultValue="1") Integer curPage) {
		logger.info("/board/boardlist");
		
		//전체 레코드 수 가져오기.
		int totalRecord = srvboard.getBoardTotalRecord(searchWord);
		
		//페이징을 위한 코드 추가.
		PagingHelper paging = new PagingHelper(totalRecord, curPage, 5, 5);
		        

		List<ModelBoard> rs = srvboard.getBoardPaging("", searchWord, paging.getStartRecord(), paging.getEndRecord());
		
		
		model.addAttribute("list", rs);
		
		//페이징을 위한 변수들 추가
		model.addAttribute("curPage", curPage);
		model.addAttribute("searchWord", searchWord);
		
		//페이징 처리하기 위한 변수 추가
		model.addAttribute("no", paging.getListNo());
		model.addAttribute("prevLink", paging.getPrevLink());
		model.addAttribute("pageLinks", paging.getPageLinks());
		model.addAttribute("nextLink", paging.getNextLink());
		
		
		return "board/boardlist";
	}
	
	//  /board/boardview <==> /board/boardview?boardcd=free
	
    @RequestMapping(value = "/board/boardview", method = RequestMethod.GET)
    public String boardview(Model model, @RequestParam(defaultValue="free") String boardcd) {
        logger.info("/board/boardview");

        ModelBoard rs = srvboard.getBoardOne(boardcd);
        String boardNm = srvboard.getBoardName(boardcd);
        
        //model.addAttribute("boardNm", srvboard.getBoardName(boardcd));
        model.addAttribute("boardNm", rs.getBoardnm());
        model.addAttribute("board", rs);
        
        return "board/boardview";
    }
    
    @RequestMapping(value = "/board/boardview/{boardcd}", method = RequestMethod.GET)
    public String boardviewPath(Model model,@PathVariable(value="boardcd") String boardcd) {
        logger.info("/board/boardview");

        ModelBoard rs = srvboard.getBoardOne(boardcd);
        String boardNm = srvboard.getBoardName(boardcd);
        
        //model.addAttribute("boardNm", srvboard.getBoardName(boardcd));
        model.addAttribute("boardNm", rs.getBoardnm());
        model.addAttribute("board", rs);
        
        return "board/boardview";
    }
    
    @RequestMapping(value = "/board/boardmodify", method = RequestMethod.GET)
    public String boardmodify(Model model, @RequestParam(defaultValue="free") String boardcd, HttpServletRequest request) {
        logger.info("/board/boardmodify");

        ModelBoard rs = srvboard.getBoardOne(boardcd);
       
        
        String actionurl = request.getRequestURI().toString();
        
        //model.addAttribute("boardNm", srvboard.getBoardName(boardcd));
        model.addAttribute("boardNm", rs.getBoardnm());
        model.addAttribute("board", rs);
        model.addAttribute("actionurl", actionurl);
        
        return "board/boardmodify";
    }
    
    @RequestMapping(value = "/board/boardmodify/{boardcd}", method = RequestMethod.GET)
    public String boardmodifyPath(Model model, @PathVariable(value="boardcd") String boardcd, HttpServletRequest request) {
        logger.info("/board/boardmodify/{boardcd}");

        ModelBoard rs = srvboard.getBoardOne(boardcd);
       
        
        String actionurl = request.getRequestURI().toString();
        
        //model.addAttribute("boardNm", srvboard.getBoardName(boardcd));
        model.addAttribute("boardNm", rs.getBoardnm());
        model.addAttribute("board", rs);
        model.addAttribute("actionurl", actionurl);
        
        return "board/boardmodify";
    }
    
    @RequestMapping(value = "/board/boardmodify", method = RequestMethod.POST)
    public String boardmodify(Model model, @ModelAttribute ModelBoard setValue, RedirectAttributes rttr) {
        logger.info("/board/boardmodify");
        
        ModelBoard whereValue = new ModelBoard();
        whereValue.setBoardcd(setValue.getBoardcd());

        int rs = srvboard.updateBoard(setValue, whereValue);
        
        if(rs > 0){
            return "redirect:/board/bardlist";
        }
        else{
            //RedirectAttibutes 를 이용한 오류 메시지 전달
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_UPDATE_TABLE);
            rttr.addFlashAttribute("boardcd", setValue.getBoardcd());
            return "redirect:/board/boardmodify";
        }
        
        
    }
    
    @RequestMapping(value = "/board/boardwrite", method = RequestMethod.GET)
    public String boardwrite(Model model ) {
        logger.info("/board/boardwrite");

        return "board/boardwrite";
    }
	   
	   
    @RequestMapping(value = "/board/boardwrite", method = RequestMethod.POST)
    public String boardwrite(Model model, @ModelAttribute ModelBoard board, RedirectAttributes rttr) {
        logger.info("/board/boardwrite");
        
        int rs = srvboard.insertBoard(board);
        
        if(rs > 0){
            return "redirect:/board/boardview/" + board.getBoardcd();
        }
        else{
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_INSERT_TABLE);
            rttr.addFlashAttribute("board", board);
            return "redirect:/board/boardwrite";
        }

        
    }
    
    @RequestMapping(value = "/board/boarddelete", method = RequestMethod.POST)
    public String boarddelete(Model model, @RequestParam(value="boardcd") String boardcd, RedirectAttributes rttr) {
        logger.info("/board/boarddelete");
        
        ModelBoard board = new ModelBoard();
        board.setBoardcd(boardcd);
        
        int rs = srvboard.insertBoard(board);
        
        if(rs > 0){
            
            return "redirect:/board/boardview/" + board.getBoardcd();
        }
        
        else{
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_DELETE_TABLE);
            rttr.addFlashAttribute("board", board);
            
            return "redirect:/board/boardwrite";
        }
      
           
      }
    
    @RequestMapping(value = "/board/articlelist", method = RequestMethod.GET)
    public String articlelist(Model model, @RequestParam(defaultValue="free") String boardcd) {
        logger.info("/board/articlelist");
        
        return "redirect:/board/articlelist/" + boardcd;
    }
        
    
    @RequestMapping(value = "/board/articlelist/{boardcd}", method = RequestMethod.GET)
    public String articlelist(Model model, @PathVariable String boardcd, @RequestParam(defaultValue="1") Integer curPage, @RequestParam(defaultValue="") String searchWord, HttpServletRequest request) {
        logger.info("/board/articlelist");
        
        
        int totalRecord = srvboard.getArticleTotalRecord(boardcd, searchWord);
        PagingHelper paging = new PagingHelper(totalRecord, curPage);
        
        int start = paging.getStartRecord();
        int end = paging.getEndRecord();
        
        List<ModelArticle> rs = srvboard.getArticleList(boardcd, searchWord, start, end);
        
        model.addAttribute("boardnm", srvboard.getBoardName(boardcd));
        model.addAttribute("boardcd", boardcd);
        model.addAttribute("searchWord", searchWord);
        model.addAttribute("articleList", rs);
        model.addAttribute("curPage", curPage);
        model.addAttribute("url", request.getRequestURL().toString());
        
        
        
        
        model.addAttribute("no", paging.getListNo());
        model.addAttribute("prevLink", paging.getPrevLink());
        model.addAttribute("pageLinks", paging.getPageLinks());
        model.addAttribute("nextLink", paging.getNextLink());
        
        
        
        return "board/articlelist";
    }
    
    @RequestMapping(value = "/board/articleview/{boardcd}/{articleno}", method = RequestMethod.GET)
    public String articleview(Model model
            , @PathVariable String boardcd
            , @PathVariable Integer articleno
            , @RequestParam(defaultValue="1") Integer curPage
            , @RequestParam(defaultValue="") String searchWord
            , HttpServletRequest request) {
        logger.info("/board/articleview");
        
       
        
        model.addAttribute("boardcd", boardcd);
        model.addAttribute("articleno", articleno);
        model.addAttribute("curPage", curPage);
        model.addAttribute("searchWord", searchWord);
        
        
        model.addAttribute("boardnm", srvboard.getBoardName(boardcd));
        
        ModelArticle thisArticle = srvboard.transArticle(articleno);
        model.addAttribute("thisArticle", thisArticle);
        
        List<ModelAttachFile> attachFileList = srvboard.getAttachFileList(articleno);
        model.addAttribute("attachFileList", attachFileList);
        
        List<ModelComments> commentList = srvboard.getCommentList(articleno);
        model.addAttribute("commentList", commentList);
        
        ModelArticle nextArticle = srvboard.getNextArticle(articleno, boardcd, searchWord);
        model.addAttribute("nextArticle", nextArticle);
        
        ModelArticle prevArticle = srvboard.getPrevArticle(articleno, boardcd, searchWord);
        model.addAttribute("prevArticle", prevArticle);
        
        //페이징 처리
        int totalRecord = srvboard.getArticleTotalRecord(boardcd, searchWord);
        PagingHelper paging = new PagingHelper(totalRecord, curPage);
        int start = paging.getStartRecord();
        int end = paging.getEndRecord();
        
        
        List<ModelArticle> articleList = srvboard.getArticleList(boardcd, searchWord, start, end);
        
        model.addAttribute("articleList", articleList);
        model.addAttribute("no", paging.getListNo());
        model.addAttribute("prevPage", paging.getPrevLink());
        model.addAttribute("pageLinks", paging.getPageLinks());
        model.addAttribute("nextLink", paging.getNextLink());
        
        
        String actionurl = request.getRequestURI().toString();
        model.addAttribute("actionurl", paging.getNextLink());
        
        return "board/articleview";
    }
    
    @RequestMapping(value = "/board/articlewrite/{boardcd}", method = RequestMethod.GET)
    public String articlewrite(Model model
            , @PathVariable String boardcd
            , @RequestParam(defaultValue="1") Integer curPage
            , @RequestParam(defaultValue="") String searchWord
            , HttpServletRequest request) {
        logger.info("/board/articlewrite");
        
        model.addAttribute("", srvboard.getBoardName(boardcd));
        model.addAttribute("boardcd", boardcd);
        
        return "board/articlewrite";
    }
    
    @RequestMapping(value = "/board/articlewrite", method = RequestMethod.POST)
    public String articlewrite(Model model
            , @ModelAttribute ModelArticle article
            , @RequestParam(defaultValue="upload") MultipartFile upload
            , @RequestParam(defaultValue="1") Integer curPage
            , @RequestParam(defaultValue="") String searchWord) {
        logger.info("/board/articlewrite :: post");
        
        //1. tb_bbs_article table Insert.class inserted pk 값을 반환 받는다.
        //2. client의 파일을 server로 upload
        //3. tb_bbs_attachfile 테이블에 insert.
        
        int insertedpk = srvboard.insertArticle(article);
       
        
        if(!upload.getOriginalFilename().isEmpty()){
            
            java.io.File uploadDir = new java.io.File(WebConstants.UPLOAD_PATH);
            if(!uploadDir.exists()){ 
                uploadDir.mkdir();
            }
            
            String fileName = upload.getOriginalFilename();
            String tempName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            String newFile = WebConstants.UPLOAD_PATH + tempName;
            java.io.File serverfile = new java.io.File(newFile);
            
            try {
                upload.transferTo(serverfile);
            } catch (IllegalStateException e) {
                logger.error("articlewrite" + e.getMessage());
                e.printStackTrace();
                
            } catch (IOException e) {
                logger.error("articlewrite" + e.getMessage());
                e.printStackTrace();
                
            }
            // 파일을 서버로 복사 성공 여부체크.
            // 성공한 경우면 tb_bba_attachfile 테이블에 insert
            if(serverfile.exists()){
                
                ModelAttachFile attachFile = new ModelAttachFile();
                attachFile.setArticleno(insertedpk);
                attachFile.setFilenameorig(fileName);
                attachFile.setFilenametemp(tempName);
                attachFile.setFilesize(serverfile.length());
                attachFile.setFiletype(upload.getContentType());
                
                int rs = srvboard.insertAttachFile(attachFile);
                
            }
            
        }
        String url = String.format("redirect:/board/articleview/%s/%d", article.getBoardcd(), insertedpk);
        return url;
    }
    
    @RequestMapping(value = "/board/articlemodify/{boardcd}/{articleno}", method = RequestMethod.GET)
    public String articlemodify(Model model, @PathVariable String boardcd
                                           , @PathVariable Integer articleno
                                           , @RequestParam(defaultValue="1") Integer curPage
                                           , @RequestParam(defaultValue="") String searchWord
                                           , HttpServletRequest request) {
        logger.info("/board/articlemodify :: get");
        
        
        
        
        
        model.addAttribute("actionurl", request.getRequestURL().toString());
        
        model.addAttribute("boardnm", srvboard.getBoardName(boardcd));
        model.addAttribute("boardcd", boardcd);
        model.addAttribute("articleno",articleno);
        model.addAttribute("curPage", curPage);
        model.addAttribute("searchWord", searchWord);
        
        model.addAttribute("thisArticle", srvboard.getArticle(articleno));
        model.addAttribute("attachFileList", srvboard.getAttachFileList(articleno));
        
        
        
        return "redirect:/board/articlelist/" + boardcd;
    }
    
    @RequestMapping(value = "/board/deleteattachfile", method = RequestMethod.POST)
    @ResponseBody
    public int deleteattachfile(Model model
                                   , @RequestParam Integer attachfileno) {
        logger.info("/board/deleteattachfile :: post");
        
        ModelAttachFile attachFile = new ModelAttachFile();
        
        attachFile.setAttachfileno(attachfileno);
        
        int rs = srvboard.deleteAttachFile(attachFile);
        
            return rs;
        }
    
    @RequestMapping(value = "/board/articlemodify/{boardcd}/{articleno}", method = RequestMethod.POST)
    public String articlemodify(Model model
            , @ModelAttribute ModelArticle setValue
            , @RequestParam(defaultValue="upload") MultipartFile upload
            , @RequestParam(defaultValue="1") Integer curPage
            , @RequestParam(defaultValue="") String searchWord) {
        logger.info("/board/articlemodify :: post");
        
        //1. tb_bbs_article table Insert.class inserted pk 값을 반환 받는다.
        //2. client의 파일을 server로 upload
        //3. tb_bbs_attachfile 테이블에 insert.
        
        
        if(!upload.getOriginalFilename().isEmpty()){
            
            java.io.File uploadDir = new java.io.File(WebConstants.UPLOAD_PATH);
            if(!uploadDir.exists()){ 
                uploadDir.mkdir();
            }
            
            String fileName = upload.getOriginalFilename();
            String tempName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            String newFile = WebConstants.UPLOAD_PATH + tempName;
            java.io.File serverfile = new java.io.File(newFile);
            
            try {
                upload.transferTo(serverfile);
            } catch (IllegalStateException e) {
                logger.error("articlewrite" + e.getMessage());
                e.printStackTrace();
                
            } catch (IOException e) {
                logger.error("articlewrite" + e.getMessage());
                e.printStackTrace();
                
            }
            // 파일을 서버로 복사 성공 여부체크.
            // 성공한 경우면 tb_bba_attachfile 테이블에 insert
            if(serverfile.exists()){
                
                ModelAttachFile attachFile = new ModelAttachFile();
                attachFile.setArticleno(setValue.getArticleno());
                attachFile.setFilenameorig(fileName);
                attachFile.setFilenametemp(tempName);
                attachFile.setFilesize(serverfile.length());
                attachFile.setFiletype(upload.getContentType());
                
                int rs = srvboard.insertAttachFile(attachFile);
                
            }
            
        }
        
        ModelArticle whereValue = new ModelArticle(setValue.getArticleno());
        int rs = srvboard.updateArticle(setValue, whereValue);
        
        String url = String.format("redirect:/board/articlemodify/%s/%d", setValue.getBoardcd(), setValue.getArticleno());
        return url;
    }
    
    @RequestMapping(value = "/board/articledelete/{boardcd}/{articleno}", method = RequestMethod.POST)
    public String articledelete(Model model
            , @PathVariable String boardcd
            , @PathVariable Integer articleno
            , @RequestParam(defaultValue="1") Integer curPage
            , @RequestParam(defaultValue="") String searchWord 
            , RedirectAttributes rttr) {
        logger.info("/board/articledelete :: post");
        
        int rs = srvboard.transDeleteArticle(articleno);
        
        String url = "";
        
        if(rs == 1){
            url = String.format("redirect:/board/articlelist/%s?curPage=%d&searchWord=%s", boardcd, curPage, searchWord);
        }
        else{
            rttr.addFlashAttribute("msg", WebConstants.MSG_FAIL_DELETE_ARTICLE);
            rttr.addAttribute("curPage", curPage);
            rttr.addAttribute("searchWord", searchWord);
            url = String.format("redirect:/board/articleview/%s/%d", boardcd, articleno);
        }
        
        
        return url;
    }
       
}
	

