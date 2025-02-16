package br.com.alura.spring_screenmatch.main;

import br.com.alura.spring_screenmatch.service.ApiConsumer;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private ApiConsumer apiConsumer = new ApiConsumer();
    private final String BASE_URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY = System.getenv("API_KEY");

    public void displayMenu() {
        System.out.println("API_KEY: " + API_KEY);
        System.out.println("Enter the name of the series for the search:");
        var seriesName = input.nextLine();
        var json = apiConsumer.fetchData(BASE_URL + seriesName.replace(" ", "+") + "&apikey=" + API_KEY);

        System.out.println("JSON Response: " + json);
    }

    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.displayMenu();
    }
}
