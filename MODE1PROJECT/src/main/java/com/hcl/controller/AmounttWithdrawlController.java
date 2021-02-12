
package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hcl.service.AmounttWithdrawlService;
import com.hcl.service.FundTransaferService;

@Controller
public class AmounttWithdrawlController {

	
	public AmounttWithdrawlService amtWithdrawlService;
	
	 @Autowired
		public AmounttWithdrawlController(AmounttWithdrawlService amtWithdrawlService)
		{
			this.amtWithdrawlService=amtWithdrawlService;
		}

	 
	 @RequestMapping(value = "/amtWithDraw", method = RequestMethod.GET)
		public String showLogin() {
		System.out.println("login");
			return "AmountWithdrawl";
		}

		
		@RequestMapping(value="/amtWthdrawlValidate")
		public ModelAndView validate(@RequestParam("accnum") String accnum,@RequestParam("amtWithdrawl") String amtWithdrawl,javax.servlet.http.HttpSession session,RedirectAttributes redirectAttributes) {
			
			try {
			ModelAndView mv1=new ModelAndView();
			
			Long accNum=Long.parseLong(accnum);
			Double amtWithdraw=Double.parseDouble(amtWithdrawl);
			String txnType="SAVINGSBANK";
			
			amtWithdrawlService.amtWithdrawl(accNum, amtWithdraw, txnType);
			
			}catch (Exception e) {
				e.printStackTrace();
				redirectAttributes.addFlashAttribute("message", "Failure occured during Amount Transfer!");
			}
			
			return new ModelAndView("AmountWithdrawl", "message", "YOU HAVE SUCCESSFULLY TRANSFERD!!");
		}
		
}
