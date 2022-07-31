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

    public AddMovie(MovieId movieId, MovieName movieName, CinemaId cinemaId, Gender gender, Language language) {
        this.gender = gender;
        this.language = language;
        this.movieName=movieName;
        this.cinemaId=cinemaId;
        this.movieId=movieId;
    }


    public Gender getGender() {
        return gender;
    }

    public Language getLanguage() {
        return language;
    }


    public MovieName getMovieName() {
        return movieName;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }

    public MovieId getMovieId() {
        return movieId;
    }
}

