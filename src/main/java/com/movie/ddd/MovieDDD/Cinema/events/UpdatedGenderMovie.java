package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Gender;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class UpdatedGenderMovie extends DomainEvent {
    private final MovieId movieId;
    private final Gender gender;

    public UpdatedGenderMovie(MovieId movieId, Gender gender) {
        super("com.movie.ddd.MovieDDD.cinema.updatedgendermovie");
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
