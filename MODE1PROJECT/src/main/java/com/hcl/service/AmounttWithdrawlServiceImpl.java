
package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.AmountWithdrawlDao;

@Service("amtWithdrawlService")
public class AmounttWithdrawlServiceImpl implements AmounttWithdrawlService {

	@Autowired
	private AmountWithdrawlDao amtWithdrawlDao;
	
	public void setAmtWithdrawlDao(AmountWithdrawlDao amtWithdrawlDao) {
		this.amtWithdrawlDao = amtWithdrawlDao;
	}


	@Override
	public void amtWithdrawl(Long fromAccNum, Double accBal, String txnType) {
		
		amtWithdrawlDao.amtWithdrawl(fromAccNum, accBal, txnType);
	}

}
