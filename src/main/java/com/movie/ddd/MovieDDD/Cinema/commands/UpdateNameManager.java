package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;

public class UpdateNameManager extends Command {
    private final ManagerId managerId;
    private final Name name;
    private final CinemaId cinemaId;

    public UpdateNameManager(ManagerId managerId, Name name, CinemaId cinemaId) {
        this.managerId = managerId;
        this.name = name;
        this.cinemaId = cinemaId;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public Name getName() {
        return name;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
