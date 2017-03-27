

package org.hibernate.p;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.UserDetails1;


public class HibernateTest {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		UserDetails1 user= (UserDetails1) session.get(UserDetails1.class,1);
		UserDetails1 user2= (UserDetails1) session.get(UserDetails1.class,1);
		
		session.getTransaction().commit();
		session.close();
		
		
	}
}
