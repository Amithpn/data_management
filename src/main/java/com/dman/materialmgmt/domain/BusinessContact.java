package com.dman.materialmgmt.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author amithpan
 *
 */
@Entity
@Table(name = "business_contact")
public class BusinessContact implements Serializable {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int businessId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "tin_no")
	private String tinNum;
	
	@Column(name = "stast_no")
	private String stastNum;
	
	@Column(name = "cst_no")
	private String cstNum;
	
	@Column(name = "pan_no")
	private String panNum;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name = "contact_id")
	private ContactDetails contactDetails;

	/**
	 * @return the businessId
	 */
	public int getBusinessId() {
		return businessId;
	}

	/**
	 * @param businessId the businessId to set
	 */
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the tinNum
	 */
	public String getTinNum() {
		return tinNum;
	}

	/**
	 * @param tinNum the tinNum to set
	 */
	public void setTinNum(String tinNum) {
		this.tinNum = tinNum;
	}

	/**
	 * @return the stastNum
	 */
	public String getStastNum() {
		return stastNum;
	}

	/**
	 * @param stastNum the stastNum to set
	 */
	public void setStastNum(String stastNum) {
		this.stastNum = stastNum;
	}

	/**
	 * @return the cstNum
	 */
	public String getCstNum() {
		return cstNum;
	}

	/**
	 * @param cstNum the cstNum to set
	 */
	public void setCstNum(String cstNum) {
		this.cstNum = cstNum;
	}

	/**
	 * @return the panNum
	 */
	public String getPanNum() {
		return panNum;
	}

	/**
	 * @param panNum the panNum to set
	 */
	public void setPanNum(String panNum) {
		this.panNum = panNum;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the contact
	 */
	public ContactDetails getContact() {
		return contactDetails;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactDetails contact) {
		this.contactDetails = contact;
	}

	@Override
	public String toString() {
		return "BusinessContact [businessId=" + businessId + ", name=" + name
				+ ", tinNum=" + tinNum + ", stastNum=" + stastNum + ", cstNum="
				+ cstNum + ", panNum=" + panNum + ", address=" + address
				+ ", contact=" + contactDetails + "]";
	}
	
}
