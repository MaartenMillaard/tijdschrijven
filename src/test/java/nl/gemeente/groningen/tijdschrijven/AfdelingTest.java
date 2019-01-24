package nl.gemeente.groningen.tijdschrijven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AfdelingTest {

	@Test
	void test() {
		Afdeling afdeling = new Afdeling("AFD", "Afdeling");
		
		assertTrue(afdeling instanceof Afdeling);
		assertTrue(afdeling.getCode().length() > 0);
		assertTrue(afdeling.getNaam().length() > 0);
		assertTrue(afdeling.toString().length() > 0);
		
		afdeling.setCode("AFD2");
		afdeling.setNaam("Afdeling 2");
		assertTrue(afdeling.getCode() == "AFD2");
		assertTrue(afdeling.getNaam() == "Afdeling 2");
	}

}
