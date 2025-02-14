package br.com.alura.spring_screenmatch.challenges.challenge01;
import br.com.alura.spring_screenmatch.challenges.challenge01.models.Box;
import br.com.alura.spring_screenmatch.challenges.challenge01.models.Person;

import java.util.List;

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

        Person amanda = new Person("Amanda", 18);
        amanda.checkObject(amanda);
        System.out.println("--------------------------------------------");

        List<Object> objects = List.of(42, "Java", 3.14, "Spring Boot");
        for (Object object : objects) {
            if (object instanceof Integer i) {
                System.out.println("Doubled integer: " +  (i * 2));
            } else if (object instanceof String s) {
                System.out.println("Uppercase text: " + s.toUpperCase());
            } else if(object instanceof Double d) {
                System.out.println("Double number sum: " + (d + 1.5));
            }
        }
    }
}
