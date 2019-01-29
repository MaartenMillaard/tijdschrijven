package nl.gemeente.groningen.tijdschrijven;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import nl.gemeente.groningen.tijdschrijven.entity.Gebruiker;

@RestResource(exported = false)
public interface GebruikerRepository extends JpaRepository<Gebruiker, String> {

}
