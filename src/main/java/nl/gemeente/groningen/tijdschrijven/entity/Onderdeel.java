package nl.gemeente.groningen.tijdschrijven.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "onderdelen")
public class Onderdeel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int onderdeelId;
	@ManyToOne
	@JoinColumn(name = "categorieId")
	private Categorie categorie;
	@UniqueElements
	private String naam;
	private Calendar begindatum;
	private Calendar einddatum;
	@ManyToOne
	@JoinColumn(name = "opdrachtgeverId")
	private Opdrachtgever opdrachtgever;
	@ManyToOne
	@JoinColumn(name = "afdelingId")
	private Afdeling afdeling;

	public Onderdeel() {
	}

	private int getOnderdeelId() {
		return onderdeelId;
	}

	private void setOnderdeelId(int onderdeelId) {
		this.onderdeelId = onderdeelId;
	}

	private Categorie getCategorie() {
		return categorie;
	}

	private void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	private String getNaam() {
		return naam;
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}

	private Calendar getBegindatum() {
		return begindatum;
	}

	private void setBegindatum(Calendar begindatum) {
		this.begindatum = begindatum;
	}

	private Calendar getEinddatum() {
		return einddatum;
	}

	private void setEinddatum(Calendar einddatum) {
		this.einddatum = einddatum;
	}

	private Opdrachtgever getOpdrachtgever() {
		return opdrachtgever;
	}

	private void setOpdrachtgever(Opdrachtgever opdrachtgever) {
		this.opdrachtgever = opdrachtgever;
	}

	private Afdeling getAfdeling() {
		return afdeling;
	}

	private void setAfdeling(Afdeling afdeling) {
		this.afdeling = afdeling;
	}

	@Override
	public String toString() {
		return "Onderdeel [onderdeelId=" + onderdeelId + ", categorie=" + categorie + ", naam=" + naam + ", begindatum="
				+ begindatum + ", einddatum=" + einddatum + ", opdrachtgever=" + opdrachtgever + ", afdeling="
				+ afdeling + "]";
	}

}
