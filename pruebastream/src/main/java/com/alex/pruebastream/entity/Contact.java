/**
 * 
 */
package com.alex.pruebastream.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author alex
 *
 */
@Entity
@Table(name="contact")
@NamedQuery(name="Contact.findAll", query="SELECT d FROM Contact d")
public class Contact implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private long idcontact;
	private long companyid;
	private String name;
	private String email;
	
	public long getIdcontact() {
		return idcontact;
	}
	public void setIdcontact(long idcontact) {
		this.idcontact = idcontact;
	}
	public long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contact [idcontact=" + idcontact + ", companyid=" + companyid + ", name=" + name + ", email=" + email
				+ "]";
	}
		

}
