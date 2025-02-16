package br.com.alura.spring_screenmatch.challenges.challenge03.models;

@FunctionalInterface
interface IPalindrome {
    boolean isPalindrome(String str);
}

class MainPalindrome {
    public static void main(String[] args) {
        IPalindrome palindrome = str -> str.equals(new StringBuilder(str).reverse().toString());

        System.out.println(palindrome.isPalindrome("radar"));  // Output: true
        System.out.println(palindrome.isPalindrome("java"));   // Output: false
    }
}