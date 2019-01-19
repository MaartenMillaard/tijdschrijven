package nl.gemeente.groningen.tijdschrijven;

import java.util.ArrayList;

public class Afdeling {
	private String code;
	private ArrayList<Medewerker> medewerkers;
	private String naam;

	public Afdeling(String code, String naam) {
		this.code = code;
		this.naam = naam;
	}

	public String getCode() {
		return code;
	}

	public ArrayList<Medewerker> getMedewerkers() {
		return medewerkers;
	}

	public String getNaam() {
		return naam;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Afdeling [code=" + code + ", naam=" + naam + "]";
	}

}
