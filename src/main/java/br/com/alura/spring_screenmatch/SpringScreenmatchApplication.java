package br.com.alura.spring_screenmatch;

import br.com.alura.spring_screenmatch.models.ConvertData;
import br.com.alura.spring_screenmatch.models.SerieData;
import br.com.alura.spring_screenmatch.service.ApiConsumer;
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
		ApiConsumer apiConsumer = new ApiConsumer();
		var json = apiConsumer.fetchData("https://www.omdbapi.com/?t=gilmore+girls&apikey=6124c0b2");
		System.out.println(json);
		ConvertData convert = new ConvertData();
		SerieData data = convert.getData(json, SerieData.class);
		System.out.println(data);
	}
}
