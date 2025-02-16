package br.com.alura.spring_screenmatch;

import br.com.alura.spring_screenmatch.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main mainApp = new Main();
		mainApp.displayMenu();
	}
}
