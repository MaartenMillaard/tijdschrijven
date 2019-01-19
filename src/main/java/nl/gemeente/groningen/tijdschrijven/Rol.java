package nl.gemeente.groningen.tijdschrijven;

public enum Rol {
	AFDELINGSHOOFD("Afdelingshoofd"), COORDINATOR("Coördinator"), DIRECTEUR("Directeur"), MEDEWERKER("Medewerker");

	private String rol;

	private Rol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return rol;
	}
}
