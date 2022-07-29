package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.Gender;
import com.movie.ddd.MovieDDD.Cinema.values.Language;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

import java.util.Objects;

public class Movie extends Entity<MovieId> {
    private Gender gender;
    private Language language;

    public Movie(MovieId entityId, Gender gender, Language language) {
        super(entityId);
        this.gender = gender;
        this.language = language;
    }


    public Gender gender() {
        return gender;
    }

    public Language language() {
        return language;
    }
}
