/**
 * 
 */
package com.dman.materialmgmt.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dman.materialmgmt.domain.Quotation;

/**
 * @author amithpan
 *
 */
@Repository
public interface QuotationDaoImpl extends CrudRepository<Quotation, Serializable> {

	public Quotation save(Quotation arg0);
}
