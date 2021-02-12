
package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.AccInfo;
import com.hcl.service.AccInfoService;

@Controller
public class AccInfoController {

	public AccInfoService accountDetailsService;
	 
	  @Autowired
		public AccInfoController(AccInfoService accountDetailsService)
		{
			this.accountDetailsService=accountDetailsService;
		}
	  
	  @RequestMapping(value = "/getAllAccDetails")
	    public ModelAndView listEmployee(ModelAndView model) throws IOException {
	        List<AccInfo> listAccDetails = accountDetailsService.getAllAccountDetails();
	        model.addObject("listAccDetails", listAccDetails);
	        model.setViewName("AllAccInfo");
	        return model;
	    }
	  
}
