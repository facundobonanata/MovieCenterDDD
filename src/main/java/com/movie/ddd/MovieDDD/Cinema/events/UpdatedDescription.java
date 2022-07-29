package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.Description;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class UpdatedDescription extends DomainEvent {
    private final MovieId movieId;
    private final Description description;

    public UpdatedDescription(MovieId movieId, Description description) {
        super("com.movie.ddd.MovieDDD.cinema.UpdatedDescription");
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
