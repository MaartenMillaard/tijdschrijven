package nl.gemeente.groningen.tijdschrijven.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "gebruikers")
public class Gebruiker {

	@Id
	private String medewerkercode;
	private String wachtwoord;
	@UniqueElements
	private String emailadres;
	@OneToOne
	@JoinColumn(name = "rolId")
	private Rol rol;

	public Gebruiker() {
	}

	public Rol getRol() {
		return rol;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getEmailadres() {
		return emailadres;
	}

	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}

	@Override
	public String toString() {
		return "Gebruiker [medewerkercode=" + medewerkercode + ", wachtwoord=" + wachtwoord + ", emailadres="
				+ emailadres + ", rol=" + rol + "]";
	}

	public String getMedewerkercode() {
		return medewerkercode;
	}

	public void setMedewerkercode(String medewerkercode) {
		this.medewerkercode = medewerkercode;
	}

}
