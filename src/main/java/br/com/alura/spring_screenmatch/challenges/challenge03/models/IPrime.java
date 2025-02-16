package br.com.alura.spring_screenmatch.challenges.challenge03.models;

@FunctionalInterface
interface IPrime {
    boolean isPrime(int n);
}

class LambdaExercisesPrime {
    public static void main(String[] args) {
        IPrime prime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        System.out.println(prime.isPrime(11));  // Output: true
        System.out.println(prime.isPrime(12));  // Output: false
    }
}