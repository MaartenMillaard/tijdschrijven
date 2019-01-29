package nl.gemeente.groningen.tijdschrijven.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.tools.web.BadHttpRequest;
import nl.gemeente.groningen.tijdschrijven.GebruikerRepository;
import nl.gemeente.groningen.tijdschrijven.entity.Gebruiker;

@RestController
@RequestMapping(path = "/gebruikers")
public class GebruikerController {
	@Autowired
	private GebruikerRepository gebruikerRepository;

	@GetMapping
	public Iterable<Gebruiker> findAll() {
		return gebruikerRepository.findAll();
	}

	@GetMapping(path = "/{medewerkercode}")
	public Optional<Gebruiker> find(@PathVariable("medewerkercode") String medewerkercode) {
		return gebruikerRepository.findById(medewerkercode);
	}

	@PostMapping(consumes = "application/json")
	public Gebruiker create(@RequestBody Gebruiker gebruiker) {
		return gebruikerRepository.save(gebruiker);
	}

	@DeleteMapping(path = "/{medewerkercode}")
	public void delete(@PathVariable("medewerkercode") String medewerkercode) {
		gebruikerRepository.deleteById(medewerkercode);
	}

	@PutMapping(path = "/{medewerkercode}")
	public Gebruiker update(@PathVariable("medewerkercode") String medewerkercode, @RequestBody Gebruiker gebruiker)
			throws BadHttpRequest {
		if (gebruikerRepository.existsById(medewerkercode)) {
			gebruiker.setMedewerkercode(medewerkercode);
			return gebruikerRepository.save(gebruiker);
		} else {
			throw new BadHttpRequest();
		}
	}

}
