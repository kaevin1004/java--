package com.spring66.test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class jsltController {
	
	private static final Logger logger = LoggerFactory.getLogger(jsltController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/jstl/jstl01", method = RequestMethod.GET)
	public String jstl01(Model model) {

	    logger.info("jstl01");
	   
		
		
		return "jstl/jstl01";
	}
	
	   @RequestMapping(value = "/jstl/jstl02", method = RequestMethod.GET)
	    public String jstl02(Model model) {

	        logger.info("jstl02");
	       
	        int num1 = 7;
	        int num2 = 9;
	        
	        model.addAttribute("num1", num1);
	        model.addAttribute("num2", num2);
	        
	        return "jstl/jstl02";
	    }
	   
       @RequestMapping(value = "/jstl/jstl03", method = RequestMethod.GET)
       public String jstl03(Model model) {

           logger.info("jstl03");
          
           return "jstl/jstl03";
       }
       
       @RequestMapping(value = "/jstl/jstl11", method = RequestMethod.GET)
       public String jstl11(Model model) {

           logger.info("jstl11");
          
           return "jstl/jstl11";
       }
       
       @RequestMapping(value = "/jstl/jstl21for", method = RequestMethod.GET)
       public String jstl21for(Model model) {

           logger.info("jstl21for");
          
           return "jstl/jstl21for";
       }

       @RequestMapping(value = "/jstl/jstl22foreach", method = RequestMethod.GET)
       public String jstl22foreach(Model model) {

           logger.info("jstl22foreach");
           
           String[] arr = {"된장", "김치", "무말랭이"};
           model.addAttribute("array", arr);
           
           List<String> arr1 = new ArrayList<String>();
           
           arr1.add("밥");
           arr1.add("국");
           arr1.add("반찬");
           
           model.addAttribute("list", arr1);
           
          
           return "jstl/jstl22foreach";
       }
       
       

}
