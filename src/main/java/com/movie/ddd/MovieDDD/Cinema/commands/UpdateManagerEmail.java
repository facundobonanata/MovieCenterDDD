package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.Email;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;

public class UpdateManagerEmail extends Command {
    private final Email email;
    private final ManagerId managerId;
    private final CinemaId cinemaId;

    public UpdateManagerEmail(Email email, ManagerId managerId, CinemaId cinemaId) {
        this.email = email;
        this.managerId = managerId;
        this.cinemaId = cinemaId;
    }

    public Email getEmail() {
        return email;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
