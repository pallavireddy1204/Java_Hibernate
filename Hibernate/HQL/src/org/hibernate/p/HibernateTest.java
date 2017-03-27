
//HQL 
package org.hibernate.p;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.UserDetails1;


public class HibernateTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
			
		Query query=session.createQuery("from UserDetails1 where userId>5");
		List users=query.list();
		session.getTransaction().commit();
		session.close();
		System.out.println("size of users" +users.size());
		
	}
}
