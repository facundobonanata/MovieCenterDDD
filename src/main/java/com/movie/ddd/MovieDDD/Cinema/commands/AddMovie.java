package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.Gender;
import com.movie.ddd.MovieDDD.Cinema.values.Language;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class AddMovie extends Command {
    private final MovieId movieId;
    private final Gender genderM;
    private final Language language;

    public AddMovie(MovieId movieId, Gender genderM, Language language) {
        this.movieId = movieId;
        this.genderM = genderM;
        this.language = language;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Gender getGenderM() {
        return genderM;
    }

    public Language getLanguage() {
        return language;
    }
}

