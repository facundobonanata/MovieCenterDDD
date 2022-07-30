package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.values.Capacidad;

import java.util.Set;


public class CinemaAdded extends DomainEvent {
    private final Capacidad capacidad;
    private final Set<Seat> seats;

    public CinemaAdded(Capacidad capacidad, Set<Seat> seats) {
        super("com.movie.ddd.MovieDDD.cinema.cinemaadded");
        this.capacidad = capacidad;
        this.seats = seats;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public Set<Seat> getSeats() {
        return seats;
    }
}
