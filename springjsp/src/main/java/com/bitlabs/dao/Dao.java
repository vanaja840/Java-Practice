package com.bitlabs.dao;

import com.bitlabs.entity.User;


public interface Dao {
	
	public boolean addUser(User user);
	public boolean login(String uname, String pwd);
	
	
}
