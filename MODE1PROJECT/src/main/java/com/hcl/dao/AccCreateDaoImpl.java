
package com.hcl.dao;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hcl.model.AccReg;

@Repository("accountRegDao")
public class AccCreateDaoImpl implements AccCreateDao {

	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}
	
	Long accNum=0L;
	Long custId=0L;
	String branchName=null;
	String ifscCode=null;
	
	@Override
	public void register(String name, String fatherName, String gender, String address, String dob, String mobilenumber, String email,
			String pan, String aadhar, String password) {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		try {
			AccReg accRegister = new AccReg();
			accRegister.setName(name);
			accRegister.setFatherName(fatherName);
			accRegister.setGender(gender);
			accRegister.setAddress(address);
			accRegister.setDob(dob);
			accRegister.setMobilenumber(mobilenumber);
			accRegister.setEmail(email);
			accRegister.setPan(pan);
			accRegister.setAadhar(aadhar);
			accRegister.setPassword(password);
			
			session.save(accRegister);
			session.flush();
			session.clear();
			beginTransaction.commit();
		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			session.close();
		}

	}
	
	
	public void accInsrt() {
		
		Session session = sessionFactory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		try {
			
			 String SQL_QUERY ="select ar.id from AccReg ar order by ar.id desc"; 
			 Query query = session.createQuery(SQL_QUERY);
			
			 java.util.List list = query.list();
				System.out.println(list);

				 accNum=(Long) list.get(0);
				System.out.println(accNum);

					String SQL_QUERY1 ="insert into AccInfo(accnum) values("+ accNum +")"; 
					 Query query1 = session.createSQLQuery(SQL_QUERY1);
					 query1.executeUpdate();		
		
			session.flush();
			session.clear();
			beginTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


}
