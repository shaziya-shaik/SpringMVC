package com.hibernate.ContactManagement;
import java.util.*;
public interface Contact_Management_DAO {
	 void save(ContactManagement contact);
	 ContactManagement  getById(long id);
	   List<ContactManagement> getAll();
	    void update(ContactManagement contact);
	    void delete(ContactManagement contact);
}
