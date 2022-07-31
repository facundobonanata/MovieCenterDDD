package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Email;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;

public class UpdatedEmailManager extends DomainEvent {
    private final ManagerId managerId;
    private final Email email;
    private final CinemaId cinemaId;

    public UpdatedEmailManager(ManagerId managerId, Email email, CinemaId cinemaId) {
        super("com.movie.ddd.MovieDDD.cinema.updatedemailmanager");
        this.managerId = managerId;
        this.email = email;
        this.cinemaId = cinemaId;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public Email getEmail() {
        return email;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
