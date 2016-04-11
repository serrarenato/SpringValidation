package br.com.letsgoti.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Costumer {
	
	 	@Size(min=3, max=50)
	    private String firstName;
	 
	    @Size(min=3, max=50)
	    private String lastName;
	 
	    @NotEmpty
	    private String sex;
	 
	    @DateTimeFormat(pattern="dd/MM/yyyy")
	    @Past @NotNull
	   
	    private Date dateBorn;
	 
	    @Email @NotEmpty
	    private String email;
	 
	    	    
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 
	    public String getSex() {
	        return sex;
	    }
	 
	    public void setSex(String sex) {
	        this.sex = sex;
	    }
	 
	    public Date getdateBorn() {
	        return dateBorn;
	    }
	 
	    public void setdateBorn(Date dateBorn) {
	        this.dateBorn = dateBorn;
	    }
	 
	    public String getEmail() {
	        return email;
	    }
	 
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 
	    @Override
	    public String toString() {
	        return "Costumer [firstName=" + firstName + ", lastName=" + lastName
	                + ", sex=" + sex + ", dateBorn=" + dateBorn + ", email=" + email	               
	                + "]";
	    }

}
