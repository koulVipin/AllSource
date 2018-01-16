package com.vipin.domain;

public class HTDummy {

	private String Sovellustunnus;
	private String Asiakirjatyyppi;
	private String AsiakirjanSaapumiskanava;
	private String AsiakirjanSaapumisp‰iv‰;  // Date and time
	
	private String RatkaisunKuvaus;
	private String K‰sittelij‰;
	private String P‰iv‰m‰‰r‰JaKellonaika; // Date and time
	
	public HTDummy() {
		Sovellustunnus = "TH";
		Asiakirjatyyppi = "Terveysselvitys";
		AsiakirjanSaapumiskanava = "K‰sittelij‰n lis‰‰m‰";
		AsiakirjanSaapumisp‰iv‰ = "2016-04-07 12:59:33";
		
		RatkaisunKuvaus = "T+s: Ppvp (p), Re Kihti (p), savolan";
		K‰sittelij‰ = "B632791";
		P‰iv‰m‰‰r‰JaKellonaika = "2016-04-08 10:48:43";
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

	public String getAsiakirjanSaapumisp‰iv‰() {
		return AsiakirjanSaapumisp‰iv‰;
	}

	public void setAsiakirjanSaapumisp‰iv‰(String asiakirjanSaapumisp‰iv‰) {
		AsiakirjanSaapumisp‰iv‰ = asiakirjanSaapumisp‰iv‰;
	}

	public String getRatkaisunKuvaus() {
		return RatkaisunKuvaus;
	}

	public void setRatkaisunKuvaus(String ratkaisunKuvaus) {
		RatkaisunKuvaus = ratkaisunKuvaus;
	}

	public String getK‰sittelij‰() {
		return K‰sittelij‰;
	}

	public void setK‰sittelij‰(String k‰sittelij‰) {
		K‰sittelij‰ = k‰sittelij‰;
	}

	public String getP‰iv‰m‰‰r‰JaKellonaika() {
		return P‰iv‰m‰‰r‰JaKellonaika;
	}

	public void setP‰iv‰m‰‰r‰JaKellonaika(String p‰iv‰m‰‰r‰JaKellonaika) {
		P‰iv‰m‰‰r‰JaKellonaika = p‰iv‰m‰‰r‰JaKellonaika;
	}

	@Override
	public String toString() {
		return "HTDummy [Sovellustunnus=" + Sovellustunnus + ", Asiakirjatyyppi=" + Asiakirjatyyppi
				+ ", AsiakirjanSaapumiskanava=" + AsiakirjanSaapumiskanava + ", AsiakirjanSaapumisp‰iv‰="
				+ AsiakirjanSaapumisp‰iv‰ + ", RatkaisunKuvaus=" + RatkaisunKuvaus + ", K‰sittelij‰=" + K‰sittelij‰
				+ ", P‰iv‰m‰‰r‰JaKellonaika=" + P‰iv‰m‰‰r‰JaKellonaika + "]";
	}
}