package br.com.alura.spring_screenmatch.challenges.challenge03.models;

@FunctionalInterface
public interface ITransformer {
    String transform(String s);
}

class MainTransformer {
    public static void main(String[] args) {
        ITransformer toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transform("java")); // Expected: "JAVA"
    }
}