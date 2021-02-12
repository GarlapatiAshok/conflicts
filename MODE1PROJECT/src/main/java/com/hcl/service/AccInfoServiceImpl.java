
package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AccInfoDao;
import com.hcl.model.AccInfo;

@Service("accountDetailsService")
//@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class AccInfoServiceImpl implements AccInfoService{

	@Autowired
	private AccInfoDao accountDetailsDao;
	
	public void setAccountDetailsDao(AccInfoDao accountDetailsDao) {
		this.accountDetailsDao = accountDetailsDao;
	}

	//@Transactional(readOnly=true)
	public List<AccInfo> getAllAccountDetails(){
		
		return accountDetailsDao.getAllAccountDetails();
		
	}
	
}
