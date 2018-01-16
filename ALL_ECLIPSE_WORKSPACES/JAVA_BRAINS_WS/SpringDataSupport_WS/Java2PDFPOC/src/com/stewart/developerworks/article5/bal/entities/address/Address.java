package com.stewart.developerworks.article5.bal.entities.address;

import com.stewart.developerworks.article5.interfaces.IAddress;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Address")
public class Address implements IAddress {
	@XStreamAlias("CompanyName")
	private String m_companyName = null;
	
	@XStreamAlias("StreetAddress")
	private String m_streetAddress = null;
	
	@XStreamAlias("City")
	private String m_cityName = null;
	
	@XStreamAlias("State")
	private String m_stateName = null;
	
	@XStreamAlias("ZipCode")
	private String m_zipCode = null;
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#getCompanyName()
	 */
	public String getCompanyName() {
		return this.m_companyName;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#setCompanyName(java.lang.String)
	 */
	public void setCompanyName(String value) {
		this.m_companyName = value;
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#getStreetAddress()
	 */
	public String getStreetAddress() {
		return this.m_streetAddress;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#setStreetAddress(java.lang.String)
	 */
	public void setStreetAddress(String value) {
		this.m_streetAddress = value;
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#setCity(java.lang.String)
	 */
	public void setCity(String value) {
		this.m_cityName = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#getCity()
	 */
	public String getCity() {
		return this.m_cityName;
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#getState()
	 */
	public String getState() {
		return this.m_stateName;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#setState(java.lang.String)
	 */
	public void setState(String value) {
		this.m_stateName = value;
	}
	
	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#getZipCode()
	 */
	public String getZipCode() {
		return this.m_zipCode;
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#setZipCode(java.lang.String)
	 */
	public void setZipCode(String value) {
		this.m_zipCode = value;
	}

	/* (non-Javadoc)
	 * @see com.stewart.developerworks.article5.bal.entities.address.IAddress#toString()
	 */
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		
		str.append("{Company=");
		str.append(this.getCompanyName());
		str.append(", Street Address=");
		str.append(this.getStreetAddress());
		str.append(", City=");
		str.append(this.getCity());
		str.append(", State=");
		str.append(this.getState());
		str.append(", Zip Code=");
		str.append(this.getZipCode());
		str.append("}");
		
		return str.toString();
	}
}
