package nl.gemeente.groningen.tijdschrijven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@Table(name = "Onderdelen")
@DiscriminatorValue("Project")
public class Project extends Onderdeel {
	@Column(nullable = false)
	private Date begindatum;

	@Column()
	private Date einddatum;

	@ManyToOne
	@JoinColumn()
	private Opdrachtgever opdrachtgever;

	public Project(String code, String naam, Opdrachtgever opdrachtgever, Date begindatum) {
		super(code, naam);
		this.opdrachtgever = opdrachtgever;
		this.begindatum = begindatum;
	}

	public Date getBegindatum() {
		return begindatum;
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

	public void setEinddatum(Date einddatum) {
		this.einddatum = einddatum;
	}

	public void setOpdrachtgever(Opdrachtgever opdrachtgever) {
		this.opdrachtgever = opdrachtgever;
	}

	@Override
	public String toString() {
		return "Project [begindatum=" + begindatum + ", einddatum=" + einddatum + ", opdrachtgever=" + opdrachtgever
				+ "]";
	}

}
