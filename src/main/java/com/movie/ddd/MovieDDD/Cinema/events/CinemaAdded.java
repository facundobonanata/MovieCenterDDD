package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.Seat;

import java.util.Set;

public class CinemaAdded extends DomainEvent {
    private final CinemaId cinemaId;
    private final Name name;
    private final Set<Seat> seats;
    private final Movie movie;
    private final Manager manager;

    public CinemaAdded(CinemaId cinemaId, Name name, Set<Seat> seats,Movie movie, Manager manager) {
        super("com.movie.ddd.MovieDDD.cinema.cinemaadded");
        this.seats = seats;
        this.movie = movie;
        this.manager = manager;
        this.name = name;
        this.cinemaId = cinemaId;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }

    public Name getName() {
        return name;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public Movie getMovie() {
        return movie;
    }

    public Manager getManager() {
        return manager;
    }
}
