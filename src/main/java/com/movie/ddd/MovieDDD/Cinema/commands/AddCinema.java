package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;

public class AddCinema extends Command {
    private final CinemaId entityId;
    private final String manager;
    private final String seats;

    public AddCinema(String cinemaId, String seats, String manager) {
        this.entityId = CinemaId.of(cinemaId);
        this.seats = seats;
        this.manager=manager;
    }

    public CinemaId getCinemaId() {
        return entityId;
    }

    public String getSeats() {
        return seats;
    }

    public String getManager() {
        return manager;
    }
}

