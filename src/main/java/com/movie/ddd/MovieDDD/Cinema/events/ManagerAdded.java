package com.movie.ddd.MovieDDD.Cinema.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.movie.ddd.MovieDDD.Cinema.values.ManagerId;
import com.movie.ddd.MovieDDD.Cinema.values.Name;

public class ManagerAdded extends DomainEvent {
    private final ManagerId managerId;
    private final Name name;

    public ManagerAdded(ManagerId managerId, Name name) {
        super("com.movie.ddd.MovieDDD.cinema.ManagerAdded");
        this.managerId = managerId;
        this.name = name;
    }

    public ManagerId getManagerId() {
        return managerId;
    }

    public Name getName() {
        return name;
    }
}
