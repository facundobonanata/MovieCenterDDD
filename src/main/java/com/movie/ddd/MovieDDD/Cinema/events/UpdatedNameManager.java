package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

import java.util.UUID;

public class UpdatedNameManager extends DomainEvent {

    private final NameManager nameManager;

    public UpdatedNameManager(NameManager nameManager) {
        super("com.movie.ddd.MovieDDD.cinema.updatednamemanager");
        this.nameManager = nameManager;
    }

    public NameManager getNameManager() {
        return nameManager;
    }

}
