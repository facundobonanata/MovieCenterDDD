package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.Cinema;
import com.movie.ddd.MovieDDD.Cinema.values.*;

public class AddMovie extends Command {
    private final Gender gender;
    private final Language language;
    private final MovieName movieName;

    public AddMovie(MovieName movieName, Gender gender, Language language) {
        this.gender = gender;
        this.language = language;
        this.movieName=movieName;
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

