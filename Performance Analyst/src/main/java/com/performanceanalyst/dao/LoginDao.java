package com.performanceanalyst.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.performanceanalyst.model.LoginDetails;
import com.performanceanalyst.model.UserDetails;
import com.performanceanalyst.services.MyConnection;

public class LoginDao implements ILoginDaoInterface {

	private MyConnection myCon=null;
	public LoginDao() {
		myCon=new MyConnection();
	}

	@Override
	public UserDetails isUser(LoginDetails userLoginDetails) {
		UserDetails isUserValid=new UserDetails() ;
		Connection con=myCon.myConnect();
		try {
			String s="select * from logintable where username=? and password=md5(?)";
			PreparedStatement ps=con.prepareStatement(s);
			ps.setString(1, userLoginDetails.getUserName());
			ps.setString(2, userLoginDetails.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				isUserValid.setUserName(rs.getString(1));
				isUserValid.setUserPass(rs.getString(2));
			}
	
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return isUserValid;		
	}

	@Override
	public boolean insertUser(UserDetails userDetails) {
		Connection con=myCon.myConnect();
		String q="insert into logintable values(?,md5(?))";
		try {
			PreparedStatement ps=con.prepareStatement(q);
			ps.setString(1, userDetails.getUserName());
			ps.setString(2, userDetails.getUserPass());
			ps.executeUpdate();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return false;
	}

}
