package nl.gemeente.groningen.tijdschrijven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Opdrachtgever {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int opdrachtgeverId;
	private String naam;
	private String organisatie;
	
	public String getNaam() {
		return naam;
	}

	public int getOpdrachtgeverId() {
		return opdrachtgeverId;
	}

	public String getOrganisatie() {
		return organisatie;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void setOpdrachtgeverId(int opdrachtgeverId) {
		this.opdrachtgeverId = opdrachtgeverId;
	}

	public void setOrganisatie(String organisatie) {
		this.organisatie = organisatie;
	}

	@Override
	public String toString() {
		return "Opdrachtgever [opdrachtgeverId=" + opdrachtgeverId + ", naam=" + naam + ", organisatie=" + organisatie
				+ "]";
	}

}
