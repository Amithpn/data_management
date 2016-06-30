package com.dman.materialmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dman.materialmgmt.dao.MaterialManagementDao;
import com.dman.materialmgmt.dao.MaterialManagementDaoImpl;
import com.dman.materialmgmt.domain.PurchaseOrderVO;

@Service
public class MaterialManagementServiceImpl implements MaterialManagementService{
	
	@Autowired
	private MaterialManagementDaoImpl daoRepo;

	public String savePurchaseOrder(PurchaseOrderVO order) {
		
		PurchaseOrderVO vo = daoRepo.save(order);
		
		if(null != vo) {
			return "success";
		}
		return null;
	}

}
