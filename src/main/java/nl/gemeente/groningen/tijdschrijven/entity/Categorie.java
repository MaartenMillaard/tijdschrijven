package nl.gemeente.groningen.tijdschrijven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "categorieen")
public class Categorie {

	public Categorie() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categorieId;
	@UniqueElements
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
