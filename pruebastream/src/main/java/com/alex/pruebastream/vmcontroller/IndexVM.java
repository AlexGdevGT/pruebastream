/**
 * 
 */
package com.alex.pruebastream.vmcontroller;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import com.alex.pruebastream.entity.Contact;
import com.alex.pruebastream.service.ContactService;

/**
 * @author alex
 *
 */
@VariableResolver(DelegatingVariableResolver.class)
public class IndexVM {

	@WireVariable
	ContactService contactService;
	
	private List<Contact> listadoContactos;
	
	@Init
	public void init() {
		listadoContactos = contactService.queryAll();
		System.out.println("tam:"+listadoContactos.size());
		for (Contact con:listadoContactos) {
			System.out.println(con.toString());
		}
	}
	
	@Command
	public void buscar() {
		/*listadoContactos.stream()
		.filter(con -> "Juan".equals(con.getName()));*/
		
		/*Contact contactoJuan = listadoContactos.stream()
								.filter(con -> "Juan".equals(con.getName()))
								.findAny()
								.orElse(null);
		
		System.out.println("contacto:"+contactoJuan.toString());*/
	}
	

	public List<Contact> getListadoContactos() {
		return listadoContactos;
	}

	public void setListadoContactos(List<Contact> listadoContactos) {
		this.listadoContactos = listadoContactos;
	}
}
