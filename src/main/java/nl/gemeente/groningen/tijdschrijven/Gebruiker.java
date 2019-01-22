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
@Table(name = "Gebruikers")
public class Gebruiker implements Serializable {

	private static final long serialVersionUID = 1L;

	public Gebruiker(Medewerker gebruiker) {
		this.gebruiker = gebruiker;
		this.rol = Rol.MEDEWERKER;
		this.wachtwoord = "welkom";
	}

	@Id
	@OneToOne
	@JoinColumn(referencedColumnName = "code", nullable = false, unique = true)
	private Medewerker gebruiker;

	@Enumerated(EnumType.ORDINAL)
	private Rol rol;

	@Column(nullable = false)
	private String wachtwoord;

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

	@Override
	public String toString() {
		return "Gebruiker [gebruiker=" + gebruiker + ", rol=" + rol + ", wachtwoord=" + wachtwoord + "]";
	}

}
