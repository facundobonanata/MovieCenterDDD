package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Bill.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

public class AddManager extends Command {
    private final CinemaId cinemaId;
    private final NameManager nameManager;

    public AddManager(CinemaId cinemaId, NameManager nameManager) {
        this.cinemaId = cinemaId;
        this.nameManager = nameManager;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }

    public NameManager getNameManager() {
        return nameManager;
    }
}

