package com.dman.materialmgmt.domain;

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
@Table(name = "item_master")
public class ItemMaster {
	
	@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	
	@Column(name = "item_name")
	private String itemName;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "specification")
	private String specification;
	
	@Column(name = "curr_qty")
	private int currentQty;
	
	@Column(name = "min_qty")
	private int minimumQty;
	
	@Column(name = "uom")
	private String uom;

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
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the specification
	 */
	public String getSpecification() {
		return specification;
	}

	/**
	 * @param specification the specification to set
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	/**
	 * @return the currentQty
	 */
	public int getCurrentQty() {
		return currentQty;
	}

	/**
	 * @param currentQty the currentQty to set
	 */
	public void setCurrentQty(int currentQty) {
		this.currentQty = currentQty;
	}

	/**
	 * @return the minimumQty
	 */
	public int getMinimumQty() {
		return minimumQty;
	}

	/**
	 * @param minimumQty the minimumQty to set
	 */
	public void setMinimumQty(int minimumQty) {
		this.minimumQty = minimumQty;
	}

	/**
	 * @return the uOM
	 */
	public String getUOM() {
		return uom;
	}

	/**
	 * @param uOM the uOM to set
	 */
	public void setUOM(String uOM) {
		uom = uOM;
	}

	@Override
	public String toString() {
		return "ItemMaster [itemId=" + itemId + ", itemName=" + itemName
				+ ", description=" + description + ", specification="
				+ specification + ", currentQty=" + currentQty
				+ ", minimumQty=" + minimumQty + ", UOM=" + uom + "]";
	}

}
