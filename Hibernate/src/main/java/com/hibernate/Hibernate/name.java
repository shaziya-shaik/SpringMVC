package com.hibernate.Hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class name {
		String Fname;
		String Mname;
		String Lname;
		public String getFname() {
			return Fname;
		}
		public void setFname(String fname) {
			Fname = fname;
		}
		public String getMname() {
			return Mname;
		}
		public void setMname(String mname) {
			Mname = mname;
		}
		public String getLname() {
			return Lname;
		}
		public void setLname(String lname) {
			Lname = lname;
		}
		@Override
		public String toString() {
			return "name [Fname=" + Fname + ", Mname=" + Mname + ", Lname=" + Lname + "]";
		}
		
}
