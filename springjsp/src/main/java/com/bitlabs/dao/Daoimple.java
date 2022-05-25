package com.bitlabs.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bitlabs.entity.User;

public class Daoimple implements Dao{

SessionFactory sf=null;
	
	public Daoimple() {
	sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction txn=session.beginTransaction();
		session.save(user);
		
		txn.commit();
		
		session.close();
		
		return true;
	}

	@Override
	public boolean login(String uname, String pwd) {
		// TODO Auto-generated method stub
		boolean b=false;
			Session session=sf.openSession();
			Query query=session.createQuery("from Users where username='"+uname+"' and password='"+pwd+"'");
			List<User> user=query.list();
			if(user.size()!=0) {
				b=true;
			}
			session.close();
			return b;
		}

}

