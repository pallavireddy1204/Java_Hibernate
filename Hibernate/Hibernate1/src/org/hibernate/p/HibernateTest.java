
//Retrieving data which is inserted in db
package org.hibernate.p;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("pallavi");
		user.setAddress("307 Mankato");
		user.setJoinedDate(new Date());
		user.setDescription("Hello welcome");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user=null;
		
		
	    session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails)session.get(UserDetails.class,1);
		System.out.println("User details is"+user.getUserName());
		
	}
}
