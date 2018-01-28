package com.performanceanalyst.services;

import com.performanceanalyst.model.LoginDetails;
import com.performanceanalyst.model.UserDetails;

public interface ILoginInterface {
	public boolean isUser(LoginDetails userLoginDetails);
	public boolean  insertUser(UserDetails userDetails);
}
