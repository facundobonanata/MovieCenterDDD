package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Language;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class UpdateLanguageMovie extends Command {
    private final MovieId movieId;
    private final Language language;

    public UpdateLanguageMovie(MovieId movieId, Language language, CinemaId cinema) {
        this.movieId = movieId;
        this.language = language;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Language getLanguage() {
        return language;
    }
}
