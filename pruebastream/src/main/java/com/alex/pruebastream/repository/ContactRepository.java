/**
 * 
 */
package com.alex.pruebastream.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.alex.pruebastream.entity.Contact;

/**
 * @author alex
 *
 */
@Repository
public class ContactRepository {

	@PersistenceContext
	private EntityManager em;

	@Transactional(readOnly = true)
	public List<Contact> queryAll() {
		return em.createNamedQuery("Contact.findAll", Contact.class).getResultList();
	}
	
}
