
//Demo of Embedded annotation
package org.hibernate.p;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.Address;
import org.hibernate.dto.UserDetails1;
import org.hibernate.dto.UserDetails1;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails1 user=new UserDetails1();
		user.setUserId(1);
		user.setUserName("pallavi");
		
		
		/*UserDetails user2=new UserDetails();
		user.setUserId(2);
		user.setUserName("ROJA");
		*/
		Address addr=new Address();
		
		addr.setStreet("Lakeside");
		addr.setCity("Texas");
		addr.setPincode("75057");
		addr.setState("Texas");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user=null;
		
		
	    session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails1)session.get(UserDetails1.class,1);
		System.out.println("User details is"+user.getUserName());
		
	}
}
