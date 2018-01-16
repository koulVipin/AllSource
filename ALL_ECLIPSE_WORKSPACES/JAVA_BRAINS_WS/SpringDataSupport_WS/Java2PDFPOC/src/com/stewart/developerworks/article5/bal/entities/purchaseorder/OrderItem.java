package com.stewart.developerworks.article5.bal.entities.purchaseorder;

import com.stewart.developerworks.article5.interfaces.IOrderItem;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("Item")
public class OrderItem implements IOrderItem {
	@XStreamAlias("ItemId")
	@XStreamAsAttribute
	private String m_itemId = null;
	
	@XStreamAlias("ItemName")
	@XStreamAsAttribute
	private String m_itemName = null;
	
	@XStreamAlias("Quantity")
	@XStreamAsAttribute
	private int m_quantity = 0;
	
	@XStreamAlias("ItemCost")
	@XStreamAsAttribute
	private float m_itemCost = 0;
	
	/**
	 * Instantiates a new customer order detail entity.
	 */
	public OrderItem() {
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#getItemId()
	 */
	public String getItemId() {
		return this.m_itemId;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#setItemId(java.lang.String)
	 */
	public void setItemId(String value) {
		this.m_itemId = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#getItemName()
	 */
	public String getItemName() {
		return this.m_itemName;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#setItemName(java.lang.String)
	 */
	public void setItemName(String value) {
		this.m_itemName = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#getQuantity()
	 */
	public int getQuantity() {
		return this.m_quantity;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#setQuantity(int)
	 */
	public void setQuantity(int value) {
		this.m_quantity = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IOrderItem#toString()
	 */
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append("{Id=");
		str.append(this.getItemId());
		str.append(", Name=");
		str.append(this.getItemName());
		str.append(", Quantity=");
		str.append(this.getQuantity());
		str.append("}");
		
		return str.toString();
	}

	@Override
	public float getItemCost() {
		return this.m_itemCost;
	}

	@Override
	public void setItemCost(float cost) {
		this.m_itemCost = cost;
	}
}