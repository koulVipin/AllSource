package com.vipin.domain;

public class HTDummy {

	private String Sovellustunnus;
	private String Asiakirjatyyppi;
	private String AsiakirjanSaapumiskanava;
	private String AsiakirjanSaapumispäivä;  // Date and time
	
	private String RatkaisunKuvaus;
	private String Käsittelijä;
	private String PäivämääräJaKellonaika; // Date and time
	
	public HTDummy() {
		Sovellustunnus = "TH";
		Asiakirjatyyppi = "Terveysselvitys";
		AsiakirjanSaapumiskanava = "Käsittelijän lisäämä";
		AsiakirjanSaapumispäivä = "2016-04-07 12:59:33";
		
		RatkaisunKuvaus = "T+s: Ppvp (p), Re Kihti (p), savolan";
		Käsittelijä = "B632791";
		PäivämääräJaKellonaika = "2016-04-08 10:48:43";
	}

	public String getSovellustunnus() {
		return Sovellustunnus;
	}

	public void setSovellustunnus(String sovellustunnus) {
		Sovellustunnus = sovellustunnus;
	}

	public String getAsiakirjatyyppi() {
		return Asiakirjatyyppi;
	}

	public void setAsiakirjatyyppi(String asiakirjatyyppi) {
		Asiakirjatyyppi = asiakirjatyyppi;
	}

	public String getAsiakirjanSaapumiskanava() {
		return AsiakirjanSaapumiskanava;
	}

	public void setAsiakirjanSaapumiskanava(String asiakirjanSaapumiskanava) {
		AsiakirjanSaapumiskanava = asiakirjanSaapumiskanava;
	}

	public String getAsiakirjanSaapumispäivä() {
		return AsiakirjanSaapumispäivä;
	}

	public void setAsiakirjanSaapumispäivä(String asiakirjanSaapumispäivä) {
		AsiakirjanSaapumispäivä = asiakirjanSaapumispäivä;
	}

	public String getRatkaisunKuvaus() {
		return RatkaisunKuvaus;
	}

	public void setRatkaisunKuvaus(String ratkaisunKuvaus) {
		RatkaisunKuvaus = ratkaisunKuvaus;
	}

	public String getKäsittelijä() {
		return Käsittelijä;
	}

	public void setKäsittelijä(String käsittelijä) {
		Käsittelijä = käsittelijä;
	}

	public String getPäivämääräJaKellonaika() {
		return PäivämääräJaKellonaika;
	}

	public void setPäivämääräJaKellonaika(String päivämääräJaKellonaika) {
		PäivämääräJaKellonaika = päivämääräJaKellonaika;
	}

	@Override
	public String toString() {
		return "HTDummy [Sovellustunnus=" + Sovellustunnus + ", Asiakirjatyyppi=" + Asiakirjatyyppi
				+ ", AsiakirjanSaapumiskanava=" + AsiakirjanSaapumiskanava + ", AsiakirjanSaapumispäivä="
				+ AsiakirjanSaapumispäivä + ", RatkaisunKuvaus=" + RatkaisunKuvaus + ", Käsittelijä=" + Käsittelijä
				+ ", PäivämääräJaKellonaika=" + PäivämääräJaKellonaika + "]";
	}
}