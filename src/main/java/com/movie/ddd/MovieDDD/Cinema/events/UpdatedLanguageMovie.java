package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Language;
import com.movie.ddd.MovieDDD.Cinema.values.MovieId;

public class UpdatedLanguageMovie extends DomainEvent {
    private final MovieId movieId;
    private final Language language;

    public UpdatedLanguageMovie(MovieId movieId, Language language) {
        super("com.movie.ddd.MovieDDD.cinema.updatedlanguagemovie");
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
