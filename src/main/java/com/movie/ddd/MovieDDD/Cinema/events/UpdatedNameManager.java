package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;

import java.util.UUID;

public class UpdatedNameManager extends DomainEvent {
    private final Name name;

    public UpdatedNameManager(Name name) {
        super("com.movie.ddd.MovieDDD.cinema.updatednamemanager");
        this.name = name;
    }

    public Name getName() {
        return name;
    }

}
