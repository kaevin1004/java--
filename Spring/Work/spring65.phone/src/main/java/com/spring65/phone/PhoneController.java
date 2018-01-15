package com.spring65.phone;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring65.phone.inf.IServicePhone;
import com.spring65.phone.model.ModelPhone;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PhoneController {
    
    private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
    
    @Autowired
    IServicePhone svrphone;
    
    /**
     * Phone/writeone
      /Phone/writeone1
      /Phone/writeone2
      /Phone/writeone3
      /Phone/writeone4
     */
    @RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
    public String writeone(Model model) {
        
        logger.info("writeone");
        
        return "phone/writeone";
    }
    
    @RequestMapping(value = "/phone/writeone1", method = RequestMethod.POST)
    public String writeone1(Model model, HttpServletRequest request) {
        
        logger.info("writeone1");
        String name = request.getParameter("name");
        String manufacturer = request.getParameter("manufacturer");
        String temp = request.getParameter("price");
        int price = Integer.valueOf(temp.isEmpty() ? "0" : temp);
        
        ModelPhone phone = new ModelPhone(name, manufacturer, price);
        svrphone.insertPhone(phone );
        
                
        model.addAttribute("phone", phone);
        
        return "phone/writeoneresult";
    }
    
    @RequestMapping(value = "/phone/writeone2", method = RequestMethod.POST)
    public String writeone2(Model model, @RequestParam(value="name") String name2, @RequestParam(value="manufacturer") String manufacturer2, @RequestParam(value="price", defaultValue="0") Integer price2) {
        
        logger.info("writeone2");
        
        ModelPhone phone = new ModelPhone(name2, manufacturer2, price2);
        svrphone.insertPhone(phone );
        
                
        model.addAttribute("phone", phone);
        
        return "phone/writeoneresult";
    }
    
    @RequestMapping(value = "/phone/writeone3", method = RequestMethod.POST)
    public String writeone3(Model model, @ModelAttribute ModelPhone phone) {
        
        logger.info("writeone3");
        
  
        svrphone.insertPhone(phone );
        
                
        model.addAttribute("phone", phone);
        
        return "phone/writeoneresult";
    }
    
    @RequestMapping(value = "/phone/writelist", method = RequestMethod.GET)
    public String writelist(Model model) {
        
        logger.info("writelist");
        
        return "phone/writelist";
    }
    
    @RequestMapping(value = "/phone/writelist", method = RequestMethod.POST)
    public String writelist(Model model, @ModelAttribute(value="phoneItems") RepositoryPhone phones) {
                
        logger.info("writelist :: post");
        List<ModelPhone> list = phones.getPhoneItems();
        
        svrphone.insertPhoneList(list);
        
        model.addAttribute("list", list);
        
        return "phone/writelistresult";
    }
    
    
}
