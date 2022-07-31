package com.movie.ddd.MovieDDD.Cinema.commands;

import co.com.sofka.domain.generic.Command;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.values.CinemaId;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

public class UpdateNameManager extends Command {
    private final CinemaId cinemaId;

    private final ManagerId managerId;
    private final NameManager nameManager;

    public UpdateNameManager(CinemaId cinemaId, ManagerId managerId,NameManager nameManager) {
        this.nameManager = nameManager;
        this.managerId = managerId;
        this.cinemaId = cinemaId;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public NameManager getNameManager() {
        return nameManager;
    }

    public CinemaId getCinemaId() {
        return cinemaId;
    }
}
