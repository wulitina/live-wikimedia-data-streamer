package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProducerApplication.class, args);
	}
	@Autowired
	private WikiMediaChangesProducer wikiMediaChangesProducer;

	@Override
	public void run(String... args) throws Exception {
		wikiMediaChangesProducer.sendMessage();
	}
}
