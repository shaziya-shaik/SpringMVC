package com.hibernate.ContactManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;



@Entity
@Table(name="ContactManagementDetails")
public class ContactManagement {
	@Id
	private long ph_no;
	@ManyToOne
	@JoinColumn(name = "person_name")
	Name name;
	@Temporal(TemporalType.DATE)
	@Column(name="Date_of_birth")
	private Date DateOfBirth;
	@Embedded
	private Address address;
	public long getPh_no() {
		return ph_no;
	}
	public void setPh_no(long ph_no) {
		this.ph_no = ph_no;
	}
	
	
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ContactManagement [ph_no=" + ph_no + ", name=" + name + ", DateOfBirth=" + DateOfBirth + ", address="
				+ address + "]";
	}
	
	
	
	
}
