package com.dman.materialmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dman.materialmgmt.dao.ItemMasterDaoImpl;
import com.dman.materialmgmt.dao.MaterialManagementDaoImpl;
import com.dman.materialmgmt.dao.VendorDaoImpl;
import com.dman.materialmgmt.domain.BusinessContact;
import com.dman.materialmgmt.domain.ItemMaster;
import com.dman.materialmgmt.domain.PurchaseOrderVO;

@Service
public class MaterialManagementServiceImpl implements MaterialManagementService {

	@Autowired
	private MaterialManagementDaoImpl daoRepo;
	
	@Autowired
	private ItemMasterDaoImpl itemMasterRepo;
	
	@Autowired
	private VendorDaoImpl vendorDaoRepo;

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
	
	public String saveVendorDetails(BusinessContact businessContact) {
		
		BusinessContact vendorDetails = vendorDaoRepo.save(businessContact);
		
		if(null != vendorDetails) {
			return "success";
		}
		return null;
	}

}
