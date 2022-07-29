package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Description;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class UpdateDescription extends Command {
    private final CinemaId cinemaId;
    private final MovieId movieId;
    private final Description description;

    public UpdateDescription(CinemaId cinemaId, MovieId movieId, Description description) {
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.description = description;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Description getDescription() {
        return description;
    }
}
