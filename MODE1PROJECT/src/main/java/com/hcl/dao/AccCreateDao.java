
package com.hcl.dao;

public interface AccCreateDao {

	public void register(String name, String fatherName,String gender, String address, String dob,String mobilenumber, String email,
			String pan, String aadhar, String password);

	public void accInsrt();
	
	
}
