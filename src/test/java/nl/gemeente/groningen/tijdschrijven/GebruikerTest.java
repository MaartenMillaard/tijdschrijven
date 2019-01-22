package nl.gemeente.groningen.tijdschrijven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GebruikerTest {

	@Test
	void test() {
		Afdeling afdeling = new Afdeling("OIS", "Onderzoek, Informatie & Statistiek");
		Medewerker medewerker1 = new Medewerker("maamil1s", "Maarten", "Millaard", 1.0, afdeling);
		Medewerker medewerker2 = new Medewerker("arjheg1d", "Arjan", "Hegge", 1.0, afdeling);
		Gebruiker gebruiker = new Gebruiker(medewerker1);
		
		assertTrue(gebruiker instanceof Gebruiker);
		assertTrue(gebruiker.getGebruiker().getInlogcode() == "maamil1s");
		assertTrue(gebruiker.getRol() == Rol.MEDEWERKER);
		assertTrue(gebruiker.getWachtwoord() == "welkom");
		
		gebruiker.setGebruiker(medewerker2);
		gebruiker.setRol(Rol.COORDINATOR);
		gebruiker.setWachtwoord("Tot ziens");
		
		assertTrue(gebruiker.getRol() != Rol.MEDEWERKER);
		assertTrue(gebruiker.getWachtwoord() != "welkom");
		assertTrue(gebruiker.toString().length() > 1);

	}

}
