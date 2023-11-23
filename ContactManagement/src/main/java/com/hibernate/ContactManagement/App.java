package com.hibernate.ContactManagement;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA");
    	
    	EntityManager em=emf.createEntityManager();
    	ContactManagementDAO contactManagementDAO = new ContactManagementDAO(em);
    	em.getTransaction().begin();
    	 Name name = em.find(Name.class, 1);
    	ContactManagement contact=new ContactManagement();
    	contact.setPh_no(7036705077L);
    	 if (name == null) {
    	 name=new Name();
    	name.setId(1);
    	name.setfName("shaziya");
    	name.setmName("Begum");
    	name.setlName("Shaik");
    	 }
    	System.out.println("persist");
    
    	
    	 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         try {
             Date dob = dateFormat.parse("22-08-2002");
             contact.setDateOfBirth(dob);
         } catch (ParseException e) {
             e.printStackTrace();
         }
    	Address address=new Address();
    	address.setStreet("3/109A");
    	address.setCity("old market street");
    	address.setState("Gudivada");
    	address.setZipCode("521301");
    	contact.setAddress(address);
    	System.out.println("persist");
    	
    
    	contact.setName(name);
    	if (!em.contains(name)) {
            // Check if the entity is managed, if not, merge it
            name = em.merge(name);
        }
    	
    	System.out.println("persist");
    	em.persist(name);
    
    	contactManagementDAO.save(contact);
    	List<ContactManagement> allContacts = contactManagementDAO.getAll();
        System.out.println("All Contacts: " + allContacts);
        em.getTransaction().commit();
       
        	 if (em != null && em.isOpen()) 
                 em.close();
             

             // Close EntityManagerFactory
             if (emf != null && emf.isOpen()) 
                 emf.close();
    	
    }
}
