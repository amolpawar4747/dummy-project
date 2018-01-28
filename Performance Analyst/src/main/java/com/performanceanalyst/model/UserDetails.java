package com.performanceanalyst.model;

public class UserDetails {
	private String userName,userPass,email,userMobile,reUserPass;
	private int userType,centerName;
	
	public UserDetails() {
	
	}
	public UserDetails(String userName, String userPass, String email, String userMobile, String reUserPass,
			int userType, int centerName) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.email = email;
		this.userMobile = userMobile;
		this.reUserPass = reUserPass;
		this.userType = userType;
		this.centerName = centerName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getReUserPass() {
		return reUserPass;
	}
	public void setReUserPass(String reUserPass) {
		this.reUserPass = reUserPass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getCenterName() {
		return centerName;
	}
	public void setCenterName(int centerName) {
		this.centerName = centerName;
	}
	
}
