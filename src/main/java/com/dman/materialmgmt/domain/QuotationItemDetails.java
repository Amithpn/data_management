package com.dman.materialmgmt.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class QuotationItemDetails {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quotationItemId;

	@Column(name = "quotaion_gen_date")
	private String quotaionDate;

	@Column(name = "quantity")
	private String quantity;

	@Column(name = "unitPrice")
	private float unitPrice;

	@Column(name = "discount")
	private int discount;
	
	@Column(name = "item_id")
	private int itemId;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "quotation_id")
	private Quotation quotationId;

	/**
	 * @return the quotationItemId
	 */
	public int getQuotationItemId() {
		return quotationItemId;
	}

	/**
	 * @param quotationItemId the quotationItemId to set
	 */
	public void setQuotationItemId(int quotationItemId) {
		this.quotationItemId = quotationItemId;
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
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the unitPrice
	 */
	public float getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

	/**
	 * @return the quotationId
	 */
	public Quotation getQuotationId() {
		return quotationId;
	}

	/**
	 * @param quotationId the quotationId to set
	 */
	public void setQuotationId(Quotation quotationId) {
		this.quotationId = quotationId;
	}

	@Override
	public String toString() {
		return "QuotationItemDetails [quotationItemId=" + quotationItemId
				+ ", quotaionDate=" + quotaionDate + ", itemId=" + itemId
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ ", discount=" + discount + ", quotationId=" + quotationId
				+ "]";
	};

}
