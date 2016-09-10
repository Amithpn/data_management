package com.dman.materialmgmt.service;

import com.dman.materialmgmt.domain.BusinessContact;
import com.dman.materialmgmt.domain.ItemMaster;
import com.dman.materialmgmt.domain.PurchaseOrderVO;
import com.dman.materialmgmt.domain.Quotation;

public interface MaterialManagementService {
	
	public String savePurchaseOrder(PurchaseOrderVO order);
	
	public String saveItemMaster(ItemMaster itemMaster);
	
	public String saveVendorDetails(BusinessContact businessContact);
	
	public String saveQuotation(Quotation quotation);

}
