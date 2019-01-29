package nl.gemeente.groningen.tijdschrijven.entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registraties")
public class Registratie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int registratieId;
	private Calendar datum;
	@ManyToOne
	@JoinColumn(name = "medewerkercode")
	private Medewerker medewerker;
	@ManyToOne
	@JoinColumn(name = "onderdeelId")
	private Onderdeel onderdeel;
	@ManyToOne
	@JoinColumn(name = "opdrachtgeverId")
	private Opdrachtgever opdrachtgever;
	@ManyToOne
	@JoinColumn(name = "afdelingId")
	private Afdeling afdeling;
	private double uren = 0;
	private Calendar registratiedatum;

	public Registratie() {
	}

	private int getRegistratieId() {
		return registratieId;
	}

	private void setRegistratieId(int registratieId) {
		this.registratieId = registratieId;
	}

	private Afdeling getAfdeling() {
		return afdeling;
	}

	private void setAfdeling(Afdeling afdeling) {
		this.afdeling = afdeling;
	}

	private Calendar getDatum() {
		return datum;
	}

	private void setDatum(Calendar datum) {
		this.datum = datum;
	}

	private Medewerker getMedewerker() {
		return medewerker;
	}

	private void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	private Opdrachtgever getOpdrachtgever() {
		return opdrachtgever;
	}

	private void setOpdrachtgever(Opdrachtgever opdrachtgever) {
		this.opdrachtgever = opdrachtgever;
	}

	private Onderdeel getOnderdeel() {
		return onderdeel;
	}

	private void setOnderdeel(Onderdeel onderdeel) {
		this.onderdeel = onderdeel;
	}

	private Calendar getRegistratiedatum() {
		return registratiedatum;
	}

	private void setRegistratiedatum(Calendar registratiedatum) {
		this.registratiedatum = registratiedatum;
	}

	private double getUren() {
		return uren;
	}

	private void setUren(double uren) {
		this.uren = uren;
	}

	@Override
	public String toString() {
		return "Registratie [registratieId=" + registratieId + ", afdeling=" + afdeling + ", datum=" + datum
				+ ", medewerker=" + medewerker + ", opdrachtgever=" + opdrachtgever + ", onderdeel=" + onderdeel
				+ ", registratiedatum=" + registratiedatum + ", uren=" + uren + "]";
	}

}