package nl.gemeente.groningen.tijdschrijven;

public class Opdrachtgever {
	private String naam;
	private String organisatie;

	public Opdrachtgever(String naam, String organisatie) {
		this.naam = naam;
		this.organisatie = organisatie;
	}

	public String getNaam() {
		return naam;
	}

	public String getOrganisatie() {
		return organisatie;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setOrganisatie(String organisatie) {
		this.organisatie = organisatie;
	}

	@Override
	public String toString() {
		return "Opdrachtgever [naam=" + naam + ", organisatie=" + organisatie + "]";
	}

}
