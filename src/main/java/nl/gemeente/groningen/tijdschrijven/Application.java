package nl.gemeente.groningen.tijdschrijven;

import java.util.Calendar;

public class Application {
	private static Afdeling afdeling;
	private static Medewerker medewerker;
	private static Opdrachtgever opdrachtgever;
	private static Project project;
	private static Registratie registratie;

	public static void main(String[] args) {
		afdeling = new Afdeling("OIS", "Afdeling Onderzoek, Informatie en Statistiek");
		System.out.println(afdeling.toString());

		medewerker = new Medewerker("mermil1s", "Merlijn", "Millaard", 0.9, afdeling);
		System.out.println(medewerker.toString());
		medewerker.addRol(Rol.COORDINATOR);
		System.out.println(medewerker.toString());

		opdrachtgever = new Opdrachtgever("Arne", "DMO");
		System.out.println(opdrachtgever.toString());

		project = new Project("IND", "DMO - Indicatiewaarden", opdrachtgever, Calendar.getInstance().getTime());
		System.out.println(project.toString());

		registratie = new Registratie(medewerker, medewerker.getAfdeling());
		registratie.setDatum(Calendar.getInstance().getTime());
		registratie.setProject(project);
		registratie.setUren(1.3);
		registratie.setAfdeling(new Afdeling("DMO", "Directie Maatschappelijke Ondersteuning"));
		registratie.setOpdrachtgever(opdrachtgever);
		System.out.println(registratie.toString());
	}
}
