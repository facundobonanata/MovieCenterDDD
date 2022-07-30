package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.values.*;

public class AddMovie extends Command {
    private final CinemaId cinemaId;
    private final Gender gender;
    private final Language language;
    private final MovieName movieName;
    private final MovieId movieId;

    public AddMovie(MovieId movieId, CinemaId cinemaId, MovieName movieName, Gender gender, Language language) {
        this.gender = gender;
        this.language = language;
        this.cinemaId=cinemaId;
        this.movieName=movieName;
        this.movieId=movieId;
    }


    public Gender getGender() {
        return gender;
    }

    public Language getLanguage() {
        return language;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }

    public MovieName getMovieName() {
        return movieName;
    }

    public MovieId getMovieId() {
        return movieId;
    }
}

