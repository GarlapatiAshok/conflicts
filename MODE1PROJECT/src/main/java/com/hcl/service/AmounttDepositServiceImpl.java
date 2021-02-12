
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AmounttDepositDao;

@Service("amtDepositService")
public class AmounttDepositServiceImpl implements AmounttDepositService {

	
	@Autowired
	private AmounttDepositDao amtDepositDao;

	public void setAmtDepositDao(AmounttDepositDao amtDepositDao) {
		this.amtDepositDao = amtDepositDao;
	}


	@Override
	public void amtWithdrawl(Long fromAccNum, Double accBal, String txnType) {
		
		amtDepositDao.amtDepositDao(fromAccNum, accBal, txnType);

	}

}
