
package com.hcl.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.model.Transactions;
import com.hcl.service.TransactionServiceImpl;

@Controller
public class TransactionController {

	
	public TransactionServiceImpl custTxnServiceImpl;

	 @Autowired
	public void setCustTxnServiceImpl(TransactionServiceImpl custTxnServiceImpl) {
		this.custTxnServiceImpl = custTxnServiceImpl;
	}
	 
	 
	 @RequestMapping(value = "/getAllTxnDetails")
	    public ModelAndView listTxn(ModelAndView model) throws IOException {
	        List<Transactions> listTxnDetails = custTxnServiceImpl.getAllTxnDetails();
	        model.addObject("listTxnDetails", listTxnDetails);
	        model.setViewName("Transactions");
	        return model;
	    }
	  
	  
	  
}
