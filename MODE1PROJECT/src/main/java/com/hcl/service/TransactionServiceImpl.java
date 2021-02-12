
package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.TransactionDao;
import com.hcl.model.Transactions;

@Service("custTxnService")
public class TransactionServiceImpl implements TransactionService {

	
	@Autowired
	private TransactionDao custTxnDao;

	public void setCustTxnDao(TransactionDao custTxnDao) {
		this.custTxnDao = custTxnDao;
	}




	@Override
	public List<Transactions> getAllTxnDetails() {
		
		
		return custTxnDao.getAllTxnDetails();
	}

}
