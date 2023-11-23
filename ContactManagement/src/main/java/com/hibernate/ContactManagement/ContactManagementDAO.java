package com.hibernate.ContactManagement;

import java.util.List;
import jakarta.persistence.EntityManager;

import org.hibernate.query.Query;


public class ContactManagementDAO implements Contact_Management_DAO{
	
	private EntityManager em;
	ContactManagementDAO(EntityManager em){
		this.em = em;
		
	}
	public void save(ContactManagement contact) {
		// TODO Auto-generated method stub
		em.persist(contact);	
	}

	public ContactManagement getById(long id) {
		// TODO Auto-generated method stub
		return em.find(ContactManagement.class, id);
	}
	

	public void update(ContactManagement contact) {
		// TODO Auto-generated method stub
		em.merge(contact);
	}

	public void delete(ContactManagement contact) {
		// TODO Auto-generated method stub
		em.remove(contact);
	}
	public List<ContactManagement> getAll() {
		// TODO Auto-generated method stub
		Query<ContactManagement> query = (Query<ContactManagement>) em.createQuery("from ContactManagement", ContactManagement.class);
	        return query.getResultList();
	}

}
