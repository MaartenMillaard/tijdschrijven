package nl.gemeente.groningen.tijdschrijven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "rollen")
public class Rol {

	public Rol() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rolId;
	@UniqueElements
	private String rol;

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
