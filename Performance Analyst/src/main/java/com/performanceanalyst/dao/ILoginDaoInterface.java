package com.performanceanalyst.dao;

import com.performanceanalyst.model.LoginDetails;
import com.performanceanalyst.model.UserDetails;

public interface ILoginDaoInterface {
	public UserDetails isUser(LoginDetails userLoginDetails);
	public boolean  insertUser(UserDetails userDetails);
	
}
