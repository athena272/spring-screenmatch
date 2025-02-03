package br.com.alura.spring_screenmatch.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieData(@JsonAlias("Title") String title, @JsonAlias("totalSeasons") Integer totalSeasons, @JsonAlias("imdbRating") String rating) {
}
