package nl.gemeente.groningen.tijdschrijven;

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
import javax.persistence.Table;

@Entity
@Table(name = "Onderdelen")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "OnderdeelType", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Generiek")
public class Onderdeel {
	@Column(length = 8, nullable = false)
	private String code;

	@Column(length = 50, nullable = false)
	private String naam;

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int onderdeelId;

	public Onderdeel(String code, String naam) {
		this.code = code;
		this.naam = naam;
	}

	public String getCode() {
		return code;
	}

	public String getNaam() {
		return naam;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return "Onderdeel [onderdeelId=" + onderdeelId + ", code=" + code + ", naam=" + naam + "]";
	}

}
