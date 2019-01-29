package nl.gemeente.groningen.tijdschrijven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum Categorie {
	PROJECT("Project"), OVERHEAD("Overhead"), AFWEZIGHEID("Afwezigheid");

	private Categorie(String categorie) {
		this.categorie = categorie;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categorieId;
	private String categorie;
	
	private int getCategorieId() {
		return categorieId;
	}
	private void setCategorieId(int categorieId) {
		this.categorieId = categorieId;
	}
	private String getCategorie() {
		return categorie;
	}
	private void setCategorie(String categorie) {
		this.categorie = categorie;
	}
}
