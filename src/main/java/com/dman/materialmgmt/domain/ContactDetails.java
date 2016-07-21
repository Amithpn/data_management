package com.dman.materialmgmt.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author amithpan
 *
 */
@Entity
@Table(name = "contact_details")
public class ContactDetails implements Serializable {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contactId;
	
	@Column(name = "person_name")
	private String personName;
	
	@Column(name = "mobile_no")
	private String mobileNum;
	
	@Column(name = "work_no")
	private String workNum;
	
	@Column(name = "home_no")
	private String homeNum;

	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the mobileNum
	 */
	public String getMobileNum() {
		return mobileNum;
	}

	/**
	 * @param mobileNum the mobileNum to set
	 */
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	/**
	 * @return the workNum
	 */
	public String getWorkNum() {
		return workNum;
	}

	/**
	 * @param workNum the workNum to set
	 */
	public void setWorkNum(String workNum) {
		this.workNum = workNum;
	}

	/**
	 * @return the homeNum
	 */
	public String getHomeNum() {
		return homeNum;
	}

	/**
	 * @param homeNum the homeNum to set
	 */
	public void setHomeNum(String homeNum) {
		this.homeNum = homeNum;
	}

	@Override
	public String toString() {
		return "ContactDetails [contactId=" + contactId + ", personName="
				+ personName + ", mobileNum=" + mobileNum + ", workNum="
				+ workNum + ", homeNum=" + homeNum + "]";
	}
	
}
