package com.dman.materialmgmt.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.dman.materialmgmt.domain.BusinessContact;

/**
 * @author amithpan
 *
 */
public interface VendorDaoImpl extends CrudRepository<BusinessContact, Serializable> {
	
	public BusinessContact save(BusinessContact entity);
	
}
