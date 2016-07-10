package com.dman.materialmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dman.materialmgmt.dao.ItemMasterDaoImpl;
import com.dman.materialmgmt.dao.MaterialManagementDaoImpl;
import com.dman.materialmgmt.domain.ItemMaster;
import com.dman.materialmgmt.domain.PurchaseOrderVO;

@Service
public class MaterialManagementServiceImpl implements MaterialManagementService {

	@Autowired
	private MaterialManagementDaoImpl daoRepo;
	
	@Autowired
	private ItemMasterDaoImpl itemMasterRepo;

	public String savePurchaseOrder(PurchaseOrderVO order) {

		PurchaseOrderVO vo = daoRepo.save(order);

		if(null != vo) {
			return "success";
		}
		return null;
	}

	public String saveItemMaster(ItemMaster itemMaster) {

		ItemMaster item = itemMasterRepo.save(itemMaster);

		if(null != item) {
			return "success";
		}
		return null;
	}

}
