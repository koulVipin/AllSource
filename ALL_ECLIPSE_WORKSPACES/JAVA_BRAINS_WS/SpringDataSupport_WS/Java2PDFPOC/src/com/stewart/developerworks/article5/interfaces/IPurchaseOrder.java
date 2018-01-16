package com.stewart.developerworks.article5.interfaces;

import java.util.Date;
import java.util.Iterator;

import com.stewart.developerworks.article5.bal.entities.purchaseorder.OrderItem;

public interface IPurchaseOrder extends IXmlSerializable{

	/**
	 * @return Customer address
	 */
	 IAddress getCustomerAddress();

	/**
	 * @param value Customer address
	 */
	 void setCustomerAddress(IAddress value);

	/**
	 * Sets the company address.
	 * 
	 * @param value the new company address
	 */
	 void setCompanyAddress(IAddress value);

	/**
	 * Gets the company address.
	 * 
	 * @return the company address
	 */
	 IAddress getCompanyAddress();

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	 String getId();

	/**
	 * Gets the order date.
	 * 
	 * @return the order date
	 */
	 Date getOrderDate();

	/**
	 * Sets the order date.
	 * 
	 * @param value the new order date
	 */
	 void setOrderDate(Date value);

	/**
	 * Adds the item.
	 * 
	 * @param detail the detail
	 */
	 void addItem(IOrderItem detail);

	/**
	 * Gets the items.
	 * 
	 * @return the items
	 */
	 Iterator<IOrderItem> getItems();

	/**
	 * Gets the item count.
	 * 
	 * @return the item count
	 */
	 int getItemCount();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	 String toString();

}