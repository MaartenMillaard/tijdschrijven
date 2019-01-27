package nl.gemeente.groningen.tijdschrijven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Opdrachtgevers")
public class Opdrachtgever {
	@Column(length = 50, unique = true, nullable = false)
	private String naam;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int opdrachtgeverId;

	@Column(length = 50, nullable = false)
	private String organisatie;
	
	public Opdrachtgever() {}

	public Opdrachtgever(String naam, String organisatie) {
		this.naam = naam;
		this.organisatie = organisatie;
	}

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
