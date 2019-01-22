package nl.gemeente.groningen.tijdschrijven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rollen")
public enum Rol {
	AFDELINGSHOOFD("Afdelingshoofd"), COORDINATOR("Coördinator"), DIRECTEUR("Directeur"), MEDEWERKER("Medewerker");

	@Column(length = 20, nullable = false)
	private String rol;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rolId;

	private Rol(String rol) {
		this.rol = rol;
	}

	public String getRol() {
		return rol;
	}

	public int getRolId() {
		return rolId;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public void setRolId(int rolId) {
		this.rolId = rolId;
	}

	@Override
	public String toString() {
		return rol;
	}
}
