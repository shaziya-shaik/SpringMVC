package com.hibernate.Hibernate;
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Laptop {
	@Id
	int Lid;
	String Lname;
	@ManyToOne
	//student student;
	hibI hib;
	//@ManyToMany
	//List<student> student=new ArrayList<student>();
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	/*public List<student> getstudent() {
		return student;
	}
	public void setstudent(List<student> student) {
		this.student = student;
	}*/
	
	public hibI getHib() {
		return hib;
	}
	public void setHib(hibI hib) {
		this.hib = hib;
	}
	/*public List<student> getStudent() {
		return student;
	}
	public void setStudent(List<student> student) {
		this.student = student;
	}*/
	/*@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + ", hib=" + hib + ", student=" + student + "]";
	}*/
	
	
	
	@Override
	public String toString() {
	    return "Laptop [Lid=" + Lid + ", Lname=" + Lname + ", hib_id=" + (hib != null ? hib.getId() : "N/A") + "]";
	}

	

}
