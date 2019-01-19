package nl.gemeente.groningen.tijdschrijven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AfdelingTest {
	Afdeling afd;

	@Test
	void test() {
		afd = new Afdeling("AFD", "Afdeling");
		assertTrue(afd instanceof Afdeling);
		assertTrue(afd.getCode().length() > 0);
		assertTrue(afd.getNaam().length() > 0);
	}

}
