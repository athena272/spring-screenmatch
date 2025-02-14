package br.com.alura.spring_screenmatch.challenges.challenge02.models;

import java.util.List;

public class Evaluation<T> {
    private T item;
    private double rating;
    private String comment;

    public Evaluation(T item, double rating, String comment) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("The rating must be between 0 and 10.");
        }
        this.item = item;
        this.rating = rating;
        this.comment = comment;
    }

    public T getItem() {
        return item;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("The rating must be between 0 and 10.");
        }
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static <T> double calculateAverageRating(List<Evaluation<T>> evaluations) {
        if (evaluations.isEmpty()) {
            throw new IllegalArgumentException("The evaluation list is empty.");
        }
        double sum = 0;
        for (Evaluation<T> evaluation : evaluations) {
            sum += evaluation.getRating();
        }
        return sum / evaluations.size();
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "item=" + item +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
