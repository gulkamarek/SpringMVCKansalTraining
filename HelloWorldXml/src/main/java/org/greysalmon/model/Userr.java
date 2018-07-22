package org.greysalmon.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Userr {
	
	@Id
	@GeneratedValue
	private Long userrId; // primary key in db, it will be auto generated
	
	@Size(min=2, max=50)
	private String fName;

	@Size(min=2, max=50)
	private String lName;
	
	@Email
	private String email;	
	
	@Size(min=6, max=20)
	private String mobile;
	
	
	public Long getUserrId() {
		return userrId;
	}
	public void setUserrId(Long userrId) {
		this.userrId = userrId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
