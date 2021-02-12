
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

import com.hcl.model.AccInfo;

@Repository("accountDetailsDao")
public class AccInfoDaoImpl implements AccInfoDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<AccInfo> getAllAccountDetails() {
		
		Session session = sessionFactory.openSession();
		List<AccInfo> accList = new ArrayList<AccInfo>();
		try {

			String SQL_QUERY = "from AccInfo";
			Query query = session.createQuery(SQL_QUERY);
			java.util.List list = query.list();
			System.out.println(list);
			Iterator it = query.iterate();
			while (it.hasNext()) {
				AccInfo obj = (AccInfo) it.next();
				obj.getCustomerId();
				obj.getAccnum();
				obj.getBranchName();
				obj.getIfscCode();
				obj.getAccType();
				obj.getAccBal();
				accList.add(obj);
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return accList;
	}

}
