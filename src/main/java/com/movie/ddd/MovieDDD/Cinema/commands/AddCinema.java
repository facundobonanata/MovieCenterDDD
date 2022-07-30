package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.values.Capacidad;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;

import java.util.Set;

public class AddCinema extends Command {


    private final Capacidad capacidad;
    private final Set<Seat> seats;
    private final CinemaId cinemaId;


    public AddCinema(CinemaId cinemaId, Capacidad capacidad, Set<Seat> seats) {
        this.seats =seats;
        this.capacidad = capacidad;
        this.cinemaId = cinemaId;
    }


    public Capacidad getCapacidad() {
        return capacidad;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
