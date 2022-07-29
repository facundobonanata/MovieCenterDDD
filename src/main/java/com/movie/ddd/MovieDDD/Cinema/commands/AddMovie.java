package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.Description;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class AddMovie extends Command {
    private final MovieId movieId;
    private final Description description;

    public AddMovie(MovieId movieId, Description description) {
        this.movieId = movieId;
        this.description = description;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Description getDescription() {
        return description;
    }
}

