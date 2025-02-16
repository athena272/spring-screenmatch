package br.com.alura.spring_screenmatch.challenges.challenge03.models;

@FunctionalInterface
interface IDivider {
    int divide(int a, int b) throws ArithmeticException;
}

class MainDivider {
    public static void main(String[] args) {
        IDivider divider = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Division by zero");
            return a / b;
        };

        try {
            System.out.println(divider.divide(10, 2)); // Expected: 5
            System.out.println(divider.divide(10, 0)); // Expected: Exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}