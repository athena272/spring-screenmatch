package br.com.alura.spring_screenmatch.challenges.challenge03;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.replaceAll(n -> n * 3);
        System.out.println(numbers);

        List<String> names = Arrays.asList("Lucas", "Maria", "João", "Ana");
        names.sort((a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}
