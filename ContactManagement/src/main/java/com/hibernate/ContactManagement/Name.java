package com.hibernate.ContactManagement;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Name {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToMany(mappedBy="name", fetch=FetchType.EAGER)//by default lazy
	private List<ContactManagement> ph=new ArrayList<ContactManagement>();
	private String fName;
	private String mName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
	    this.id = id;
	}
	public List<ContactManagement> getPh() {
		return ph;
	}
	public void setPh(List<ContactManagement> ph) {
		this.ph = ph;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Name [id=" + id + ", ph=" + ph + ", fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
	
	

}
