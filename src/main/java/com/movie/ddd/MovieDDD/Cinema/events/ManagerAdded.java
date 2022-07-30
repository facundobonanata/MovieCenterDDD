package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.entities.Manager;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;
import com.movie.ddd.MovieDDD.Cinema.values.NameManager;

public class ManagerAdded extends DomainEvent {
    private final ManagerId managerId;
    private final NameManager nameManager;

    public ManagerAdded(ManagerId managerId, NameManager nameManager) {
        super("com.movie.ddd.MovieDDD.cinema.manageradded");
        this.managerId = managerId;
        this.nameManager = nameManager;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public NameManager getNameManager() {
        return nameManager;
    }
}
