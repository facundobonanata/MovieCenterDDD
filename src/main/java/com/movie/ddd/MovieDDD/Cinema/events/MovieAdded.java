package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.Gender;
import com.movie.ddd.MovieDDD.Cinema.values.Language;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;
import com.movie.ddd.MovieDDD.Cinema.values.MovieName;

public class MovieAdded extends DomainEvent {
    private final Language language;
    private final Gender gender;
    private final MovieName movieName;
    private final MovieId movieId;

    public MovieAdded(MovieId movieId, MovieName movieName, Language language, Gender gender) {
        super("com.movie.ddd.MovieDDD.cinema.movieadded");

        this.language = language;
        this.gender = gender;
        this.movieName=movieName;
        this.movieId=movieId;


    }

    public Language getLanguage() {
        return language;
    }

    public Gender getGender() {
        return gender;
    }

    public MovieName getMovieName() {
        return movieName;
    }

    public MovieId getMovieId() {
        return movieId;
    }
}

