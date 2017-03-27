
//CRUD operation
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
			
		//Creating Data
		/*for(int i=0;i<10;i++)
		{
			UserDetails1 user=new UserDetails1();
			user.setUserName("user" + i);
			session.save(user);
		}*/
		
		//Fetching/Reading Data from database table
		/*UserDetails1 user=(UserDetails1)session.get(UserDetails1.class,1);
		System.out.println("User Name is "+user.getUserName());
*/
		
		//Delete data from database
	/*	UserDetails1 user=(UserDetails1)session.get(UserDetails1.class,6);
		session.delete(user);
	*/
		
		//Updating data in database
		UserDetails1 user=(UserDetails1)session.get(UserDetails1.class,5);
		user.setUserName("Updated User");
		session.update(user);
		
		session.getTransaction().commit();
		session.close();
		
	}
}
