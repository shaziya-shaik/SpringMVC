package com.hibernate.Hibernate;
import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity//((name="table_name")
@Table(name="hibernate")
public class hibI {
	
	@Id
	int id;
	//@Column(name="Ename")
	name name;
	//@Transient
	String address;
	@OneToMany(mappedBy="hib", fetch=FetchType.EAGER)//by default lazy
	List<Laptop> l=new ArrayList<Laptop>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Laptop> getL() {
		return l;
	}
	public void setL(List<Laptop> l) {
		this.l = l;
	}
	public name getName() {
		return name;
	}
	public void setName(name name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
	    return "hibI [id=" + id + ", name=" + name + ", address=" + address + ", laptops=" + l + "]";
	}

	
	
	

}
