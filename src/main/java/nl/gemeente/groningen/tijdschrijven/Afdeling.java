package nl.gemeente.groningen.tijdschrijven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Afdelingen")
public class Afdeling {

	@Id
	@Column(length = 10, unique = true, nullable = false)
	private String code;
	
	@Column(length = 50, unique = true, nullable = false)
	private String naam;
	
	public Afdeling(int afdelingId, String code, String naam) {
		this.code = code;
		this.naam = naam;
	}

	public Afdeling(String code, String naam) {
		this.code = code;
		this.naam = naam;
	}

	public String getCode() {
		return code;
	}

	public String getNaam() {
		return naam;
	}

//	public void setAfdelingId(int afdelingId) {
//		this.afdelingId = afdelingId;
//	}
//
	public void setCode(String code) {
		this.code = code.replace((char) 32, (char) 95).toUpperCase();
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Afdeling [code=" + code + ", naam=" + naam + "]";
	}

}
