package com.stewart.developerworks.article5.interfaces;

public interface IAddress {

	/**
	 * Gets the company name.
	 * 
	 * @return the company name
	 */
	 String getCompanyName();

	/**
	 * Sets the company name.
	 * 
	 * @param value the new company name
	 */
	 void setCompanyName(String value);

	/**
	 * Gets the street address.
	 * 
	 * @return the street address
	 */
	 String getStreetAddress();

	/**
	 * Sets the street address.
	 * 
	 * @param value the new street address
	 */
	 void setStreetAddress(String value);

	/**
	 * Sets the city.
	 * 
	 * @param value the new city
	 */
	 void setCity(String value);

	/**
	 * Gets the city.
	 * 
	 * @return the city
	 */
	 String getCity();

	/**
	 * Gets the state.
	 * 
	 * @return the state
	 */
	 String getState();

	/**
	 * Sets the state.
	 * 
	 * @param value the new state
	 */
	 void setState(String value);

	/**
	 * Gets the zip code.
	 * 
	 * @return the zip code
	 */
	 String getZipCode();

	/**
	 * Sets the zip code.
	 * 
	 * @param value the new zip code
	 */
	 void setZipCode(String value);

	 String toString();

}