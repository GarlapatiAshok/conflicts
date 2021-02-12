
package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTREG")
public class AccReg {

	@Id
	@Column(name="ACCOUNTNUMBER")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="NAME")
	private String name;
	@Column(name="FATHERNAME")
	private String fatherName;
	@Column(name="GENDER")
	private String gender;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="DATEOFBIRTH")
    private String dob;
	@Column(name="MOBILENUMBER")
    private String mobilenumber;
	@Column(name="EMAIL")
    private String email;
	@Column(name="PAN")
    private String pan;
	@Column(name="AADHAR")
    private String aadhar;
	@Column(name="PASSWORD")
    private String password;
	
	 

	public AccReg() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFatherName() {
		return fatherName;
	}



	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getMobilenumber() {
		return mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPan() {
		return pan;
	}



	public void setPan(String pan) {
		this.pan = pan;
	}



	public String getAadhar() {
		return aadhar;
	}



	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public AccReg(Long id, String name, String fatherName, String gender, String address, String dob,
			String mobilenumber, String email, String pan, String aadhar, String password) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.gender = gender;
		this.address = address;
		this.dob = dob;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.pan = pan;
		this.aadhar = aadhar;
		this.password = password;
	}



	@Override
	public String toString() {
		return "AccReg [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", gender=" + gender
				+ ", address=" + address + ", dob=" + dob + ", mobilenumber=" + mobilenumber + ", email=" + email
				+ ", pan=" + pan + ", aadhar=" + aadhar + ", password=" + password + "]";
	}

	
}
