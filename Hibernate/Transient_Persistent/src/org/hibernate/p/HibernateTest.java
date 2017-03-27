

package org.hibernate.p;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.UserDetails1;


public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails1 user=new UserDetails1();
		user.setUserName("Test User");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);//Persistent
		
		user.setUserName("Updated user");
		
		user.setUserName("New Update");
		
		session.getTransaction().commit();
		session.close();//Detached
		
		user.setUserName("After session closed it will not be saved in database ");
		
	}
}
