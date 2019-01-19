package nl.gemeente.groningen.tijdschrijven;

import java.util.Date;

public class Project extends Onderdeel {
	private Date begindatum;
	private String code;
	private Date einddatum;
	private Opdrachtgever opdrachtgever;

	public Project(String code, String naam, Opdrachtgever opdrachtgever, Date begindatum) {
		super(code, naam);
		this.opdrachtgever = opdrachtgever;
		this.begindatum = begindatum;
	}

	public Date getBegindatum() {
		return begindatum;
	}

	@Override
	public String getCode() {
		return code;
	}

	public Date getEinddatum() {
		return einddatum;
	}

	public Opdrachtgever getOpdrachtgever() {
		return opdrachtgever;
	}

	public void setBegindatum(Date begindatum) {
		this.begindatum = begindatum;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	public void setEinddatum(Date einddatum) {
		this.einddatum = einddatum;
	}

	public void setOpdrachtgever(Opdrachtgever opdrachtgever) {
		this.opdrachtgever = opdrachtgever;
	}

	@Override
	public String toString() {
		return "Project [code=" + code + ", opdrachtgever=" + opdrachtgever + ", begindatum=" + begindatum
				+ ", einddatum=" + einddatum + "]";
	}

}
