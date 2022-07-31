package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.values.Capacity;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;

import java.util.Set;

public class AddCinema extends Command {


    private final Capacity capacity;
    private final Set<Seat> seats;
    private final CinemaId cinemaId;


    public AddCinema(CinemaId cinemaId, Capacity capacity, Set<Seat> seats) {
        this.seats =seats;
        this.capacity = capacity;
        this.cinemaId = cinemaId;
    }


    public Capacity getCapacity() {
        return capacity;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
