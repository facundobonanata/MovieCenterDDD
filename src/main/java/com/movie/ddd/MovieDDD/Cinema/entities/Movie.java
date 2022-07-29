package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.Description;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class Movie extends Entity<MovieId> {
    private Description description;

    public Movie(MovieId entityId, Description description) {
        super(entityId);
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
