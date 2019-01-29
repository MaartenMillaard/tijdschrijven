package nl.gemeente.groningen.tijdschrijven;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Gebruiker implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	private Medewerker gebruiker;
	private String wachtwoord;
	private String emailadres;
	@OneToOne
	private Rol rol;

	public Medewerker getGebruiker() {
		return gebruiker;
	}

	public Rol getRol() {
		return rol;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setGebruiker(Medewerker gebruiker) {
		this.gebruiker = gebruiker;
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
		return "Gebruiker [gebruiker=" + gebruiker + ", rol=" + rol + ", wachtwoord=" + wachtwoord + "]";
	}

}
