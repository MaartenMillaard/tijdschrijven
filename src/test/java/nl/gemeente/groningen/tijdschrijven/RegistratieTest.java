package nl.gemeente.groningen.tijdschrijven;

import org.junit.jupiter.api.Test;

class RegistratieTest {

	@Test
	void test() {
		Afdeling afdeling = new Afdeling("AFD", "Naam");
		Medewerker medewerker = new Medewerker("maamil1s", "Maarten", "Millaard", 0.8, afdeling);
		Registratie registratie = new Registratie(medewerker, afdeling);
	}

}
