package com.dman.materialmgmt.service;

import com.dman.materialmgmt.domain.ItemMaster;
import com.dman.materialmgmt.domain.PurchaseOrderVO;

public interface MaterialManagementService {
	
	public String savePurchaseOrder(PurchaseOrderVO order);
	
	public String saveItemMaster(ItemMaster itemMaster);

}
