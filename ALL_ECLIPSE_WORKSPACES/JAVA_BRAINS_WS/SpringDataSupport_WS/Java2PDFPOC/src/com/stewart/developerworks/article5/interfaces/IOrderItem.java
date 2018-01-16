package com.stewart.developerworks.article5.interfaces;

public interface IOrderItem {

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	String getItemId();

	/**
	 * Sets the id.
	 * 
	 * @param value the new id
	 */
	void setItemId(String value);

	/**
	 * Gets the item name.
	 * 
	 * @return the item name
	 */
	String getItemName();

	/**
	 * Sets the item name.
	 * 
	 * @param value the new item name
	 */
	void setItemName(String value);

	/**
	 * Gets the quantity.
	 * 
	 * @return the quantity
	 */
	int getQuantity();

	/**
	 * Sets the quantity.
	 * 
	 * @param value the new quantity
	 */
	void setQuantity(int value);

	/**
	 * Gets the item cost.
	 * 
	 * @return the item cost
	 */
	float getItemCost();
	
	/**
	 * Sets the item cost.
	 * 
	 * @param cost the new item cost
	 */
	void setItemCost(float cost);
	
	/**
	 * To string.
	 * 
	 * @return the string
	 */
	String toString();
}