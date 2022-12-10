package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Test {
	
	public static void main(String[] args) {
		
		Session session = null;
		
		SessionFactory s =new Configuration()
				.configure("hibernate-cfg.xml")
				.addAnnotatedClass(Teacher.class)
				.buildSessionFactory();
		System.out.println("created db");
		
		Teacher t1 = new Teacher("Praveen", "Bandi", "bhand@gmail.com");
		Teacher t2 = new Teacher("Ayushi", "Noob", "noob@gmail.com");
		Teacher t3 = new Teacher("Rayan", "Raza", "raza@gmail.com");
		Teacher t4 = new Teacher("Najeed", "AsaiNo1", "nk@gmail.com");
		
				Transaction tx =null;
	try {
	session = s.getCurrentSession();
	 tx = session.beginTransaction();
	 session.save(t1);
	 session.save(t2);
	 session.save(t3);
	 session.save(t4);
	 
	 tx.commit();
	}catch(Exception e){
		System.out.println("error");
		e.printStackTrace();
	}finally {
		session.close();
	}
		
	}

}
