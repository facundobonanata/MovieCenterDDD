package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;

import java.util.UUID;

public class UpdatedNameManager extends DomainEvent {
    private final ManagerId managerId;
    private final Name name;
    private final CinemaId cinemaId;

    public UpdatedNameManager(ManagerId managerId, Name name, CinemaId cinemaId) {
        super("com.movie.ddd.MovieDDD.cinema.updatednamemanager");
        this.managerId = managerId;
        this.name = name;
        this.cinemaId = cinemaId;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public Name getName() {
        return name;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
