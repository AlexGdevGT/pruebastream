/**
 * 
 */
package com.alex.pruebastream.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import com.alex.pruebastream.entity.Contact;
import com.alex.pruebastream.repository.ContactRepository;

/**
 * @author alex
 *
 */
@Service("contactService")
@Scope(value="application",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ContactService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	ContactRepository repo;

	public List<Contact> queryAll() {
		return repo.queryAll();
	}

}
