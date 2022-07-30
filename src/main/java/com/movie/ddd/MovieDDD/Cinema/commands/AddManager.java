package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Email;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

public class AddManager extends Command {
    private final CinemaId cinemaId;
    private final ManagerId entityId;
    private final NameManager nameManager;
    private final Email email;

    public AddManager(CinemaId cinemaId, ManagerId entityId, NameManager nameManager, Email email) {
        this.cinemaId = cinemaId;
        this.nameManager = nameManager;
        this.entityId=entityId;
        this.email=email;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }

    public NameManager getNameManager() {
        return nameManager;
    }

    public ManagerId getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}

