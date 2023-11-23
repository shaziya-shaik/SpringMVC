package com.hibernate.Hibernate;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//hibI h1=new hibI();
    	//name N1=new name();
    	/*N1.setFname("irfan");
    	N1.setMname(null);
    	N1.setLname("Abdul");
    	
    	h1.setId(1);
    	h1.setName(N1);
    	h1.setAddress("Gudivada");
    	
    	hibI h2=new hibI();
    	name N2=new name();
    	N2.setFname("Dilshad");
    	N2.setMname(null);
    	N2.setLname("begum");
    	
    	h2.setId(2);
    	h2.setName(N2);
    	h2.setAddress("Hyderabad");
    	
    	hibI h3=new hibI();
    	name N3=new name();
    	N3.setFname("sufiya");
    	N3.setMname(null);
    	N3.setLname("Shaik");
    	
    	h3.setId(3);
    	h3.setName(N3);
    	h3.setAddress("chennai");
    	
    	hibI h4=new hibI();
    	name N4=new name();
    	N4.setFname("shahanaz");
    	N4.setMname("begum");
    	N4.setLname("Shaik");
    	
    	h4.setId(4);
    	h4.setName(N4);
    	h4.setAddress("vijayawada");
    	
    	
    	hibI h5=new hibI();
    	name N5=new name();
    	N5.setFname("shaziya");
    	N5.setMname("begum");
    	N5.setLname("Shaik");
    	
    	h5.setId(5);
    	h5.setName(N5);
    	h5.setAddress("banglore");
    	
    	Laptop l1=new Laptop();
    	l1.setLid(108);
    	l1.setLname("Asus");
    	Laptop l2=new Laptop();
    	l2.setLid(101);
    	l2.setLname("lanova");
    	Laptop l3=new Laptop();
    	l3.setLid(118);
    	l3.setLname("Dell");
    	Laptop l4=new Laptop();
    	l4.setLid(104);
    	l4.setLname("Hp");
    	Laptop l5=new Laptop();
    	l5.setLid(106);
    	l5.setLname("Apple");*/
    	
    	/* student s=new student();
    	 s.setSid(1);
    	 s.setSname("Shaziya");
    	 s.getLaptop().add(l);manyToone or onetomany
    	 l.getstudent().add(s);*/
    	/*h1.getL().add(l2);
    	l5.setHib(h5);
    	h2.getL().add(l3);
    	l2.setHib(h3);
    	h1.getL().add(l1);
    	l3.setHib(h1);
    	h4.getL().add(l4);
    	l4.setHib(h3);
    	h5.getL().add(l5);
    	l1.setHib(h5);*/
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(HQLI.class);
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf=con.buildSessionFactory(registry);
    	Session session1=sf.openSession();
    	Transaction tx1 = session1.beginTransaction();
//    	Random r=new Random();
//    	for(int i=1;i<=50;i++) {
//    		HQLI h=new HQLI();
//    		h.setId(i);
//    		h.setName("NAME"+i);
//    		h.setMarks(r.nextInt(100));
//    		session1.persist(h);
//    	}
    	int b=60;
    	
    	  Query q=session1.createQuery("select sum(marks)from HQLI where marks> :b");
    	  q.setParameter("b", b);
    	 // HQLI h=(HQLI)q.uniqueResult();
    	  Long h=(Long)q.uniqueResult();
    	 // List<HQLI> h=q.list();
    	  //for(HQLI H:h)
//    	  Object [] h=(Object[]) q.uniqueResult();
//    	  for(Object o:h)
    		  System.out.println(h);
     /*   session.persist(h1);
        session.persist(h2);
        session.persist(h3);
        session.persist(h4);
        session.persist(h5);
    	session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(l4);
        session.persist(l5);*/
   // inserting data
//    	hibI h1 = session.get(hibI.class, 5); // Fetching data
//    	System.out.println(h1.getL());
//lazy method
//    	List<Laptop> laps = h1.getL(); // Retrieve laptops associated with h1
//
//    	for (Laptop l : laps) {
//    	    System.out.println(l);
//    	}
    	//catche
//    	hibI h1 = session1.get(hibI.class, 5);
//    	System.out.println(h1);
    	tx1.commit();
    	session1.close();
    	
//    	Session session2=sf.openSession();
//    	Transaction tx2 = session2.beginTransaction();
//    	hibI h2 = session2.get(hibI.class, 5);
//    	System.out.println(h2);
//    	tx2.commit();
//    	session2.close();
      
    }
}
