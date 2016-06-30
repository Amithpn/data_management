package com.dman.materialmgmt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material_mgmt")
public class PurchaseOrderVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendorId;

	@Column(name = "vendor_name")
	private String vendorName;

	@Column(name = "payment_tnc")
	private String paymentTNC;

	@Column(name = "delivery_tnc")
	private String deliveryTNC;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "address")
	private String address;

	@Override
	public String toString() {
		return "PurchaseOrderVO: { vendorId: "+vendorId
				+ "vendorName: "+vendorName
				+ "paymentTNC: "+paymentTNC
				+ "deliveryTNC: "+deliveryTNC
				+ "firstName: "+firstName
				+ "lastName: "+lastName
				+ "address: "+address+" }";
	}

	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	/**
	 * @param paymentTNC the paymentTNC to set
	 */
	public void setPaymentTNC(String paymentTNC) {
		this.paymentTNC = paymentTNC;
	}

	/**
	 * @param deliveryTNC the deliveryTNC to set
	 */
	public void setDeliveryTNC(String deliveryTNC) {
		this.deliveryTNC = deliveryTNC;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
