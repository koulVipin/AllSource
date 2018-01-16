package com.stewart.developerworks.article5.bal.entities.purchaseorder;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import com.stewart.developerworks.article5.bal.entities.address.Address;
import com.stewart.developerworks.article5.interfaces.IAddress;
import com.stewart.developerworks.article5.interfaces.IOrderItem;
import com.stewart.developerworks.article5.interfaces.IPurchaseOrder;
import com.stewart.developerworks.article5.interfaces.IXmlSerializable;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * The Class PurchaseOrder.
 */
/**
 * @author bstewart
 *
 */
@XStreamAlias("PurchaseOrder")
public class PurchaseOrder implements IPurchaseOrder, IXmlSerializable {
	/** The m_id. */
	@XStreamAlias("OrderId")
	@XStreamAsAttribute
	private String m_orderId = null;
	
	/** The m_order date. */
	@XStreamAlias("OrderDate")
	private Date m_orderDate = null;
	
	/** The m_company addr. */
	@XStreamAlias("CompanyAddress")
	private IAddress m_companyAddr = null;

	/** The m_vendor addr. */
	@XStreamAlias("CustomerAddress")
	private IAddress m_customerAdress = null;

	/** The m_items. */
	@XStreamAlias("Items")
	private ArrayList<IOrderItem> m_items = null;
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#getCustomerAddress()
	 */
	public IAddress getCustomerAddress() {
		return this.m_customerAdress;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#setCustomerAddress(com.stewart.developerworks.article5.bal.entities.address.IAddress)
	 */
	public void setCustomerAddress(IAddress value) {
		this.m_customerAdress = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#setCompanyAddress(com.stewart.developerworks.article5.bal.entities.address.IAddress)
	 */
	public void setCompanyAddress(IAddress value) {
		this.m_companyAddr = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#getCompanyAddress()
	 */
	public IAddress getCompanyAddress() {
		return this.m_companyAddr;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#getOrderId()
	 */
	public String getId() {
		return this.m_orderId;
	}		
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#getOrderDate()
	 */
	public Date getOrderDate() {
		return this.m_orderDate;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#setOrderDate(java.util.Date)
	 */
	public void setOrderDate(Date value) {
		this.m_orderDate = value;
	}
	
	/**
	 * Instantiates a new order summary entity.
	 */
	public PurchaseOrder(String uniqueId) {
		this.m_orderId = uniqueId;
		this.m_companyAddr = new Address();
		this.m_customerAdress = new Address();
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#addItem(com.stewart.developerworks.article5.bal.entities.purchaseorder.OrderItem)
	 */
	public void addItem(IOrderItem detail) {
		if (this.m_items == null) {
			this.m_items = new ArrayList<IOrderItem>();
		}
		
		this.m_items.add(detail);;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#getItems()
	 */
	public Iterator<IOrderItem> getItems() {
		if (this.m_items == null) {
			this.m_items = new ArrayList<IOrderItem>();
		}
		
		return this.m_items.iterator();
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#getItemCount()
	 */
	public int getItemCount( ){
		if (this.m_items == null) return 0;
		
		return this.m_items.size();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.purchaseorder.IPurchaseOrder#toString()
	 */
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append("{Id=");
		str.append(this.getId());
		str.append(", Reference Id=");
		str.append(this.getId());
		str.append(", OrderDate=");
		str.append(this.getOrderDate());
		str.append(", Item Count=");
		str.append(this.getItemCount());
		str.append(", Address=");
		str.append(this.getCompanyAddress().toString());
		str.append(", Vendor Address=");		
		str.append(this.getCustomerAddress().toString());
		str.append(", Items={");
		Iterator<IOrderItem> itemIter = this.getItems();
		while(itemIter.hasNext()) {
			IOrderItem item = itemIter.next();
			str.append(item.toString());			
		}
		str.append("}}");
		
		return str.toString();
	}

	@Override
	public String toXml() {
		XStream xstream = new XStream();
		xstream.autodetectAnnotations(true);
		return xstream.toXML(this);
	}
}
