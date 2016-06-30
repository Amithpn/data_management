package com.dman.materialmgmt.domain;

import java.util.List;

public class PurchaseOrderRequest {

	private int vendorId;

	private String vendorName;

	private String paymentTNC;

	private String deliveryTNC;

	private String firstName;

	private String lastName;

	private String address;

	private List<Items> items;

	@Override
	public String toString() {
		return "PurchaseOrderRequest: { vendorId: "+vendorId
				+ "vendorName: "+vendorName
				+ "paymentTNC: "+paymentTNC
				+ "deliveryTNC: "+deliveryTNC
				+ "firstName: "+firstName
				+ "lastName: "+lastName
				+ "address: "+address
				+ "items: "+ items+ " }";
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
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}

	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the items
	 */
	public List<Items> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(List<Items> items) {
		this.items = items;
	}

}
