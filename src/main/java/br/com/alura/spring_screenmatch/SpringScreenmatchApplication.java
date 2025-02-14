package br.com.alura.spring_screenmatch;

import br.com.alura.spring_screenmatch.models.ConvertData;
import br.com.alura.spring_screenmatch.models.EpisodeData;
import br.com.alura.spring_screenmatch.models.SeasonData;
import br.com.alura.spring_screenmatch.models.SerieData;
import br.com.alura.spring_screenmatch.service.ApiConsumer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

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
		SerieData serieData = convert.getData(json, SerieData.class);
		System.out.println(serieData);
		System.out.println("---------------------------------------------------");
		json = apiConsumer.fetchData("https://omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6124c0b2");
		EpisodeData episodeData = convert.getData(json, EpisodeData.class);
		System.out.println(episodeData);
		System.out.println("---------------------------------------------------");
		List<SeasonData> seasons = new ArrayList<>();
		for (int i = 1; i <= serieData.totalSeasons(); i++) {
			json = apiConsumer.fetchData("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=6124c0b2");
			SeasonData seasonData = convert.getData(json, SeasonData.class);
			seasons.add(seasonData);
		}
		//seasons.forEach(System.out::println);
		seasons.forEach(season -> System.out.println(season));
	}
}
