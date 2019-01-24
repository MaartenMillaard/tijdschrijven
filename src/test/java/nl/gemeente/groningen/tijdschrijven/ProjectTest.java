package nl.gemeente.groningen.tijdschrijven;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class ProjectTest {

	@Test
	void test() {
		Opdrachtgever opdrachtgever = new Opdrachtgever("Naam", "Organisatie");
		Calendar begindatum = Calendar.getInstance();
		Calendar einddatum = new GregorianCalendar(2999, 12, 31);
		
		Project project = new Project("001", "Projectnaam", opdrachtgever, begindatum, einddatum);
		
		assertTrue(project.getCode() != null);
		assertTrue(project.getNaam() != null);
		assertTrue(project.getOpdrachtgever().getNaam() != null);
		assertTrue(project.getEinddatum().after(project.getBegindatum()));
		
}

}
