package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.Gender;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class UpdateGenderMovie extends Command {
    private final MovieId movieId;
    private final Gender gender;

    public UpdateGenderMovie(MovieId movieId, Gender gender) {
        this.movieId = movieId;
        this.gender = gender;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Gender getGender() {
        return gender;
    }
}
