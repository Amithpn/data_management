package com.dman.materialmgmt.domain;

/**
 * @author amithpan
 *
 */
public class PurchaseOrder {
	
	private int purchaseOrderNo;
	
	private int purchaseOrderDate;
	
	private int vendorId;
	
	private String paymentTNC;
	
	private String deliveryTNC;
	
	private int shippingId;
	
	private int quotationNo;
	
	private int enquiryId;

	/**
	 * @return the purchaseOrderNo
	 */
	public int getPurchaseOrderNo() {
		return purchaseOrderNo;
	}

	/**
	 * @param purchaseOrderNo the purchaseOrderNo to set
	 */
	public void setPurchaseOrderNo(int purchaseOrderNo) {
		this.purchaseOrderNo = purchaseOrderNo;
	}

	/**
	 * @return the purchaseOrderDate
	 */
	public int getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	/**
	 * @param purchaseOrderDate the purchaseOrderDate to set
	 */
	public void setPurchaseOrderDate(int purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	/**
	 * @return the vendorId
	 */
	public int getVendorId() {
		return vendorId;
	}

	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * @return the paymentTNC
	 */
	public String getPaymentTNC() {
		return paymentTNC;
	}

	/**
	 * @param paymentTNC the paymentTNC to set
	 */
	public void setPaymentTNC(String paymentTNC) {
		this.paymentTNC = paymentTNC;
	}

	/**
	 * @return the deliveryTNC
	 */
	public String getDeliveryTNC() {
		return deliveryTNC;
	}

	/**
	 * @param deliveryTNC the deliveryTNC to set
	 */
	public void setDeliveryTNC(String deliveryTNC) {
		this.deliveryTNC = deliveryTNC;
	}

	/**
	 * @return the shippingId
	 */
	public int getShippingId() {
		return shippingId;
	}

	/**
	 * @param shippingId the shippingId to set
	 */
	public void setShippingId(int shippingId) {
		this.shippingId = shippingId;
	}

	/**
	 * @return the quotationNo
	 */
	public int getQuotationNo() {
		return quotationNo;
	}

	/**
	 * @param quotationNo the quotationNo to set
	 */
	public void setQuotationNo(int quotationNo) {
		this.quotationNo = quotationNo;
	}

	/**
	 * @return the enquiryId
	 */
	public int getEnquiryId() {
		return enquiryId;
	}

	/**
	 * @param enquiryId the enquiryId to set
	 */
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PurchaseOrder [purchaseOrderNo=" + purchaseOrderNo
				+ ", purchaseOrderDate=" + purchaseOrderDate + ", vendorId="
				+ vendorId + ", paymentTNC=" + paymentTNC + ", deliveryTNC="
				+ deliveryTNC + ", shippingId=" + shippingId + ", quotationNo="
				+ quotationNo + ", enquiryId=" + enquiryId + "]";
	}

}
