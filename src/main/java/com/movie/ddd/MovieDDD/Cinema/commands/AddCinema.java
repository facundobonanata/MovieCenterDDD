package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;

import java.util.Set;

public class AddCinema extends Command {
    private final CinemaId entityId;
    private final Manager manager;
    private final Set<Seat> seats;

    public AddCinema(CinemaId cinemaId, Set<Seat> seats, Manager manager) {
        this.entityId = cinemaId;
        this.seats = seats;
        this.manager=manager;
    }

    public CinemaId getCinemaId() {
        return entityId;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public Manager getManager() {
        return manager;
    }
}

