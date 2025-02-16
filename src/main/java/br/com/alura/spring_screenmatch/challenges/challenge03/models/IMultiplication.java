package br.com.alura.spring_screenmatch.challenges.challenge03.models;

@FunctionalInterface
interface IMultiplication {
    int multiply(int a, int b);
}

class LambdaExercisesMultiplication {
    public static void main(String[] args) {
        IMultiplication multiplication = (a, b) -> a * b;
        System.out.println(multiplication.multiply(5, 3));
    }
}