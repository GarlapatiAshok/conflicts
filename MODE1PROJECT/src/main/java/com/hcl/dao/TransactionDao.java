
package com.hcl.dao;

import java.util.List;

import com.hcl.model.Transactions;

public interface TransactionDao {

	public List<Transactions> getAllTxnDetails();
	
}
