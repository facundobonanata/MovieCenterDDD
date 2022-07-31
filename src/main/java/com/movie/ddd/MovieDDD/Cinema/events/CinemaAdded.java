package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;
import com.movie.ddd.MovieDDD.Cinema.values.Capacity;

import java.util.Set;


public class CinemaAdded extends DomainEvent {
    private final Capacity capacity;
    private final Set<Seat> seats;

    public CinemaAdded(Capacity capacity, Set<Seat> seats) {
        super("com.movie.ddd.MovieDDD.cinema.cinemaadded");
        this.capacity = capacity;
        this.seats = seats;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public Set<Seat> getSeats() {
        return seats;
    }
}
