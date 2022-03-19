package com.bookstore.entity;


import java.sql.Timestamp;

public class User {
	String first_name;
	String address;
	String email;
	String uname;
	String pass;
	Timestamp regdate;
	
	public User() {
	}
	public User(String first_name, String address, String email, String uname, String pass, Timestamp regdate) {
		this.first_name = first_name;
		this.address = address;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
		this.regdate = regdate;
	}
	
	public User(String first_name, String address, String email, String uname, String pass) {
		super();
		this.first_name = first_name;
		this.address = address;
		this.email = email;
		this.uname = uname;
		this.pass = pass;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", address=" + address + ", email=" + email + ", uname=" + uname
				+ ", pass=" + pass + ", regdate=" + regdate + "]";
	}
	
}
