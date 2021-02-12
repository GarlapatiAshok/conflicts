
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AccCreateDao;

@Service("accountRegService")
public class AccCreateServiceImpl implements AccCreateService {

	 @Autowired
	private AccCreateDao accountRegDao;
	 
	public void setAccountRegDao(AccCreateDao accountRegDao) {
		this.accountRegDao = accountRegDao;
	}


	@Override
	public void register(String name, String fatherName, String gender, String address, String dob, String mobilenumber, String email,
			String pan, String aadhar, String password) {
		
		accountRegDao.register(name, fatherName, gender, address, dob, mobilenumber, email, pan, aadhar, password);

	}
	
	public void accInsrt() {
		
		accountRegDao.accInsrt();
	}
	
		
	
}
