package com.movie.ddd.MovieDDD.Cinema.entities;

import co.com.sofka.domain.generic.Entity;
import com.movie.ddd.MovieDDD.Cinema.values.*;

import java.util.Objects;

public class Movie extends Entity<MovieId> {
    protected Gender gender;
    protected Language language;
    protected MovieName movieName;


    public Movie(MovieId entityId){
        super(entityId);
    }
    public Movie(MovieId entityId, Gender gender, Language language, MovieName movieName) {
        super(entityId);
        this.gender = gender;
        this.language = language;
        this.movieName = movieName;
    }
    public void updateName(MovieName movieName){
        this.movieName = Objects.requireNonNull(movieName);
    }

    public void updateLanguage(Language language){
        this.language = Objects.requireNonNull(language);
    }

    public void updateGender(Gender gender){
        this.gender=Objects.requireNonNull(gender);
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

}
