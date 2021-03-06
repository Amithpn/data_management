package com.dman.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dman.materialmgmt.domain.BusinessContact;
import com.dman.materialmgmt.domain.ItemMaster;
import com.dman.materialmgmt.domain.PurchaseOrderRequest;
import com.dman.materialmgmt.domain.PurchaseOrderVO;
import com.dman.materialmgmt.domain.Quotation;
import com.dman.materialmgmt.service.MaterialManagementService;

@RestController
@RequestMapping("/dman")
public class MaterialMgmtController {
	
	private static final Logger logger = LoggerFactory.getLogger(MaterialMgmtController.class);
	
	@Autowired
	MaterialManagementService poService;
	
	/*@RequestMapping(value = "/mm", method = RequestMethod.POST, headers = "Accept=application/json")
    public String createSubscription(@RequestBody PurchaseOrderRequest poRequest) {
		
		PurchaseOrderVO order = new PurchaseOrderVO();
		order.setVendorName(poRequest.getVendorName());
		order.setPaymentTNC(poRequest.getPaymentTNC());
		order.setDeliveryTNC(poRequest.getDeliveryTNC());
		order.setFirstName(poRequest.getFirstName());
		order.setLastName(poRequest.getLastName());
		order.setAddress(poRequest.getAddress());
		
		String msg = poService.savePurchaseOrder(order);
		
		logger.debug(">>savePurchaseOrder PurchaseOrderRequest:"+ poRequest);
		
		return msg;
	}*/
	
	@RequestMapping(value = "/mm/items", method = RequestMethod.POST, headers = "Accept=application/json")
    public String saveItemMasterDetails(@RequestBody ItemMaster itemMaster) {
		
		String msg = poService.saveItemMaster(itemMaster);
		
		logger.debug(">>savedItemMasterDeatils :"+ itemMaster);
		
		return msg;
	}
	
	@RequestMapping(value = "/mm/vendor", method = RequestMethod.POST, headers = "Accept=application/json")
    public String saveVendorDetails(@RequestBody BusinessContact businessContact) {
		
		String msg = poService.saveVendorDetails(businessContact);
		
		logger.debug(">>saveVendorDeatils :"+ businessContact);
		
		return msg;
	}
	
	@RequestMapping(value = "/mm/quotation", method = RequestMethod.POST, headers = "Accept=application/json")
    public String saveQuotation(@RequestBody Quotation quotation) {
		
		String msg = poService.saveQuotation(quotation);
		
		logger.debug(">>saveVendorDeatils :"+ quotation);
		
		return msg;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, headers = "Accept=application/json")
	public String commonTest(@RequestParam(value = "msg", required = true) String type) {
		String msg = type;
		logger.info("Successfully hitting the controller");
		return msg;
    }

}
