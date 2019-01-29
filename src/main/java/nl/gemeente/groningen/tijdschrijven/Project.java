package nl.gemeente.groningen.tijdschrijven;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Project")
public class Project extends Onderdeel {
	@Column(nullable = false)
	private Calendar begindatum;

	@Column()
	private Calendar einddatum;

	@ManyToOne
	@JoinColumn()
	private Opdrachtgever opdrachtgever;

	public Calendar getBegindatum() {
		return begindatum;
	}

	public Calendar getEinddatum() {
		return einddatum;
	}

	public Opdrachtgever getOpdrachtgever() {
		return opdrachtgever;
	}

	public void setBegindatum(Calendar begindatum) {
		this.begindatum = begindatum;
	}

	public void setEinddatum(Calendar einddatum) {
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
