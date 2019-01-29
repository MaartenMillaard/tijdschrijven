package nl.gemeente.groningen.tijdschrijven;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Onderdeel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int onderdeelId;
	@ManyToOne
	private Categorie categorie;
	private String naam;
	private Calendar begindatum;
	private Calendar einddatum;
	@ManyToOne
	private Opdrachtgever opdrachtgever;
	@ManyToOne
	private Afdeling afdeling;
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
