package com.vipin.soap.client;

import net.webservicex.Country;

public class SimpleSoapClient {

	public static void main(String[] args) {
		Country country = new Country();
		/*String result = country.getCountrySoap().getCurrencyCode();
		System.out.println("result is " + result);*/
		
		System.out.println();
		System.out.println(country.getCountrySoap().getCountries());
		System.out.println();
		System.out.println(country.getWSDLDocumentLocation());
		System.out.println();
	}
}