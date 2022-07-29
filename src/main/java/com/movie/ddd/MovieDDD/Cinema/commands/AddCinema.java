package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.entities.Movie;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.Seat;

import java.util.Set;

public class AddCinema extends Command {


    private final Name name;
    private final Set<Seat> seats;
    private final Movie movie;
    private final Manager manager;
    private final CinemaId cinemaId;


    public AddCinema(CinemaId cinemaId,Name name, Set<Seat> seats, Movie movie,Manager manager) {
        this.name =name;
        this.seats = seats;
        this.movie = movie;
        this.manager = manager;
        this.cinemaId = cinemaId;
    }


    public Name getName() {
        return name;
    }
    public CinemaId getCinemaId() {
        return cinemaId;
    }
    public Manager getManager() {
        return manager;
    }
    public Set<Seat> getSeats() {
        return seats;
    }

    public Movie getMovie() {
        return movie;
    }


}
