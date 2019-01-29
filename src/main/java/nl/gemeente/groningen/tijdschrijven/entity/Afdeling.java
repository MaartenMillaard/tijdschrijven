package nl.gemeente.groningen.tijdschrijven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "afdelingen")
public class Afdeling {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int afdelingId;

	@UniqueElements
	private String naam;

	public String getNaam() {
		return naam;
	}

	private int getAfdelingId() {
		return afdelingId;
	}

	private void setAfdelingId(int afdelingId) {
		this.afdelingId = afdelingId;
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Afdeling [afdelingId=" + afdelingId + ", naam=" + naam + "]";
	}

}
