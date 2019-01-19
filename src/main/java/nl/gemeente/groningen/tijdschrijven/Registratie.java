package nl.gemeente.groningen.tijdschrijven;

import java.util.Date;

public class Registratie {
	private Afdeling afdeling;
	private Date datum;
	private Medewerker medewerker;
	private Opdrachtgever opdrachtgever;
	private Project project;
	private double uren = 0;

	public Registratie(Medewerker medewerker, Afdeling afdeling) {
		this.medewerker = medewerker;
		this.afdeling = medewerker.getAfdeling();
	}

	public Afdeling getAfdeling() {
		return afdeling;
	}

	public Date getDatum() {
		return datum;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public Opdrachtgever getOpdrachtgever() {
		return opdrachtgever;
	}

	public Project getProject() {
		return project;
	}

	public double getUren() {
		return uren;
	}

	public void setAfdeling(Afdeling afdeling) {
		this.afdeling = afdeling;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public void setOpdrachtgever(Opdrachtgever opdrachtgever) {
		this.opdrachtgever = opdrachtgever;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setUren(double uren) {
		this.uren = uren;
	}

	@Override
	public String toString() {
		return "Registratie [medewerker=" + medewerker + ", project=" + project + ", afdeling=" + afdeling
				+ ", opdrachtgever=" + opdrachtgever + ", datum=" + datum + ", uren=" + uren + "]";
	}

}
