package com.dman.materialmgmt.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.dman.materialmgmt.domain.ItemMaster;

/**
 * @author amithpan
 *
 */
public interface ItemMasterDaoImpl extends CrudRepository<ItemMaster, Serializable>{

	@SuppressWarnings("unchecked")
	public ItemMaster save(ItemMaster entity);
}
