package com.performanceanalyst.services;

import org.springframework.stereotype.Service;

import com.performanceanalyst.dao.LoginDao;
import com.performanceanalyst.model.LoginDetails;
import com.performanceanalyst.model.UserDetails;

@Service
public class LoginService implements ILoginInterface {

	@Override
	public boolean isUser(LoginDetails userLoginDetails) {
		LoginDao logindao= new LoginDao();
		 UserDetails userDetails=logindao.isUser(userLoginDetails);
		if(userLoginDetails.getUserName().equals(userLoginDetails.getUserName()) && userLoginDetails.getPassword().equals(userLoginDetails.getPassword()))
		{
			
			return true;
		}
		else{
		return false;
		}
	}

	@Override
	public boolean insertUser(UserDetails userDetails) {
		LoginDao logindao= new LoginDao();
		boolean b=logindao.insertUser(userDetails);
		return b;
	}

	
}
