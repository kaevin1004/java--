package com.spring81.bbs.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring81.bbs.inf.IServiceUser;
import com.spring81.bbs.model.ModelUser;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
    
    private static final Logger logger = LoggerFactory
            .getLogger(UserController.class);
    
    @Autowired
    IServiceUser svruser;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public String home(Model model) {
        
        logger.info("/user/");
        
        return "redirect:/user/login";
    }
    
    @RequestMapping(value = "/user/login", method = RequestMethod.GET)
    public String login(Model model,
            @RequestParam(value = "url", defaultValue = "") String url,
            HttpServletRequest request) {
        
        logger.info("user/login : get");
        
        if (url.isEmpty())
            url = request.getHeader("Refer");
        
        model.addAttribute("url", url);
        
        return "user/login";
    }
    
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
       public String login(Model model, @RequestParam String url, @RequestParam String userid, @RequestParam String passwd, HttpSession session, RedirectAttributes rttr) {
           
           logger.info("user/login : post");
           
           ModelUser rs = svruser.login(userid, passwd);
           
           if(rs != null){
               
               session.setAttribute(/* 세션명 */WebConstants.SESSION_NAME,/* 세션 값 */ rs);
               
           if(url.isEmpty()){
             //로그인 성공
               return "redirect:/";
           }
           else
               return "redirect" + url;
           }
           else{
               //로그인 실패
               rttr.addFlashAttribute("msg", "로그인 실패");
               rttr.addFlashAttribute("url", url);
               
               return "redirect:/user/login";
        }
           
    }
    
    @RequestMapping(value = "/user/logout", method = RequestMethod.GET)
    public String logout(Model model, HttpSession session) {
        
        logger.info("user/logout : get");
        
        
      session.removeAttribute(WebConstants.SESSION_NAME);
        
        return "redirect:/";
    }
    
    @RequestMapping(value = "/user/register", method = RequestMethod.GET)
    public String register(Model model, HttpSession session) {
        
        logger.info("/user/register : get");
        
        
     
        
        return "/user/register";
    }
 
}
