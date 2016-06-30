package com.dman.materialmgmt.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dman.materialmgmt.domain.PurchaseOrderVO;

@Repository
public interface MaterialManagementDaoImpl extends CrudRepository<PurchaseOrderVO, Serializable>{

	public PurchaseOrderVO save(PurchaseOrderVO entity);
}
