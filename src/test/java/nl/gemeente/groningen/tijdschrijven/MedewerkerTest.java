package nl.gemeente.groningen.tijdschrijven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MedewerkerTest {

	private Afdeling afdeling;
	private Medewerker medewerker, medewerker2;

	@Test
	void test() {
		afdeling = new Afdeling("AFD", "Afdeling");
		medewerker = new Medewerker("a", "Jan", "Klaassen", 1.0, afdeling);
		medewerker2 = new Medewerker("a", "Pipo", "de", "Clown", 0.8, afdeling);

		assertTrue(medewerker.getInlogcode().length() > 0);
		assertTrue(medewerker.getVoornaam().length() > 0);
		assertNull(medewerker.getVoorvoegsels());
		assertNotNull(medewerker2.getVoorvoegsels());
		assertTrue(medewerker.getAchternaam().length() > 0);
		assertEquals(1.0, medewerker.getDeeltijdfactor());
		assertEquals(0.8, medewerker2.getDeeltijdfactor());
		assertEquals(afdeling, medewerker.getAfdeling());
		assertTrue(medewerker.getAfdeling().getCode().length() > 0);
		assertTrue(medewerker.getRollen().size() == 1);

		medewerker.setInlogcode("b");
		medewerker.setVoornaam("Pipo");
		medewerker.setVoorvoegsels("de");
		medewerker.setAchternaam("Clown");
		medewerker.setDeeltijdfactor(medewerker.getDeeltijdfactor() / 3);
		medewerker.addRol(Rol.COORDINATOR);

		assertTrue(medewerker.getInlogcode().length() > 0);
		assertTrue(medewerker.getVoornaam().length() > 0);
		assertFalse(medewerker.getVoorvoegsels() == null);
		assertTrue(medewerker.getAchternaam().length() > 0);
		assertFalse(Double.isNaN(medewerker.getDeeltijdfactor()));
		assertTrue(medewerker.getAfdeling() instanceof Afdeling);
		assertTrue(medewerker.getAfdeling().getCode().length() > 0);
		assertTrue(medewerker.getRollen() instanceof ArrayList<?>);
		assertTrue(medewerker.getRollen().size() == 2);

	}

}
