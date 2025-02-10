package br.com.alura.spring_screenmatch.challenges.challenge01;
import br.com.alura.spring_screenmatch.challenges.challenge01.models.Box;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Saving text in my box!");
        System.out.println(stringBox.sumContent("One more line"));
        System.out.println("--------------------------------------------");

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(30);
        System.out.println(integerBox.sumContent(26));
        System.out.println("--------------------------------------------");

        Box<Double> doubleBox = new Box<>();
        doubleBox.setContent(150.50);
        System.out.println(doubleBox.sumContent(350.50));
        System.out.println("--------------------------------------------");
    }
}
