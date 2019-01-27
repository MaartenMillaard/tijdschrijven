package nl.gemeente.groningen.tijdschrijven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Medewerkers")
public class Medewerker {
	
	public Medewerker() {}
	public Medewerker(String inlogcode, String voornaam, String achternaam, double deeltijdfactor, Afdeling afdeling) {
		this.code = inlogcode;
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.deeltijdfactor = deeltijdfactor;
		this.afdeling = afdeling;
	}
	
	public Medewerker(String inlogcode, String voornaam, String voorvoegsels, String achternaam, double deeltijdfactor,
			Afdeling afdeling) {
		this.code = inlogcode;
		this.voornaam = voornaam;
		this.voorvoegsels = voorvoegsels;
		this.achternaam = achternaam;
		this.deeltijdfactor = deeltijdfactor;
		this.afdeling = afdeling;
	}
	
	@Column(length = 50, nullable = false)
	private String achternaam;

	@ManyToOne
	@JoinColumn()
	private Afdeling afdeling;

	@Id
	@Column(length = 8, nullable = false, unique = true)
	private String code;

	@Column(nullable = false)
	private double deeltijdfactor;

	@Column(length = 50, nullable = false)
	private String voornaam;

	@Column(length = 10, nullable = true)
	private String voorvoegsels;

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
		return code;
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
		this.code = inlogcode;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setVoorvoegsels(String voorvoegsels) {
		this.voorvoegsels = voorvoegsels;
	}

	@Override
	public String toString() {
		return "Medewerker [inlogcode=" + code + ", achternaam=" + achternaam + ", afdelingId=" + afdeling
				+ ", deeltijdfactor=" + deeltijdfactor + ", voornaam=" + voornaam + ", voorvoegsels=" + voorvoegsels
				+ "]";
	}

}
