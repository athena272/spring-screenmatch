package br.com.alura.spring_screenmatch.main;

import br.com.alura.spring_screenmatch.models.ConvertData;
import br.com.alura.spring_screenmatch.models.EpisodeData;
import br.com.alura.spring_screenmatch.models.SeasonData;
import br.com.alura.spring_screenmatch.models.SerieData;
import br.com.alura.spring_screenmatch.service.ApiConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private final Scanner input = new Scanner(System.in);
    private final ApiConsumer apiConsumer = new ApiConsumer();
    ConvertData convert = new ConvertData();
    private final String BASE_URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY = System.getenv("API_KEY");

    public void displayMenu() {
        System.out.println("API_KEY: " + API_KEY);
        System.out.println("Enter the name of the series for the search:");
        var seriesName = input.nextLine();
        var json = apiConsumer.fetchData(BASE_URL + seriesName.replace(" ", "+") + "&apikey=" + API_KEY);
        SerieData serieData = convert.getData(json, SerieData.class);
        System.out.println("JSON Response: " + serieData);

        List<SeasonData> seasons = new ArrayList<>();
        for (int i = 1; i <= serieData.totalSeasons(); i++) {
            json = apiConsumer.fetchData(BASE_URL + seriesName.replace(" ", "+") + "&season=" + i + "&apikey=" + API_KEY);
            SeasonData seasonData = convert.getData(json, SeasonData.class);
            seasons.add(seasonData);
        }
        //seasons.forEach(season -> System.out.println(season));
        seasons.forEach(System.out::println);

        seasons.forEach(season -> season.episodes().
                forEach(episode -> System.out.println(episode.title())));
    }
}
