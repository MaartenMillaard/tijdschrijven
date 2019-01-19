package nl.gemeente.groningen.tijdschrijven;

import java.util.ArrayList;

public class Medewerker {
	private String achternaam;
	private Afdeling afdeling;
	private double deeltijdfactor;
	private String inlogcode;
	private String password = "welkom";
	private ArrayList<Rol> rollen = new ArrayList<>();
	private String voornaam;
	private String voorvoegsels;

	public Medewerker(String inlogcode, String voornaam, String achternaam, double deeltijdfactor, Afdeling afdeling) {
		this.inlogcode = inlogcode;
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.deeltijdfactor = deeltijdfactor;
		this.afdeling = afdeling;
		this.password = getPassword();
		this.rollen.add(Rol.MEDEWERKER);
	}

	public Medewerker(String inlogcode, String voornaam, String voorvoegsels, String achternaam, double deeltijdfactor,
			Afdeling afdeling) {
		this.inlogcode = inlogcode;
		this.voornaam = voornaam;
		this.voorvoegsels = voorvoegsels;
		this.achternaam = achternaam;
		this.deeltijdfactor = deeltijdfactor;
		this.afdeling = afdeling;
		this.password = getPassword();
		this.rollen.add(Rol.MEDEWERKER);
	}

	public void addRol(Rol rol) {
		rollen.add(rol);
	}

	public String getAchternaam() {
		return achternaam;
	}

	public Afdeling getAfdeling() {
		return afdeling;
	}

	public double getDeeltijdfactor() {
		return deeltijdfactor;
	}

	public String getInlogcode() {
		return inlogcode;
	}

	public String getPassword() {
		return password;
	}

	public ArrayList<Rol> getRollen() {
		return rollen;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public String getVoorvoegsels() {
		return voorvoegsels;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public void setAfdeling(Afdeling afdeling) {
		this.afdeling = afdeling;
	}

	public void setDeeltijdfactor(double deeltijdfactor) {
		this.deeltijdfactor = deeltijdfactor;
	}

	public void setInlogcode(String inlogcode) {
		this.inlogcode = inlogcode;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRollen(ArrayList<Rol> rollen) {
		this.rollen = rollen;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public void setVoorvoegsels(String voorvoegsels) {
		this.voorvoegsels = voorvoegsels;
	}

	@Override
	public String toString() {
		return "Medewerker [inlogcode=" + inlogcode + ", naam=" + voornaam + " "
				+ (voorvoegsels == null ? "" : voorvoegsels) + ", deeltijdfactor=" + deeltijdfactor + ", afdeling="
				+ afdeling + ", rollen=" + rollen + "]";
	}

}
