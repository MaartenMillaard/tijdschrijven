package nl.gemeente.groningen.tijdschrijven;

public class Onderdeel {
	private String code;
	private String naam;

	public Onderdeel(String code, String naam) {
		this.code = code;
		this.naam = naam;
	}

	public String getCode() {
		return code;
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
		return "Onderdeel [code=" + code + ", naam=" + naam + "]";
	}

}
