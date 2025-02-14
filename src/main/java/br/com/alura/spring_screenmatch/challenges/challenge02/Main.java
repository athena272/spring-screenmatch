package br.com.alura.spring_screenmatch.challenges.challenge02;

import br.com.alura.spring_screenmatch.challenges.challenge02.models.Evaluation;
import br.com.alura.spring_screenmatch.challenges.challenge02.models.Task;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Welcome to the counter!");
        System.out.println("----------------------");
        System.out.println("Enter a number for counting: ");
        Scanner input = new Scanner(System.in);
        var number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }

        // Serializing (saving the task object to a JSON file)
        System.out.println("\n----------------------");
        Task task = new Task("watch lesson 1", false, "John");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("task.json"), task);
        System.out.println("JSON created: " + objectMapper.writeValueAsString(task));
        System.out.println("Data saved in task.json file!");

        // Deserializing (reading the task object from the JSON file)
        try {
            Task taskRead = objectMapper.readValue(new File("task.json"), Task.class);
            System.out.println("\nTask read from JSON:");
            System.out.println(taskRead);
        } catch (Exception e) {
            System.out.println("Error reading the JSON file: " + e.getMessage());
        }

        System.out.println("----------------------");
        // Creating evaluations for different items
        Evaluation<String> productEvaluation = new Evaluation<>("Laptop", 9.0, "Great performance!");
        Evaluation<String> serviceEvaluation = new Evaluation<>("Installation Service", 8.5, "Quick and efficient!");
        Evaluation<String> subscriptionEvaluation = new Evaluation<>("Premium Plan", 7.5, "Good, but a bit expensive.");

        // Adding evaluations to a list
        List<Evaluation<String>> evaluations = new ArrayList<>();
        evaluations.add(productEvaluation);
        evaluations.add(serviceEvaluation);
        evaluations.add(subscriptionEvaluation);

        // Printing evaluations
        System.out.println("Evaluations:");
        for (Evaluation<String> evaluation : evaluations) {
            System.out.println(evaluation);
        }

        // Calculating and printing the average rating
        double averageRating = Evaluation.calculateAverageRating(evaluations);
        System.out.println("\nAverage rating: " + averageRating);
    }
}
