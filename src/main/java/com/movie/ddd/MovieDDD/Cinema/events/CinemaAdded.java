package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.entities.Seat;

import java.util.Set;

public class CinemaAdded extends DomainEvent {
    private final Set<Seat> seats;
    private final String manager;
    private final Movie movie;

    public CinemaAdded(Set<Seat> seats, Movie movie, String manager) {
        super("com.movie.ddd.MovieDDD.cinema.CinemaAdded");
        this.seats = seats;
        this.manager=manager;
        this.movie=movie;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public String getManager() {
        return manager;
    }

    public Movie getMovie() {
        return movie;
    }
}
