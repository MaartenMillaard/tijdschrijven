package nl.gemeente.groningen.tijdschrijven.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medewerkers")
public class Medewerker {

	@Id
	private String medewerkercode;
	private String voornaam;
	private String voorvoegsels;
	private String achternaam;
	@ManyToOne
	@JoinColumn(name = "afdelingId")
	private Afdeling afdeling;
	private double deeltijdfactor;

	public Medewerker() {
	}

	public String getAchternaam() {
		return achternaam;
	}

	public Afdeling getAfdeling() {
		return afdeling;
	}

	public double getDeeltijdfactor() {
		return deeltijdfactor;
	}

	public String getInlogcode() {
		return medewerkercode;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getVoorvoegsels() {
		return voorvoegsels;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public void setAfdeling(Afdeling afdeling) {
		this.afdeling = afdeling;
	}

	public void setDeeltijdfactor(double deeltijdfactor) {
		this.deeltijdfactor = deeltijdfactor;
	}

	public void setInlogcode(String inlogcode) {
		this.medewerkercode = inlogcode;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setVoorvoegsels(String voorvoegsels) {
		this.voorvoegsels = voorvoegsels;
	}

	@Override
	public String toString() {
		return "Medewerker [medewerkercode=" + medewerkercode + ", voornaam=" + voornaam + ", voorvoegsels="
				+ voorvoegsels + ", achternaam=" + achternaam + ", afdeling=" + afdeling + ", deeltijdfactor="
				+ deeltijdfactor + "]";
	}

	private String getMedewerkercode() {
		return medewerkercode;
	}

	private void setMedewerkercode(String medewerkercode) {
		this.medewerkercode = medewerkercode;
	}

}
