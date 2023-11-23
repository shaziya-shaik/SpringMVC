package com.hibernate.Hibernate;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class student {
	@Id
	int Sid;
	String Sname;
	//@OneToOne
	//Laptop laptop;
	//@OneToMany(mappedBy = "student")
	@ManyToMany(mappedBy = "student")
	List<Laptop> laptop=new ArrayList<Laptop>();
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "student [Sid=" + Sid + ", Sname=" + Sname + ", laptop=" + laptop + "]";
	}
	
	
	
	
	

}
