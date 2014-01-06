package com.bdqn.inf;

import java.util.List;

import com.bdqn.domain.Users;

public interface IUsersDAO {
	public boolean register(Users myUser);
	//public boolean register(String uname,String upwd);
	public Users isLogin(String uname,String upwd);
	public boolean updateUState(String uName);
	public List<Users> findByUName(String uName);
}
