package com.dman.materialmgmt.domain;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author amithpan
 *
 */
@Entity
@Table(name = "quotation")
public class Quotation {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quotationId;

	@Column(name = "quotaion_gen_date")
	private String quotaionDate;

	@Column(name = "payment_tnc")
	private String paymentTNC;

	@Column(name = "delivery_tnc")
	private String deliveryTNC;
	
	@Column(name = "address_id")
	private int addressId;

	@Column(name = "business_id")
	private int vendorId;
	
	@Column()
	private ArrayList<QuotationItemDetails> quotationItemDetails;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "quotation_id")
	private Quotation quotationId;

	/**
	 * @return the quotationId
	 */
	public int getQuotationId() {
		return quotationId;
	}

	/**
	 * @param quotationId the quotationId to set
	 */
	public void setQuotationId(int quotationId) {
		this.quotationId = quotationId;
	}

	/**
	 * @return the quotaionDate
	 */
	public String getQuotaionDate() {
		return quotaionDate;
	}

	/**
	 * @param quotaionDate the quotaionDate to set
	 */
	public void setQuotaionDate(String quotaionDate) {
		this.quotaionDate = quotaionDate;
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
	 * @return the addressId
	 */
	public int getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(int addressId) {
		this.addressId = addressId;
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

	@Override
	public String toString() {
		return "Quotation [quotationId=" + quotationId + ", quotaionDate="
				+ quotaionDate + ", paymentTNC=" + paymentTNC
				+ ", deliveryTNC=" + deliveryTNC + ", addressId=" + addressId
				+ ", vendorId=" + vendorId + "]";
	}

}
