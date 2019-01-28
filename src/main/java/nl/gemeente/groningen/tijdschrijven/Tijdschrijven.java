package nl.gemeente.groningen.tijdschrijven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tijdschrijven {

	@Autowired
	public static void main(String[] args) {
		System.out.println("Starting application...");

		SpringApplication.run(Tijdschrijven.class, args);
	}
}
