package br.com.alura.spring_screenmatch.main;

import br.com.alura.spring_screenmatch.service.ApiConsumer;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);
    private ApiConsumer apiConsumer = new ApiConsumer();
    private final String BASE_URL = "https://www.omdbapi.com/?t=";
    private final String API_KEY = System.getenv("API_KEY");
}
