package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.Gender;
import com.movie.ddd.MovieDDD.Cinema.values.Language;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class MovieAdded extends DomainEvent {
    private final MovieId movieId;
    private final Language language;
    private final Gender gender;

    public MovieAdded(MovieId movieId, Language language, Gender gender) {
        super("com.movie.ddd.MovieDDD.cinema.movieadded");
        this.movieId = movieId;
        this.language = language;
        this.gender = gender;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Language getLanguage() {
        return language;
    }

    public Gender getGender() {
        return gender;
    }
}
