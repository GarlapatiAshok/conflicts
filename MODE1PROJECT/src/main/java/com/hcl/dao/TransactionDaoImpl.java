
package com.hcl.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Transactions;

@Repository("custTxnDao")
public class TransactionDaoImpl implements TransactionDao {

	
	@Autowired
    private SessionFactory sessionFactory;
	
	
	@Override
	public List<Transactions> getAllTxnDetails() {
		
		
		Session session = sessionFactory.openSession();
		List<Transactions> txnList = new ArrayList<Transactions>();
		try {

			String SQL_QUERY = "from Transactions";
			Query query = session.createQuery(SQL_QUERY);
			java.util.List list = query.list();
			System.out.println(list);
			Iterator it = query.iterate();
			while (it.hasNext()) {
				Transactions obj = (Transactions) it.next();
				// System.out.println("Id
				// :"+s.getId()+"FirstName"+s.getFirstName+"LastName"+s.getLastName);
				obj.getTxnId();
				obj.getTxnDttm();
				obj.getAccNum();
				obj.getDescription();
				obj.getWithdrawl();
				obj.getDeposit();
				obj.getAccBal();
				obj.getRemarks();
				obj.getTxnType();
				txnList.add(obj);
			}
		
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return txnList;
	}


}
